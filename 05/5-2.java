/* //  1番目
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ButtonPanel extends JPanel implements ActionListener{
  // label は，Button1Listener から参照できるようにします．
  // 内部クラスからは，そのクラスを含んでいる外部のクラスの
  // Privateフィールドをアクセスできます．
  private JLabel label; 
  private JButton b1 = new JButton();
  private JButton b2 = new JButton();
  private JButton b3 = new JButton();
  ButtonPanel(){
    b1 = new JButton("Button 1");
    b2 = new JButton("Button 2");
    b3 = new JButton("Button 3");
    label =  new JLabel("0",JLabel.CENTER);
    setLayout(new GridLayout(2,2));
    add(b1); add(b2); add(b3); add(label);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e){
    if (e.getSource()==b1){
      label.setText("1"); //... Button 1に対する処理
    }else if (e.getSource()==b2){
      label.setText("2"); //... Button 2に対する処理
    }else if (e.getSource()==b3){
      label.setText("3"); //... Button 3に対する処理
    } 
  }
}
class TestButton extends JFrame{
  public TestButton(){
    ButtonPanel b=new ButtonPanel();
    this.setTitle("Test Button");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(b);
    this.pack();
    this.setVisible(true);
  }
  public static void main(String argv[]) {
    new TestButton();
  }
} */

/* 
//  2番目
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ButtonPanel extends JPanel implements ActionListener{
  // label は，Button1Listener から参照できるようにします．
  // 内部クラスからは，そのクラスを含んでいる外部のクラスの
  // Privateフィールドをアクセスできます．
  private JLabel label; 
  private JButton b1 = new JButton("Button 1");
  private JButton b2 = new JButton("Button 2");
  private JButton b3 = new JButton("Button 3");
  ButtonPanel(){
    b1.setActionCommand("1");
    b2.setActionCommand("2");
    b3.setActionCommand("3");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    label =  new JLabel("0",JLabel.CENTER);
    setLayout(new GridLayout(2,2));
    add(b1); add(b2); add(b3); add(label);
  }
  public void actionPerformed(ActionEvent e){
    String es=e.getActionCommand();
    if (es.equals("1")){
      label.setText("1");//... Button 1に対する処理
    } 
    else if (es.equals("2")) {
      label.setText("2");//... Button 1に対する処理
    }
    else if (es.equals("3")){
      label.setText("3");//... Button 1に対する処理
    }
  }
}
class TestButton extends JFrame{
  public TestButton(){
    ButtonPanel b=new ButtonPanel();
    this.setTitle("Test Button");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(b);
    this.pack();
    this.setVisible(true);
  }
  public static void main(String argv[]) {
    new TestButton();
  }
}
 */