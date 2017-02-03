//Unit testing

//making simple methods that work

public class Car{

   drive(){
      start car
      put seatbelt on
      put in gear
      accelerate
      turn
      brake
      
      startCar(){
      checkSourceOfIgnition() //declarative
      if key
         put into ignition //imperative
         turn key //imperative
         if carburator, press gas //imperative
         else
      else press button //imperative
      };
      
      //simplified
      startKeyCar()
         checkSourceOfIgnition()
         if (key).startkey car()
         else startFobCar()
      startFobCar()
      
      putSeatBeltOn(){
         grabSeatBelt
         "Click it or ticket"
      };
      
      putInGear(){
         if manuel transmission
            pushInClutch
            turnKey
            if movingForward Shift1stGear
            else movingbackward shiftReverse
            releaseClutch while pressingGas
         else autoTransmission
         
      };
      
      shiftManuel(){
         pressClutch(){
            workclutch(true)}
         moveGearShift(gear)
         releaseClutch(){
            workClutch(false)}
            
            void   workClutch(boolean press){
               if(press)
                  isClutchPress=true
               else
                  isClutchPress=False
            }
            void   testWorkClutch(){
                  workClutch(true)
                  assert(isClutchPressed)
                  workClutch(false)
                  assert(isClutchPressed)
            }
      Accelerate(){};
      turn(){};
      brake(){};
   
   //unit, integration, etc
   //test your unit to make sure your methods would work
   //if the testing is too complicated, your code is most likely bound to fail
   
   //practice Make a Car Test that tests each of the methods and then call
   // your methods in main
   
   //java -ea (enable assertions) CarTest
   
   }

}