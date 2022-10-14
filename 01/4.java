class kadai4 {
   public static void main(String[] args){
      int a[] = new int[200];
      int b[] = new int[200];
      for(int i = 0; i < 200; i++){
         a[i] = i + 1;
         b[i] = i + 1;
      }
      b[0] = 0;
      for(int j = 2; j < 200; j++){
         for(int i = 1; i< 200; i++){
            if(a[i] % j == 0 && a[i] != j){
               b[i] = 0;
            }
         }
      }
      for(int i = 0; i < 200; i++){
         if(b[i] != 0){
            System.out.printf("%d\n",b[i]);
         }
      }
   }
}   
