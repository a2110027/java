class Student2 {
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

class main2 {
  public static void main(String argv[]){
    Student2 st  = new Student2();
    Student2 st2 = new Student2();
    st.setId("01110");
    st.setName("Suzuki");
    st.setGrade(100);
    st2.setId("01111");
    st2.setName("Yamada");
    st2.setGrade(80);
    st.print();       
    st2.print();
  }
}
