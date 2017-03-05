/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker.Ejercicio5;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Sebastian
 */
public class main {
    public static void main(String[] args) {
        
        City Francia= new City();
        Robot Frank= new Robot(Francia,5,6, Direction.NORTH,0);
        Wall block1=new Wall(Francia,3,0,Direction.WEST);
        Wall block2=new Wall(Francia,4,0,Direction.WEST);
        Wall block3=new Wall(Francia,2,0,Direction.SOUTH);
        Wall block4=new Wall(Francia,4,0,Direction.SOUTH);
        Wall block5=new Wall(Francia,2,0,Direction.EAST);
        Wall block6=new Wall(Francia,5,0,Direction.EAST);
        Wall block7=new Wall(Francia,1,1,Direction.SOUTH);
        Wall block8=new Wall(Francia,3,1,Direction.SOUTH);
        Wall block9=new Wall(Francia,0,2,Direction.WEST);
        Wall block10=new Wall(Francia,1,2,Direction.WEST);
        Wall block11=new Wall(Francia,3,2,Direction.WEST);
        Wall block12=new Wall(Francia,4,2,Direction.WEST);
        Wall block13=new Wall(Francia,0,2,Direction.NORTH);
        Wall block14=new Wall(Francia,2,2,Direction.SOUTH);
        Wall block15=new Wall(Francia,5,2,Direction.SOUTH);
        Wall block16=new Wall(Francia,5,1,Direction.SOUTH);
        Wall block17=new Wall(Francia,0,3,Direction.NORTH);
        Wall block18=new Wall(Francia,0,3,Direction.SOUTH);
        Wall block19=new Wall(Francia,3,3,Direction.SOUTH);
        Wall block20=new Wall(Francia,1,2,Direction.EAST);
        Wall block21=new Wall(Francia,2,2,Direction.EAST);
        Wall block22=new Wall(Francia,4,2,Direction.EAST);
        Wall block23=new Wall(Francia,2,3,Direction.EAST);
        Wall block24=new Wall(Francia,3,3,Direction.EAST);
        Wall block25=new Wall(Francia,5,3,Direction.EAST);
        Wall block26=new Wall(Francia,0,2,Direction.NORTH);
        Wall block27=new Wall(Francia,0,4,Direction.NORTH);
        Wall block28=new Wall(Francia,0,4,Direction.SOUTH);
        Wall block29=new Wall(Francia,5,2,Direction.EAST);
        Wall block30=new Wall(Francia,2,4,Direction.SOUTH);
        Wall block31=new Wall(Francia,4,4,Direction.SOUTH);
        Wall block32=new Wall(Francia,0,5,Direction.NORTH);
        Wall block33=new Wall(Francia,1,5,Direction.WEST);
        Wall block34=new Wall(Francia,4,5,Direction.WEST);
        Wall block35=new Wall(Francia,2,6,Direction.WEST);
        Wall block36=new Wall(Francia,1,5,Direction.SOUTH);
        Wall block37=new Wall(Francia,3,5,Direction.SOUTH);
        Wall block38=new Wall(Francia,3,6,Direction.SOUTH);
        Wall block39=new Wall(Francia,0,6,Direction.SOUTH);
        Wall block40=new Wall(Francia,0,6,Direction.WEST);
        Wall block41=new Wall(Francia,2,6,Direction.SOUTH);
        Wall block42=new Wall(Francia,4,5,Direction.EAST);
        Wall block43=new Wall(Francia,5,5,Direction.EAST);
        Wall block44=new Wall(Francia,5,6,Direction.SOUTH);
        Wall block45=new Wall(Francia,2,8,Direction.WEST);
        Wall block46=new Wall(Francia,3,8,Direction.WEST);
        Wall block47=new Wall(Francia,1,7,Direction.SOUTH);
        Wall block48=new Wall(Francia,1,7,Direction.WEST);
        Wall block49=new Wall(Francia,5,6,Direction.EAST);
        Wall block50=new Wall(Francia,5,7,Direction.NORTH);
        Wall block51=new Wall(Francia,4,7,Direction.EAST);
        Thing cosa= new Thing (Francia,1,6);
        Thing cosa2= new Thing (Francia,2,4);
        Thing cosa3= new Thing (Francia,4,3);
    }
}
