// interface Photo {
//     void TakePhoto();
// }
// class Cellular implements Photo {
//     public void MakeCall() {
//       System.out.println("携帯電話で電話を掛けました．");
//     }
//     public void TakePhoto() {
//       System.out.println("携帯電話で写真を撮りました．");
//     }
// }

// class Camera implements Photo {
//     public void TakePhoto() {
//       System.out.println("デジカメで写真を撮りました．");
//     }
// }

// class VideoCam implements Photo {
//     public void RecordMovie() {
//       System.out.println("ビデオカメラで動画を撮影しました．");
//     }
//     public void TakePhoto() {
//       System.out.println("ビデオカメラで写真を撮りました．");
//     }
// }

// class Android implements Photo {
//   public void MakeCall() {
//     System.out.println("Androidで電話を掛けました. ");
//   }
//   public void PlayGame() {
//     System.out.println("Androidでゲームをプレイしました. ");
//   }
//   public void TakePhoto() {
//     System.out.println("Androidで写真を撮りました. ");
//   }
// }

// class Photographer {
//    final static int MAX=20; 
//    private Photo camera[] = new Photo[MAX];
//    private int num=0;
   
//    public void add(Photo p){
//      if (num>=MAX) return; 
//      camera[num++]=p;
//    }

//    public void TakeAll(){
//       for(int i = 0; i< num; i++){
//         System.out.print("["+(i+1)); 
//         System.out.print("]");
//           camera[i].TakePhoto();
//       }
//    }

//    public static void main(String argv[]){
//       Photographer p=new Photographer();
//       int i = 0;
//       while(i<20){
//       double r = Math.random();
//           if(r > 0.75){
//             p.add(new Cellular());  
//           }else if(r > 0.5){
//             p.add(new Camera());
//           }else if(r > 0.25){
//             p.add(new VideoCam());
//           }else{
//             p.add(new Android());
//           }
//           i++;
//       }
//       p.TakeAll();
//    }
// }


