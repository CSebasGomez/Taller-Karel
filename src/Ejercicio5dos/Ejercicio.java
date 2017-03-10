
package Ejercicio5dos;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;


public class Ejercicio {
    private City ciudad;
    private Robot robot;
    int Contador = 0;
    int [] recorrido2 = new int[17];
    boolean [] recorrido = new boolean [17];
    
    public Ejercicio(){
        int y = 10;
        int x = 10;
        
        
        
        int [] ContadorY = new int[5];
        this.ciudad = new City();
        this.robot = new Robot(ciudad, y, x-9, Direction.NORTH);
        Wall blocO1 = new Wall(ciudad, y-1, x-9, Direction.WEST);
        Wall blocO2 = new Wall(ciudad, y-2, x-9, Direction.WEST);
        Wall blocO3 = new Wall(ciudad, y-3, x-9, Direction.WEST);
        Wall blocO4 = new Wall(ciudad, y-4, x-9, Direction.WEST);
        Wall blocO5 = new Wall(ciudad, y-5, x-9, Direction.WEST);
        Wall blocO6 = new Wall(ciudad, y-5, x-9, Direction.NORTH);
        Wall blocO7 = new Wall(ciudad, y-5, x-8, Direction.NORTH);
        Wall blocO8 = new Wall(ciudad, y-5, x-7, Direction.NORTH);
        Wall blocO9 = new Wall(ciudad, y-5, x-6, Direction.NORTH);
        Wall blocO10 = new Wall(ciudad, y-5, x-5, Direction.NORTH);
        Wall blocO11 = new Wall(ciudad, y-5, x-5, Direction.EAST);
        Wall blocO12 = new Wall(ciudad, y-4, x-5, Direction.EAST);
        Wall blocO13 = new Wall(ciudad, y-3, x-5, Direction.EAST);
        Wall blocO14 = new Wall(ciudad, y-2, x-5, Direction.EAST);
        Wall blocO15 = new Wall(ciudad, y-1, x-5, Direction.EAST);
        Wall blocO16 = new Wall(ciudad, y-1, x-5, Direction.SOUTH);
        Wall blocO17 = new Wall(ciudad, y-1, x-6, Direction.SOUTH);
        Wall blocO18 = new Wall(ciudad, y-1, x-7, Direction.SOUTH);
        Wall blocO19 = new Wall(ciudad, y-1, x-8, Direction.SOUTH);
        Thing PuntoLlegada = new Thing (ciudad, 7, 8);
        
        //ingresar puntos en el cuarto
        //base-izquierda
        Thing punto1 = new Thing(ciudad, y-2, x-9);
        Thing punto2 = new Thing(ciudad, y-1, x-8);
        Thing punto3 = new Thing(ciudad, y-4, x-9);
        Thing punto4 = new Thing(ciudad, y-1, x-6);
        
        //techo - derecha
        Thing punto5 = new Thing(ciudad, y-2, x-5);
        Thing punto6 = new Thing(ciudad, y-5, x-8);
        Thing punto7 = new Thing(ciudad, y-4, x-5);
        Thing punto8 = new Thing(ciudad, y-5, x-6);
        
        
        //ingresar paredes cuarto sin puntos
        Wall blocS1 = new Wall(ciudad, y-4, x-3, Direction.WEST);
        Wall blocS2 = new Wall(ciudad, y-5, x-3, Direction.WEST);
        Wall blocS3 = new Wall(ciudad, y-6, x-3, Direction.WEST);
        Wall blocS4 = new Wall(ciudad, y-7, x-3, Direction.WEST);
        Wall blocS5 = new Wall(ciudad, y-8, x-3, Direction.WEST);
        Wall blocS6 = new Wall(ciudad, y-8, x-3, Direction.NORTH);
        Wall blocS7 = new Wall(ciudad, y-8, x-2, Direction.NORTH);
        Wall blocS8 = new Wall(ciudad, y-8, x-1, Direction.NORTH);
        Wall blocS9 = new Wall(ciudad, y-8, x, Direction.NORTH);
        Wall blocS10 = new Wall(ciudad, y-8, x+1, Direction.NORTH);
        Wall blocS11 = new Wall(ciudad, y-8, x+1, Direction.EAST);
        Wall blocS12 = new Wall(ciudad, y-7, x+1, Direction.EAST);
        Wall blocS13 = new Wall(ciudad, y-6, x+1, Direction.EAST);
        Wall blocS14 = new Wall(ciudad, y-5, x+1, Direction.EAST);
        Wall blocS15 = new Wall(ciudad, y-4, x+1, Direction.EAST);
        Wall blocS16 = new Wall(ciudad, y-4, x+1, Direction.SOUTH);
        Wall blocS17 = new Wall(ciudad, y-4, x, Direction.SOUTH);
        Wall blocS18 = new Wall(ciudad, y-4, x-1, Direction.SOUTH);
        Wall blocS19 = new Wall(ciudad, y-4, x-2, Direction.SOUTH);
        int ContarPasos = 0;
    }
    
    public void Dibujar(){
        robot.move();
        Recoger();
        Derecha();
        Recoger();
        Derecha();
        Recoger();
        Derecha();
        Recoger();
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        for(int i=0; i<6; i++){
            robot.move();
        }
        robot.turnLeft();
        for(int i=0; i<4; i++){
            robot.move();
        }
        Poner();
        Derecha();
        Poner();
        Derecha();
        Poner();
        Derecha();
        Poner();
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        robot.move();
               
        
            
        
    }
    
    public void Derecha(){
        for(int i=0; i<3;i++){
            robot.turnLeft();
        }
    }
    public void Recoger()
    {
        for (int i=0; i<2;i++)
        {
            robot.move();
            Contador++;
            if(robot.canPickThing())
            {
                robot.pickThing();
                robot.move();
                Contador++;
                recorrido[Contador]=true;
            }else
            {
                robot.move();
                Contador++;
            }
            System.out.println(Contador);
        }
    }
    
    public void Poner()
    {
        for(int i=0; i<2; i++)
        {
            robot.move();
            if(recorrido[Contador]==true)
            {
                robot.putThing();
                robot.move();
            }else
            {
                robot.move();
            }
        }
    }
    
}
