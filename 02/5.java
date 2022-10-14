class Kadai5 {
  private String id;    // 学籍番号
  private String name;  // 名前
  private int grade;    // 成績
  
  public Kadai5(String id,String name,int grade){
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
    if(grade > 100){
      this.grade = 100;
    }else if(grade < 0){
      this.grade = 0;
    }else{
      this.grade = grade;
    }
  }
  String getId(){
    return id;
    }
}

class main5 {
  public static void main(String argv[]){
    Kadai5 st  = new Kadai5("0110", "Suzuki", 150);
    Kadai5 st2 = new Kadai5("01111","Yamada", -50 );
    st.print();       
    st2.print();
  }
}
