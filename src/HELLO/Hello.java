
package HELLO;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Koonda15
 */
public class Hello
{
    private City ciudad;
    private Robot R1;
    private Robot R2;
    private Robot R3;
    private Robot R4;
    private Robot R5;
    
    public Hello(){
        this.ciudad = new City();
        this.R1 = new Robot(ciudad, 0, 1, Direction.SOUTH);
        this.R2 = new Robot(ciudad, 0, 5, Direction.SOUTH);
        this.R3 = new Robot(ciudad, 0, 9, Direction.SOUTH);
        this.R4 = new Robot(ciudad, 0, 13, Direction.SOUTH);
        this.R5 = new Robot(ciudad, 0, 17, Direction.SOUTH);
   }
    
    public void Dibujar(){
        DibujarH();
        DibujarE();
        DibujarL1();
        DibujarL2();
        DibujarO();
    }
    
    
    public void DibujarH(){
        Thing punto1 = new Thing(ciudad, 0, 1);
        Thing punto2 = new Thing(ciudad, 0, 1);
        Thing punto3 = new Thing(ciudad, 0, 1);
        Thing punto4 = new Thing(ciudad, 0, 1);
        Thing punto5 = new Thing(ciudad, 0, 1);
        Thing punto6 = new Thing(ciudad, 0, 1);
        Thing punto7 = new Thing(ciudad, 0, 1);
        Thing punto8 = new Thing(ciudad, 0, 1);
        Thing punto9 = new Thing(ciudad, 0, 1);
        Thing punto10 = new Thing(ciudad, 0, 1);
        Thing punto11 = new Thing(ciudad, 0, 1);
        
        for(int i=0; i<11; i++){
            R1.pickThing();
        }
        for(int i=0; i<5; i++){
            R1.move();
            R1.putThing();
        }
        //girar  180°
        G180R1();
        
        for(int i=0; i<2; i++){
            R1.move();
        }
        
        G270R1();
        
        for(int i=0; i<1; i++){
            R1.move();
            R1.putThing();
        }
        R1.move();
        
        R1.turnLeft();
        
        for (int i=0; i<2; i++){
            R1.move();
        }
        G180R1();
        
        for(int i=0; i<5; i++){
            R1.putThing();
            R1.move();
            
        }
        //acaba dibujo H
    }
    
    public void DibujarE(){
        Thing punto1 = new Thing(ciudad, 0, 5);
        Thing punto2 = new Thing(ciudad, 0, 5);
        Thing punto3 = new Thing(ciudad, 0, 5);
        Thing punto4 = new Thing(ciudad, 0, 5);
        Thing punto5 = new Thing(ciudad, 0, 5);
        Thing punto6 = new Thing(ciudad, 0, 5);
        Thing punto7 = new Thing(ciudad, 0, 5);
        Thing punto8 = new Thing(ciudad, 0, 5);
        Thing punto9 = new Thing(ciudad, 0, 5);
        Thing punto10 = new Thing(ciudad, 0, 5);
        Thing punto11 = new Thing(ciudad, 0, 5);
        
        for(int i=0; i<11; i++){
            R2.pickThing();
        }
        
        for(int i=0; i<5;i++){
            R2.move();
            R2.putThing();
        }
        //avanzar y poner 2
        R2.turnLeft();
        MovePut();
        R2.turnLeft();
        Avanzar2();
        R2.turnLeft();
        //avanzar y poner 2
        for (int i=0; i<2; i++){
            R2.putThing();
            R2.move();
        }
        G270R2();
        Avanzar2();
        G270R2();
        MovePut();
        G270R2();
        Avanzar2();
        Avanzar2();
        R2.move();
        //acaba dibujo E
    }
    
    public void DibujarL1(){
        
        Thing puntoa = new Thing(ciudad, 0, 9);
        Thing puntob = new Thing(ciudad, 0, 9);
        Thing puntoc = new Thing(ciudad, 0, 9);
        Thing puntod = new Thing(ciudad, 0, 9);
        Thing puntoe = new Thing(ciudad, 0, 9);
        Thing puntof = new Thing(ciudad, 0, 9);
        Thing puntog = new Thing(ciudad, 0, 9);
        
        for(int i=0; i<7; i++){
            R3.pickThing();
        }
        
        for(int i=0; i<5; i++){
            R3.move();
            R3.putThing();
        }
        R3.turnLeft();
        for(int i=0; i<2; i++){
            R3.move();
            R3.putThing();
        }
        R3.turnLeft();
        R3.move();
        
        for(int i=0; i<2; i++){
            R3.turnLeft();
        }
        for(int i=0; i<2; i++){
            R3.move();
        }
        //finaliza L1
    }
    
    public void DibujarL2(){
        
        Thing punto1 = new Thing(ciudad, 0, 13);
        Thing punto2 = new Thing(ciudad, 0, 13);
        Thing punto3 = new Thing(ciudad, 0, 13);
        Thing punto4 = new Thing(ciudad, 0, 13);
        Thing punto5 = new Thing(ciudad, 0, 13);
        Thing punto6 = new Thing(ciudad, 0, 13);
        Thing punto7 = new Thing(ciudad, 0, 13);
        
        for(int i=0; i<7; i++){
            R4.pickThing();
        }
        
        for(int i=0; i<5; i++){
            R4.move();
            R4.putThing();
        }
        R4.turnLeft();
        for(int i=0; i<2; i++){
            R4.move();
            R4.putThing();
        }
        R4.turnLeft();
        R4.move();
        for(int i=0; i<2; i++){
            R4.turnLeft();
        }
        for(int i=0; i<2; i++){
            R4.move();
        }
        //acaba dibujo L2
    }
    
    public void DibujarO(){
        Thing punto1 = new Thing(ciudad, 0, 17);
        Thing punto2 = new Thing(ciudad, 0, 17);
        Thing punto3 = new Thing(ciudad, 0, 17);
        Thing punto4 = new Thing(ciudad, 0, 17);
        Thing punto5 = new Thing(ciudad, 0, 17);
        Thing punto6 = new Thing(ciudad, 0, 17);
        Thing punto7 = new Thing(ciudad, 0, 17);
        Thing punto8 = new Thing(ciudad, 0, 17);
        Thing punto9 = new Thing(ciudad, 0, 17);
        Thing punto10 = new Thing(ciudad, 0, 17);
        Thing punto11 = new Thing(ciudad, 0, 17);
        Thing punto12 = new Thing(ciudad, 0, 17);
        
        for(int i=0; i<12; i++){
            R5.pickThing();
        }
        for (int i=0; i<5; i++){
            R5.move();
            R5.putThing();
        }
        R5.turnLeft();
        for (int i=0; i<2; i++){
            R5.move();
            R5.putThing();
        }
        R5.turnLeft();
        for (int i=0; i<4; i++){
            R5.move();
            R5.putThing();
        }
        R5.turnLeft();
        R5.move();
        R5.putThing();
        
        R5.turnLeft();
        for(int i=0; i<5;i++){
            R5.move();
        }
        //acaba dibujo O
        
    }
    
    
    
    public void G270R1(){
    //girar 270°
        for(int i=0; i<3; i++){
            R1.turnLeft();
        }
}
    public void G180R1(){
        for(int i=0; i<2; i++){
            R1.turnLeft();
        }
    }
    
    public void G270R2(){
    //girar 270°
        for(int i=0; i<3; i++){
            R2.turnLeft();
        }
}
    
    public void Avanzar2(){
        for (int i=0; i<2; i++){
            R2.move();
        }
    }
    public void MovePut(){
        for (int i=0; i<2; i++){
            R2.move();
            R2.putThing();
        }
    }
    
   
}
  
    
    
    
    
    

