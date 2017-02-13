private classes

static
   singletons
   
   SUP-single use purpose   \
                             making useful declarative methods
   DRY-Don't repeat yourself/
   
   closed/open principle
   Builder Pattern
   
   String- order sequence of characters
   
   SUP - organization
   Book{
   String title
   preface
   chapters
   .
   .
   .
   }
   
private classes

public class Dog{
can only be called within a class - private DogCollar dogcollar=new DogCollar

private inner class>>>private class DogCollar{
      anything in here belongs to this class
   }
}   

public class Dog{
   private DogCollar dogcollar=new DogCollar(){
   anonymous inner class, used more with interfaces
   }

public classDog{                 Dog Fido=new Dog ("Fido")
   private String name;          Dog spot=new Dog ("Spot")
                                 Dog maxwell=new Dog("Maxwell")
public Dog(String name){         creates new instances of Dog so each has name
   this.name=name;
   }
}
 private static String name; - static only creates one instance of it
 
 dog.bark
 Dog.bark
 DOG.bark
 dog-lowercase implies instance
 Dog-beginning uppercase implies class
 DOG-may think some kind of acronym
 
 public final static - constant, never changing, always considered true
 
 Math pi - Math.PI