/* import javax.swing.*;
import java.awt.*;
 
class NewFrame extends JFrame {
  public static final int EXIT_ON_CLOSE = 3;

    public NewFrame(){
      this.setTitle("NewFrame");
      this.setSize(300,200);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton b = new JButton("OK");
      this.add(b,BorderLayout.SOUTH);
      JLabel l = new JLabel("<html><span style='font-size:36pt; color:blue; "+"background-color:yellow;'>JLabel</span></html>",JLabel.CENTER);
      this.add(l,BorderLayout.NORTH);
      JLabel n = new JLabel("<html><span style='font-size:30t; color:red; "+"background-color:orange;'>MEDIA</span></html>",JLabel.CENTER);
      this.add(n,BorderLayout.EAST);
      JLabel m = new JLabel("<html><span style='font-size:30pt; color:red; "+"background-color:orange;'>I類</span></html>",JLabel.CENTER);
      this.add(m,BorderLayout.WEST);
      JLabel o = new JLabel("<html><span style='font-size:40pt; color:black; "+"background-color:green;'>JAVA</span></html>",JLabel.CENTER);
      this.add(o,BorderLayout.CENTER);

      this.setVisible(true);
    }
    public static void main(String argv[]) {
      new NewFrame();  // NewFrameオブジェクトを生成します．生成すると，
                       // コンストラクタ内の処理が自動的に実行されます．
   }
} */