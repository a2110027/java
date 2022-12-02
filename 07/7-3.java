import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;
 
// 描画した図形を記録する Figure クラス (継承して利用する)
abstract class Figure {
  protected int x,y,width,height;
  protected Color color;
  public Figure(int x,int y,int w,int h,Color c) {
    this.x = x; this.y = y;  // this.x, this.y はインスタンス変数を指します．
    width = w; height = h;   // ローカル変数で同名の変数がある場合は，this
    color = c;               // を付けると，インスタンス変数を指すことになります．
  }
  public void setSize(int w,int h) {
    width = w; height = h;
  }
  public void setLocation(int x,int y) {
    this.x = x; this.y = y;
  }
  public void reshape(int x1,int y1,int x2,int y2) {
    int newx = Math.min(x1,x2);
    int newy = Math.min(y1,y2);
    int neww = Math.abs(x1-x2);
    int newh = Math.abs(y1-y2);
    setLocation(newx,newy);
    setSize(neww,newh);
  }
  abstract public void draw(Graphics g);
}
 
class RectangleFigure extends Figure {
  public RectangleFigure(int x,int y,int w,int h,Color c) {
    super(x,y,w,h,c);
    // 引数付きのコンストラクタは継承されないので，コンストラクタを定義．
    // superで親のコンストラクタを呼び出すだけ．
  }
  public void draw(Graphics g) {
    g.setColor(color);
    g.drawRect(x,y,width,height);
  }
}
////////////////////////////////////////////////
// Model (M)
 
// modelは java.util.Observableを継承する．Viewに監視される．
class DrawModel extends Observable{
  protected ArrayList<Figure> fig;
  protected Figure drawingFigure;
  protected Color currentColor;
  public DrawModel() {
    fig = new ArrayList<Figure>();
    drawingFigure = null;  // null は定数．C言語のNULLと同じで，何も入っていないという意味．
    currentColor = Color.red;  // 色はとりあえず赤で固定．容易に変更可能に拡張できます．
  }
  public ArrayList<Figure> getFigures() {
    return fig;
  }
  public Figure getFigure(int idx) {
    return fig.get(idx);
  }
  public void createFigure(int x,int y) {
    Figure f = new RectangleFigure(x,y,0,0,currentColor);
    fig.add(f);
    drawingFigure = f;
    setChanged();
    notifyObservers();
  }
  public void reshapeFigure(int x1,int y1,int x2,int y2) {
    if (drawingFigure != null) {
      drawingFigure.reshape(x1,y1,x2,y2);
      setChanged();
      notifyObservers();
    }
  }
}
 
////////////////////////////////////////////////
// View (V)
 
// Viewは，Observerをimplementsする．Modelを監視して，
// モデルが更新されたupdateする．実際には，Modelから
// update が呼び出される．
class ViewPanel extends JPanel implements Observer {
  protected DrawModel model;
  public ViewPanel(DrawModel m,DrawController c) {
    this.setBackground(Color.white);
    this.addMouseListener(c);
    this.addMouseMotionListener(c);
    model = m;
    model.addObserver(this);
  }
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for(Figure f:model.getFigures()){
      f.draw(g);
    }
  }
  public void update(Observable o,Object arg){
    repaint();
  }
}
 
//////////////////////////////////////////////////
// main class
//   (GUIを組み立てているので，view の一部と考えてもよい)
class DrawFrame extends JFrame {
  DrawModel model;
  ViewPanel view1,view2, view3,view4;
  DrawController cont;
   public DrawFrame(){
      model=new DrawModel();
      cont =new DrawController(model);
      view1=new ViewPanel(model,cont);
      view2=new ViewPanel(model,cont);
      view3=new ViewPanel(model,cont);
      view4=new ViewPanel(model,cont);
      this.setBackground(Color.black);
      this.setTitle("Draw Editor");
      this.setLayout(new GridLayout(2,2));
      this.setSize(1000,1000);
      this.add(view1);
      this.add(view2);
      this.add(view3);
      this.add(view4);
      view1.setBorder(new LineBorder(Color.blue,3));
      view2.setBorder(new LineBorder(Color.blue,3));
      view3.setBorder(new LineBorder(Color.blue,3));
      view4.setBorder(new LineBorder(Color.blue,3));
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    }
    public static void main(String argv[]) {
      new DrawFrame();
   }
}
 
////////////////////////////////////////////////
// Controller (C)
 
class DrawController implements MouseListener,MouseMotionListener {
  protected DrawModel model;
  protected int dragStartX,dragStartY;
  public DrawController(DrawModel a) {
    model = a;
  }
  public void mouseClicked(MouseEvent e) { }
  public void mousePressed(MouseEvent e) {
    dragStartX = e.getX(); dragStartY = e.getY();
    model.createFigure(dragStartX,dragStartY);
  }
  public void mouseDragged(MouseEvent e) {
    model.reshapeFigure(dragStartX,dragStartY,e.getX(),e.getY());
  }
  public void mouseReleased(MouseEvent e) { }
  public void mouseEntered(MouseEvent e) { }
  public void mouseExited(MouseEvent e) { }
  public void mouseMoved(MouseEvent e) { }
}