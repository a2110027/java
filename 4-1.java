 class Student3 extends Student {
      private String course; // コース名

      void print() {
        super.print();  // super で１つ上の親クラスのprint() を呼び出す．
        System.out.println("Course: "+course); // コース名の表示の追加 
      }
      void setCourse(String c){
        course=c;
      }
  }
  class Student4 extends Student3 {
    private String supervisor; // 指導教員名
    void print() {
      super.print();  // super で１つ上の親クラスのprint() を呼び出す．
      System.out.println("Supervisor: "+supervisor); // コース名の表示の追加 
    }
    void setSupervisor(String c){
      supervisor=c;
    }
}

  class Student {
      private String id;    // 学籍番号
      private String name;  // 名前
      private int grade;    // 成績
     
      void print() {
        System.out.println("ID   : "+id);  
        System.out.println("Name : "+name);
        System.out.println("Grade: "+grade);
      }
      void setId(String i){
        id=i;
      }
      void setName(String n){
        name=n;
      }
      void setGrade(int g){
        grade=g;
      }
  }

  class main {
    public static void main(String argv[]){
      Student3 st3 = new Student3();
      Student4 st4 = new Student4();
 
      st3.setId("2010001");      st3.setName("Dentu Taro");
      st3.setGrade(3);      st3.setCourse("メディア情報学");
 
      st4.setId("1910002");       st4.setName("Dentu Hanako");
      st4.setGrade(4);      st4.setCourse("経営情報学");
      st4.setSupervisor("Thofu Jiro");    // もう一つは，セキュリティ情報学
 
      System.out.println("[3年生]");
      st3.print();
      System.out.println("[4年生]");
      st4.print(); 
    }
}