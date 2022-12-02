// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// import java.util.*;

// class StringObservable extends Observable {
//   private int value = 0;
//   public String getValue(int n) {
//     return Integer.toString(value+n);
//   }
//   public void setValue(String s,int n) {
//     value = Integer.parseInt(s)-n;
//     setChanged();
//     notifyObservers();
//   }
// }

// class TextFieldObserver extends JTextField implements Observer, ActionListener {
//   private StringObservable stringObservable;
//   private int no; // 何番目のTextFieldか？
//   public TextFieldObserver(StringObservable so,int n) {
//     no=n;
//     stringObservable = so;
//     stringObservable.addObserver(this);
//     this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,26)); // 文字を大きくします．
//     addActionListener(this);
//   }
//   public void update(Observable o,Object arg) {
//     String s = stringObservable.getValue(no);
//     setText(s);
//   }
//   public void actionPerformed(ActionEvent e) {
//    String s = getText();
//    stringObservable.setValue(s, no);
//   }
// }

// class ObserverFrame extends JFrame {
//     public ObserverFrame(){
//       this.setTitle("Observer Frame");
//       this.setLayout(new GridLayout(10,1));
//       StringObservable s = new StringObservable();
//       for (int i = 0; i < 10; i++) {
//         this.add(new TextFieldObserver(s, i));
//       }
//       s.setValue("10000", 0);
//       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       this.pack();
//       this.setVisible(true);
//     }
//     public static void main(String argv[]) {
//       new ObserverFrame();
//    }
// }
