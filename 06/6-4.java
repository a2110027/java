import javax.swing.*;
import java.awt.*;
import java.util.*;

class Figure {
  protected int x,y,size;
  private final static Color cl[]={Color.RED, Color.BLUE, Color.GREEN, Color.BLACK};
  protected Color color;
  Figure() {
    color=cl[(int)(Math.random() * cl.length)];
    x = (int)(Math.random()*450);
    y = (int)(Math.random()*450);
    size=(int)(Math.random()*30+20);
  }
  void draw(Graphics g) {}
}

class Circle extends Figure {
  void draw(Graphics g) {
    g.setColor(color);
    g.drawOval(x,y,size,size);
  }
}

class Box extends Figure {
  void draw(Graphics g) {
    g.setColor(color);
    g.drawRect(x,y,size,size);
  }
}

class Triangle extends Figure {
  void draw(Graphics g) {
    g.setColor(color);
    g.drawLine(x, y, x+size, y);
    g.drawLine(x+size, y, x+size/2, y-size);
    g.drawLine(x+size/2, y-size, x, y);
  }
}

class Cross extends Figure {
  void draw(Graphics g) {
    g.setColor(color);
    g.drawLine(x, y, x+size, y+size);
    g.drawLine(x+size, y, x, y+size);
  }
}


class RandomPanel extends JPanel {
  private final static int NUM=50;
  private ArrayList<Figure> fig;
  RandomPanel(){
    fig=new ArrayList<Figure>();
    for(int i=0;i<NUM;i++){
      fig.add(new Box());
      fig.add(new Circle());
      fig.add(new Triangle());
      fig.add(new Cross());
    }
  }
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for(Figure f: fig){
      f.draw(g); 
    }
  }
}

class RandomFrame extends JFrame {
    public RandomFrame(){
      this.setTitle("Random Frame");
      this.setSize(500,530);
      this.add(new RandomPanel());
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    }
    public static void main(String argv[]) {
      new RandomFrame();
   }
}
