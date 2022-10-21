
class Lesson {
  private String name;    // 授業名    
  private String teacher; // 担当者 
  private int max;        // 最大履修者数
  private int num;        // 登録履修者数
  private Student st[];   // Student class の配列

  public Lesson(String name,String teacher,int max){
    this.name=name;
    this.teacher=teacher;
    this.max=max;  
    this.num=0;          // num は 0 に初期化．
    st=new Student[max]; // 配列の確保(オブジェクトは別に生成する必要がある)
  }
  public void add(Student s) {
    st[this.num++] = s; 
  }

  public void print() {
    // ここに System.out.print や Studentオブジェクトの
    // 中身の表示(print_shortメソッドの呼び出し)を追加しましょう．
    System.out.println("Lesson   :"+name);
    System.out.println("Teacher  :" + teacher);
    System.out.println("#Students:" +max);
    for(int i = 0; i< max; i++){
      st[i].print_short();
    }
    System.out.println("----------");  
  }
  public void sort_id(){
    int i,j;
    for(i=max;i>1;i--){
      for(j=1;j<i;j++){
        String t1 = st[i].getId();
        String t2 = st[i-1].getId();
        if(t1.compareTo(t2) > 0){
//          String x = st[i].id;
          st[i-1] = st[i];
          //st[i] = x;
        }
      }
    }
  }
}

class Student {
  String id;    // 学籍番号
  String name;  // 名前
  int grade;    // 成績

  public Student(String id,String name,int grade){
    this.id=id; this.name=name; 
    if(grade > 100){
      this.grade = 100;
    }else if(grade < 0){
      this.grade = 0;
    }else{
      this.grade = grade;
    }
  }
  void print() {
    System.out.println("ID   : "+id);  
    System.out.println("Name : "+name);
    System.out.println("Grade: "+grade);
  }
  
  public void print_short() {
    System.out.println(id+","+this.name+","+this.grade);  
  }
  
  String getId()   { return this.id;    }
  String getName() { return this.name;  }
  int    getGrade(){ return this.grade; }

}


class main7{
  public static void main(String argv[]){
    Lesson pro = new Lesson("Pro Enshu","Yanai",3);
    pro.add(new Student("012200","Dentsu Taro",80));
    pro.add(new Student("012205","Uec Jiro",54));
    pro.add(new Student("012207","Chofu Saburo",70));
    pro.print();
  }
}
