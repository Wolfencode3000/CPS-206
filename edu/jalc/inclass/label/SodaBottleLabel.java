//connecting package
package edu.jalc.inclass.label

//breaking down and importing methods from other classes and folders
import edu.jalc.inclass.color.RGBColor;
import edu.jalc.inclass.logo.LabelLogo;

public class SodaBottleLabel {

//Identifiers
   private final double height;
   private final LabelLogo labelLogo;
   private final RGBColor rgbColor;
         
   private SodaBottleLabel(){
      this.height = 0;
      this.labelLogo = null;
      this.rgbcolor = null;  
   }
//main method
   public SodaBottleLabel(double height, RGBColor rgbColor, LabelLogo labelLogo){
		this.height = height;
		this.labelLogo = labelLogo;
      this.rgbColor = rgbColor;
   }  
//simple value methods   
   public double getHeight(){
      return height;
   }
	
   public RGBColor rgbColor(){
      return rgbColor
   }

   public LabelLogo labelLogo(){
      return labelLogo
   }

}