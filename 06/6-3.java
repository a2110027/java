// import java.util.*;


// class Student {
//   private String id;    // 学籍番号
//   private String name;  // 名前
//   private int grade;    // 成績
 
//   public Student(String id,String name,int grade){
//     this.id=id; this.name=name; this.grade=grade;  
//     // grade は範囲チェックした方がよい．
//   }
//   public String getId(){
//     return id;
//   }
//   public void print_short() {
//     System.out.println(id+","+this.name+","+this.grade);  
//   }
// }

// class Lesson {
//   private String name;    // 授業名    
//   private String teacher; // 担当者 
//   private int num;        // 登録履修者数
//   private ArrayList<Student> st;   // Student class の配列
 
//   public Lesson(String name,String teacher,int max){
//     this.name=name;
//     this.teacher=teacher;
//     this.num=0;          // num は 0 に初期化．
//     st=new ArrayList<Student>(); // 配列の確保(オブジェクトは別に生成する必要がある)
//   }

//   public void add(Student s) {
//     String id0 = s.getId();
//     num++; 
//     for(int i = 0; i<st.size(); i++){
//       Student s0 = st.get(i);
//       if(id0.compareTo(s0.getId())<0){
//         add(i, s);
//         return;
//       }
//     }
//     st.add(s);
//   }

//   public void print() {
 
//     // ここに System.out.print や Studentオブジェクトの
//     // 中身の表示(print_shortメソッドの呼び出し)を追加しましょう．
//     System.out.println("Lesson   :"+name);
//     System.out.println("Teacher  :" + teacher);
//     for(String s:st){
//       s.print_short();
//     }
//     System.out.println("----------");  
//   }
// }    
// class main7{
//   public static void main(String argv[]){
//     Lesson pro = new Lesson("Pro Enshu","Yanai",3);
//     pro.add(new Student("012206","Dentsu Taro",80));
//     pro.add(new Student("012205","Uec Jiro",54));
//     pro.add(new Student("012207","Chofu Saburo",70));
//     pro.print();
//   }
// }
