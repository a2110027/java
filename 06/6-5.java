import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HelloLabelFrame extends JFrame implements ActionListener { 
    private JLabel label;
    private Timer timer;

    public HelloLabelFrame(){
      this.setSize(300,200);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton b = new JButton("<html><span style='font-size:36pt; color:black; "+"background-color:yellow;'>おみくじ</span></html>");
      
      this.add(b,BorderLayout.SOUTH);
      label = new JLabel(" ",JLabel.CENTER);
      this.add(label,BorderLayout.CENTER);
      b.addActionListener(this);
      this.setVisible(true);
      timer = new Timer(1000, this); // 1秒毎にactionPerformedを呼び出し
       timer.start(); // タイマーをスタート．一度，スタートすると，stopメソッドを
    }
    public void actionPerformed(ActionEvent ev) {
      double r = Math.random();
      r = Math.random();
      if(r > 0.7){
        label.setText("<html><span style='font-size:25pt; color:orange; "+"background-color:yellow;'>good</span></html>");
      }else if(r > 0.2){
        label.setText("<html><span style='font-size:25pt; color:blue; "+"background-color:yellow;'>so so</span></html>");
      }else{
        label.setText("<html><span style='font-size:25pt; color:purple; "+"background-color:yellow;'>bad</span></html>");
      }

    }
    public static void main(String argv[]) {
      new HelloLabelFrame();
    }
}
