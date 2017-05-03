public class ConsoleLogger implements Observer{

   public void observe(Message message){
      System.out.println(message);
   }
}