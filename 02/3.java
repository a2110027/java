class Kadai3 {
  private String id;    // 学籍番号
  private String name;  // 名前
  private int grade;    // 成績

  void print() {
    System.out.println("ID   : "+id);  
    System.out.println("Name : "+name);
    System.out.println("Grade: "+grade);
  }
  void setId(String id){
    this.id=id;
  }
  void setName(String name){
    this.name=name;
  }
  void setGrade(int grade){
    this.grade=grade;
  }
  void set(String id, String name, int grade){
    this.id = id;
    this.name = name;
    this.grade = grade;
  }
  String getId(){
    return id;
    }
}

class main3 {
  public static void main(String argv[]){
    Kadai3 st  = new Kadai3();
    Kadai3 st2 = new Kadai3();
    st.set("01110", "Suzuki", 100);
    st2.set("01111", "Yamada", 80);
    st.print();       
    st2.print();
  }
}
