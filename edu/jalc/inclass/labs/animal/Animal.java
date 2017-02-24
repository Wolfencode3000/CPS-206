package edu.jalc.inclass.labs.animal;

abstract public class Animal {

	private String growls;
       
   AnimalSays animalsays= new Animalsays;

	private Animal(){
		this.growls = null; 
	}

	Animal (String growls){
		this.growls = growls;
	}

	String getGrowl(){
		return this.growls;
	}

   
   public animalSays toString(){
      return this.growls;
   }
   
   public String toString(){
      return this.growls;
   }
}