import java.awt.*;
import javax.swing.*;
 
class CombiFrame extends JFrame {
  public CombiFrame(){
    // JPanel���Q����
    JPanel  p1=new JPanel(),p2=new JPanel();
    // JPanel�ɓ\��t���邽�߂�JButton��5����
    JButton b1=new JButton("1"),b2=new JButton("2");
    JButton b3=new JButton("3"),b4=new JButton("4");
    JButton b5=new JButton("5"),b6=new JButton("6");
    JButton b7=new JButton("7"),b8=new JButton("8");
    JButton b9=new JButton("9"),b10=new JButton("10");
    JButton b11=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>11</span></html>"), b12=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>12</span></html>");
    JButton b13=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>13</span></html>"),b14=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>14</span></html>");
    JButton b15=new JButton("<html><span style='font-size:12pt; color:blue; "+"background-color:yellow;'>15</span></html>");
    // JFrame ��CENTER�ɓ\��t���邽�߂̕����s�̕������͂̕��i��
    // JTextArea �𐶐��D
    JTextArea t=new JTextArea(10,20);

    this.setTitle("Panel Combination");
    // 2��JPanel�����ꂼ��C3x1, 2x1 ��GridLayout�ɐݒ�D
    p1.setLayout(new GridLayout(1,10));
    p2.setLayout(new GridLayout(5,1));
    // �{�^�������ꂼ���JPanel�ɓ\�t��
    p1.add(b1); p1.add(b2); p1.add(b3);p1.add(b4);p1.add(b5);p1.add(b6);p1.add(b7);p1.add(b8);p1.add(b9);p1.add(b10);
    p2.add(b11); p2.add(b12);p2.add(b13);p2.add(b14);p2.add(b15);
    
    // JButton��3����t����JPanel�����C
    // JButton��2����t����JPanel���E�ɓ\��t����D
    this.add(p1,BorderLayout.NORTH);
    this.add(p2,BorderLayout.WEST);
    // �^�񒆂́CJTextArea
    this.add(t,BorderLayout.CENTER);
 
    // pack �� JFrame�̃T�C�Y�������ݒ肷�郁�\�b�h�D
    // this.setSize(300,200); �Ȃǂ̑���
    this.pack(); 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
  public static void main(String argv[]) {
    new CombiFrame();
  }
}
