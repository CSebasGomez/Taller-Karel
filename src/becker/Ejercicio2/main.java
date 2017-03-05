/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker.Ejercicio2;

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
    public static int[] Decodificar(boolean[][] matriz){
        int[] lectura= new int[3];
        for(int i=0;i<3;i++){
            if(matriz[i][0]==true){
                if(matriz[i][2]==true){
                    if(matriz[i][5]==true){
                        if(matriz[i][1]==true){
                            if(matriz[i][4]==true){
                                lectura[i]=8;
                            }
                            else{
                                lectura[i]=6;
                            }
                        }
                        else{
                            lectura[i]=5;
                        }
                    }
                    else{
                        lectura[i]=0;
                    }
                }
                else{
                    if(matriz[i][1]==true){
                        lectura[i]=2;
                    }
                    else{
                        lectura[i]=3;
                    }
                }
            }
            else{
                if(matriz[i][2]==true){
                    if(matriz[i][3]==true){
                        lectura[i]=9;
                    }
                    else{
                        lectura[i]=4;
                    }
                }
                else{
                    if(matriz[i][3]==true){
                        lectura[i]=7;
                    }
                    else{
                        lectura[i]=1;
                    }
                }
            }
                
        }
            
        return lectura;
    }
    
    public static void main(String[] args) {
        //Se crean el escenario
        City Amsterdam = new City();
        Wall [] block = new Wall[35];
        Robot Andres = new Robot(Amsterdam,6,2,Direction.NORTH,0);
        //Se acomoda el escenario al ejercicio con los muros
        int h=0;// h es el conteo de muros
        for(int j=0;j<7;j=j+3){//Se crean los muros que miran a la derecha
            for(int i=0;i<5;i++){
               
                block[h] = new Wall(Amsterdam,i+1,j+1,Direction.WEST);
                h++;
            }
        }  
        for(int i=0;i<3;i++){//Se crean los muros de abajo
            for(int j=0;j<3;j++)
            {
                if(j%2==0){
                    block[h]= new Wall(Amsterdam,5,(j+1)+(3*i),Direction.SOUTH);
                    h++;
                }
                    
            }
        }
            
        for (int i=7;i<16;i++) {//Se crean los muros de arriba
            block[i] = new Wall(Amsterdam,1,i-6,Direction.NORTH);
        }
        for(int i=16;i<21;i++) {//Se crean los muros que miran a la izquierda
            block[i] = new Wall(Amsterdam,i-15,9,Direction.EAST);
        }
        //Se ubican las cosas
        Thing [] cosa;
        cosa = new Thing[40];
        int c=0; //contador de cosas 
        for(int i =0;i<9;i++){
            cosa[c]=new Thing (Amsterdam,1,i+1);
            c++;
            cosa[c]=new Thing (Amsterdam,5,i+1);
            c++;
        }
        for(int i=0;i<4;i++){
            
            cosa[c]=new Thing (Amsterdam,i+1,1);
            c++;
            cosa[c]=new Thing (Amsterdam,i+1,3);
            c++;
            cosa[c]=new Thing (Amsterdam,i+1,7);
            c++;
            cosa[c]=new Thing (Amsterdam,i+1,9);
            c++;
        }
        cosa[c]=new Thing (Amsterdam,2,4);
        cosa[c+1]=new Thing (Amsterdam,3,4);
        cosa[c+2]=new Thing (Amsterdam,3,5);
        cosa[c+3]=new Thing (Amsterdam,3,6);
        cosa[c+4]=new Thing (Amsterdam,4,6);
        //Comienza el desarrollo del problema
        //Se crea un arreglo para guardar los datos de las cosas
        // arreglo del cuadrante 1
        boolean[][] info = new boolean[3][7];
        for(int i=0;i<3;i++){//Se llena la matriz de falso
            for(int j=0;j<5;j++){
                    info[i][j]=false;
            }
        }
        int count=0;
        for(int t=0;t<3;t++){
            Andres.move();
            System.out.println("Analizando 1");
            if(Andres.canPickThing()){
                count++;
                info[t][0]=true;
            }
            Andres.turnLeft();
            Andres.move();
            for(int i=0;i<3;i++){
                Andres.turnLeft();
            }
            Andres.move();
            System.out.println("Analizando 2");
            if(Andres.canPickThing()){
                count++;
                info[t][1]=true;
            }
            Andres.move();
            Andres.move();
            System.out.println("Analizando 3");
            if(Andres.canPickThing()){
                count++;
                info[t][2]=true;  
            }
            Andres.move();
            for(int i=0;i<3;i++){
                Andres.turnLeft();
            }
            Andres.move();
            System.out.println("Analizando 4");
            if(Andres.canPickThing()){
                count++;
                info[t][3]=true;
            }
            Andres.move();
            for(int i=0;i<3;i++){
                Andres.turnLeft();
            }
            Andres.move();
            System.out.println("Analizando 5");
            if(Andres.canPickThing()){
                count++;
                info[t][4]=true;
            }
            for(int i=0;i<3;i++){
                Andres.turnLeft();
            }
            Andres.move();
            Andres.turnLeft();
            Andres.move();
            System.out.println("Analizando 6");
            if(Andres.canPickThing()){
                count++;
                info[1][5]=true;
            }
            Andres.turnLeft();
            Andres.move();
            for(int i=0;i<3;i++){
                Andres.turnLeft();
            }
            Andres.move();
            System.out.println("Analizando 7");
            if(Andres.canPickThing()){
                count++;
                info[t][6]=true;
            }
            for(int i=0;i<3;i++){
                    Andres.turnLeft();
                }
            Andres.move();
            Andres.turnLeft();
            Andres.move();
            Andres.move();
            Andres.turnLeft();
            for(int i=0;i<3;i++){
                Andres.move();
            }
            Andres.turnLeft();
            System.out.println(count);
            for(int i=0;i<3;i++){
                for(int j=0;j<7;j++){
                    System.out.print(info[i][j]+" ");
                }
                System.out.println();
            }
        }
        int[] resultado= Decodificar(info);
        for(int i=0;i<3;i++){
            System.out.print(resultado[i]);
        }
    }
}

        