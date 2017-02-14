public class Dog{
   /*private**/ public String name;
   public Dog(String name){
      this.name=name;
   }
   //Overriding string addresses
   public boolean equals(Object other){
      Dog dog=(Dog) other;
      return this.name.equals(dog.name)&& super.equals(other);
         //*super* keyword cancels override
   }
   
   //Overriding toString
   public String toString(){
      return "My name is " + this.name;
   }
   
   //Overriding hashCode
   public int hashCode(){
      return super.hashCode()/32;
   }
   
   public void bank(){
      System.out.println("woof");
   }
   
   //Overloading
   //not finished
/*   public void bank(int number numberOfTimes){
      for(int=0;numberOfTimes;i++){
         this.bark();
      }
   }**/
}