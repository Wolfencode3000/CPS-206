Declarative Programming via Encapulation

object > dog
method > .bark
dog.bark

bad
d.dob()

Should be able to easily read and understand
top most level should be easiest to read
but any level deeper should still be understandable

DRY - Don't Repeat Yourself

SUP - Single Use Purpose

Immutable Objects - if it doesnt need to change, no reason to code it

Singletons - hard to test, but one of few ways to work around static, 
useful for building a better class
   static class MyClass{} - only one instance of this Class will ever exist.
          class MyClass{} - leaves open to call and create new instances
          
                SodaBottle
                  pour(){
                     Soda.SetVolume()
                
                SodaBottle
                  fill(){
                  
                PepsiMidAmerica{
                  collectionBottle{
                     Machine SodaFiller
                     
                Class SodaFiller{
                  private static SodaFiller SodaFiller=null;
                     public static SodaFiller getInstance(){
                        if (sodaFiller==null)sodaFiller=new SodaFiller();
                  return new sodaFiller();
                  public void fillBottle(SodaBottle bottle)
                     
                SodaFiller sodaFiller=SodaFiller.getInstance();
                  SodaFiller sodaFilerOther=SodaFiller.getInstance();
                  assert (sodaFIller==SodaFillerOther)
                  SodaFiller.fillBottle(new SodaBottle);
                

Enumeration - very concrete and do not change, always available to use
   example: Monday, Tuesday, Wednesday, etc - doesn't change
   Class DaysOfWeek
      String etc
   enum DaysOfWeek
      SUNDAY,MONDAY,...SATURDAY
         there is no notion of what it is, just that it is there
         DaysOfWeek today=DaysOfWeek.WEDNESDAY;
         if(DaysOfWeek.MONDAY==today) what is today? DaysOfWeek
           


Open/Closed Principle (parallelism?)
   open for extension, closed for modification
      mywebpage.com/user/13 (give me user 13)
      then someone modifies user 13 code, which then breaks the code for anyone else
      closed - try to prepare for the future, be open to extension
         Square
         Circle
         both have area and perimeter in common
         add in Triangle, can include area and perimeter
         go up to Shape, but having code in Square makes it tougher
         try to set code up to work down, not up