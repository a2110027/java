import javax.swing.*;
import javax.swing.event.*; 
import java.awt.*;
import java.awt.event.*;

class ColorPanel extends JPanel implements ChangeListener{
  public ColorPanel() {
      this(Color.white);
      JSlider sl=new JSlider(JSlider.HORIZONTAL,0,255,0);
      sl.setPaintTicks(true);
      sl.setMajorTickSpacing(50);
      sl.setMinorTickSpacing(10);
      sl.setLabelTable(sl.createStandardLabels(50));
      sl.setPaintLabels(true);
  }
  public ColorPanel(Color c) {
      setColor(c);
      setPreferredSize(new Dimension(200,150));
  }
  public void setColor(Color c) {
      setBackground(c);
  }
  public Color getColor() {
      return getBackground();
  }
  public void stateChanged(ChangeEvent arg0) {
    
  }
}

class ColorFrame extends JFrame {
  public ColorFrame(){
    Color initColor = Color.pink;
    ColorPanel c = new ColorPanel(initColor);
    this.setTitle("TestFrame");

    this.add(c,BorderLayout.CENTER);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
  public static void main(String argv[]) {
    new ColorFrame();
  }
}
