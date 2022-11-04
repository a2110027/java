/* import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CirclePanel extends JPanel implements MouseListener,MouseMotionListener {
  private int radius =5;         // 円の半径
  private Color color=Color.red; // 円の色
  private int   x[],y[],r[];     // すべての丸の位置と半径を記録する位置を配列
  private Color c[];             // 丸の色を記録するColorクラス型の配列
  private int   num=0;           // 今まで記録した丸の数
  final static int MAX=5000;     // 記録できる丸の最大数 (定数)

  public CirclePanel(){
    x=new int[MAX];
    y=new int[MAX];
    r=new int[MAX];
    c=new Color[MAX];
    this.addMouseListener(this);
    this.addMouseMotionListener(this);
  }
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for(int i=0;i<num;i++){
      g.setColor(c[i]);
      g.fillOval(x[i]-r[i],y[i]-r[i],r[i]*2,r[i]*2);
    }
  }
  private void addCircle(int x0,int y0){
    if (num>=MAX) return; 
    x[num]=x0; y[num]=y0;
    r[num]=radius; c[num]=color;
    num++;
    this.repaint();
  }

  public void mousePressed(MouseEvent e) {
    addCircle(e.getX(),e.getY());
  }
  public void mouseClicked(MouseEvent e) { }
  public void mouseReleased(MouseEvent e){ }
  public void mouseEntered(MouseEvent e) { }
  public void mouseExited(MouseEvent e)  { }

  public void mouseDragged(MouseEvent e) {     
    addCircle(e.getX(),e.getY());
  }
  public void mouseMoved(MouseEvent e) { }

  void setRadius(int r){
    radius = r;
  }

  void setPanelColor(Color c){
    color = c;
  }
}

class CircleFrame extends JFrame implements ActionListener{
  private CirclePanel panel;
  JPanel  p1=new JPanel(),p2=new JPanel();
  private JButton b1 = new JButton("Radius = 5");
  private JButton b2 = new JButton("Radius = 10");
  private JButton b3 = new JButton("Blue");
  private JButton b4 = new JButton("Red");
  private JButton b5 = new JButton("Yellow");
  
  public CircleFrame(){
      this.setTitle("CircleFrame");
      this.setSize(500,500);
      panel=new CirclePanel();
      this.add(panel, BorderLayout.CENTER);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      p1.setLayout(new GridLayout(2,1));
      p2.setLayout(new GridLayout(3,1));
      p1.add(b1); p1.add(b2); p2.add(b3); p2.add(b4); p2.add(b5);
      this.add(p1,BorderLayout.EAST);
      this.add(p2,BorderLayout.WEST);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
      if (e.getSource()==b1){
        panel.setRadius(5); //... Button 1に対する処理
      }else if (e.getSource()==b2){
        panel.setRadius(10); //... Button 2に対する処理
      }else if (e.getSource()==b3){
        panel.setPanelColor(Color.blue); //... Button 3に対する処理
      } else if(e.getSource() == b4){
        panel.setPanelColor(Color.red);
      } else if(e.getSource() == b5){
        panel.setPanelColor(Color.yellow);
      }
    }

    public static void main(String argv[]) {
      new CircleFrame();  
   }
} */