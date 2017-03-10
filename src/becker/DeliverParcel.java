package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Thing parcel = new Thing(prague, 1, 2);
      Thing parce2 = new Thing(prague, 1, 4);
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,5);
    
      // Direct the robot to the final situation
      karel.move();
      karel.move();
      //karel.pickThing();
      if(karel.canPickThing()){
          karel.pickThing();
          karel.turnLeft();	// start turning right as three turn lefts
          karel.turnLeft();
          karel.move();
          karel.pickThing();
      }
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.turnLeft();	// finished turning right
      karel.move();
     // karel.putThing();
      karel.move();
      karel.pickThing();
      System.out.println(karel.countThingsInBackpack());
   }
}
