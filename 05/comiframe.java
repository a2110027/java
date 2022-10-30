import java.awt.*;
import javax.swing.*;
 
class CombiFrame extends JFrame {
  public CombiFrame(){
    // JPanelを２つ生成
    JPanel  p1=new JPanel(),p2=new JPanel();
    // JPanelに貼り付けるためのJButtonを5つ生成
    JButton b1=new JButton("1"),b2=new JButton("2");
    JButton b3=new JButton("3"),b4=new JButton("4");
    JButton b5=new JButton("5"),b6=new JButton("6");
    JButton b7=new JButton("7"),b8=new JButton("8");
    JButton b9=new JButton("9"),b10=new JButton("10");
    JButton b11=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>11</span></html>"), b12=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>12</span></html>");
    JButton b13=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>13</span></html>"),b14=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>14</span></html>");
    JButton b15=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>15</span></html>");
    // JFrame のCENTERに貼り付けるための複数行の文字入力の部品の
    // JTextArea を生成．
    JTextArea t=new JTextArea(10,20);

    this.setTitle("Panel Combination");
    // 2つのJPanelをそれぞれ，3x1, 2x1 のGridLayoutに設定．
    p1.setLayout(new GridLayout(1,10));
    p2.setLayout(new GridLayout(5,1));
    // ボタンをそれぞれのJPanelに貼付け
    p1.add(b1); p1.add(b2); p1.add(b3);p1.add(b4);p1.add(b5);p1.add(b6);p1.add(b7);p1.add(b8);p1.add(b9);p1.add(b10);
    p2.add(b11); p2.add(b12);p2.add(b13);p2.add(b14);p2.add(b15);
    
    // JButtonが3つ張り付いたJPanelを左，
    // JButtonが2つ張り付いたJPanelを右に貼り付ける．
    this.add(p1,BorderLayout.NORTH);
    this.add(p2,BorderLayout.WEST);
    // 真ん中は，JTextArea
    this.add(t,BorderLayout.CENTER);
 
    // pack は JFrameのサイズを自動設定するメソッド．
    // this.setSize(300,200); などの代わり
    this.pack(); 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
  public static void main(String argv[]) {
    new CombiFrame();
  }
}
