public class Driver {

   public static void main(String...args){
   
      for(int i = 0; i < 10; i++){
         new VerboseThread().start();
      }
      
   }
}