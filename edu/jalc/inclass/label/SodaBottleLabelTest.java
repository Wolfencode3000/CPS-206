package edu.jalc.inclass.label;

import edu.jalc.inclass.color.RGBColor;
import edu.jalc.inclass.logo.LabelLogo;

public class SodaBottleLabelTest{

   public void testGetHeight(){
   	System.out.println("Testing SodaBottleLabel::getHeight");
 	   SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(1.0, 1.0, 1.0);
 	   assert(sodaBottleLabel.getHeight() == 1.0);
   }

   public void testRGBColor(){
      System.out.println("Testing SodaBottleLabel::getRGBColor");
      RGBColor rgbColor = new RGBColor();
      assert(sodaBottleLabel.getRgbColor() == rgbColor);
   
   }




}

