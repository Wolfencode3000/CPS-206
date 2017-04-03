public class DriverAnonymous {

   static int count = 0;

   public static void main (String...args){

      Runnable runnable = new Runnable() {
         public void run() {
         int myNumber = count;
         count++;
         try {
            Thread.sleep((int)(Math.random() * 10000));
            System.out.println(this.getName() + " running");
         }  catch (Exception e){
            System.out.println(this.getName() + " interrupted");
         }
        }
      };

      for(int i = 0; i < 10; i++){
         new Thread(runnable).start();
      }
   }
}