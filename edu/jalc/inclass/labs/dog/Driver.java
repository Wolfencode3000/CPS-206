public class Driver{
   public static void main(String...args){
   
   Dog fido=new Dog("Fido");
   Dog spot=new Dog("Fido");
   
   System.out.println(fido.equals(spot));                   //very useful
   System.out.println(fido.toString()); //.toString() change//2nd most useful
   System.out.println(fido.hashCode()/16);
   
//not finished   
/*   fido.bark(); **/
   }
}
   
   