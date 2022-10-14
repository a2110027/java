class Omikuji {
  public static void main(String argv[]) {
    int val;
    double r;
    try{
      while(true){
        val = System.in.read();
        if (val!=10) continue;
//        処理 (乱数の生成，おみくじの判定，結果表示)
//        ...
          r = Math.random();
          if(r > 0.7){
            System.out.println("good");
          }else if(r > 0.2){
            System.out.println("so so");
          }else{
            System.out.println("bad");
          }
      }
    }catch(java.io.IOException e){ return; }
  }  
}