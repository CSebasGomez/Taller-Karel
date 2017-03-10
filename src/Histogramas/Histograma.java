
package Histogramas;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.util.Scanner;

public class Histograma {
    private City ciudad;
    private Robot robot;
    
    public Histograma(){
        this.ciudad = new City();
        this.robot = new Robot(ciudad, 0, 0, Direction.SOUTH);
        
}
    public void DibujarHisto(){
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        int pos = 1;
        int pregunta;
        boolean t = true;
        System.out.println("ingrese un número");
        
        while (t){
            robot.move();
            n = teclado.nextInt();
            int l = n-1;
            
            //acá un for para el número de objetos
            for (int i=0; i<n+1; i++){
                //guiarme en la recogida de los puntos
                int h = i;
                Thing punto = new Thing(ciudad, pos, 0);
                for (int j=0; j<n; j++){
                    //recoger objeto
                    robot.pickThing();
                    break;
                }
                
                //girar a la izquierda
                
            }
            robot.turnLeft();
            for(int i=0; i<n; i++){
                robot.putThing();
                robot.move();
                
            }
            for(int i=0; i<2; i++){
                robot.turnLeft();
            };
            //robot.move();
            //for(int i=0; i<3; i++){
            //    robot.turnLeft();
            //};
            for(int i=0; i<n;i++){
                robot.move();
            }
            robot.turnLeft();
            
            
            pos++;
            System.out.println("desea ingresar mas datos? 1=si, 0=no");
            pregunta = teclado.nextInt();
            if (pregunta == 1){
                t = true; 
            }
            else{
                t = false;
                System.out.println("programa acabado");
            }
        }
        
    }
    
    
}
