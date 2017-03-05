/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker.Ejercicio7;

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
        //se crea el escenario
        City Grecia = new City();
        Robot Gustav=new Robot(Grecia,9,5,Direction.NORTH);
        Wall[] block= new Wall[35];
        int w=0;//contador de muros
        for(int i =0;i<9;i++){
            if(i!=4){
                if(i==7){
                    block[w]=new Wall(Grecia,i+1,4,Direction.WEST);
                    w++;
                    block[w]=new Wall(Grecia,i+1,5,Direction.EAST);
                    w++;
                }
                else{
                    block[w]=new Wall(Grecia,i+1,5,Direction.EAST);
                    w++;
                    block[w]=new Wall(Grecia,i+1,5,Direction.WEST);
                    w++;
                }
            }
            
        }
        for(int h=0;h<9;h++){
            if(h!=4){
                block[w]=new Wall(Grecia,5,h+1,Direction.NORTH);
                w++;
                block[w]=new Wall(Grecia,5,h+1,Direction.SOUTH);
                w++;
            }
            if(h==3){
                block[w]=new Wall(Grecia,8,4,Direction.NORTH);
                w++;
                block[w]=new Wall(Grecia,8,4,Direction.SOUTH);
                w++;
            }
        }
        Thing [] cosas = new Thing[64];//Se ubican las cosas
        int c=0;
        for(int i=0;i<9;i++){//Se crean los bloques de cosas de arriba
            if(i!=4){
                for(int j=0;j<4;j++){
                cosas[c]=new Thing(Grecia,j+1,i+1);
                c++;
                }
            }
        }
        for(int i=0;i<9;i++){//Se crean los bloques de cosas de abajo
            if(i!=4){
                for(int j=0;j<4;j++){
                    if(((i==3)&&(j==2))||((i==7)&&(j==3))||((i==8)&&((j==2)||(j==3)))){
                    continue;//Se quitan las excepciones
                    }
                    cosas[c]=new Thing(Grecia,j+6,i+1);
                    c++;
                }
            }
        }
        //Comienza el desarrollo de la solucion
        for(int k=0;k<4;k++){
            for(int a=0;a<9;a++){
                Gustav.move();
            }
            for(int a=0;a<3;a++){
                Gustav.turnLeft();
            }
            Gustav.move();
            for(int a=0;a<3;a++){
                Gustav.turnLeft();
            }
            Gustav.move();
            if(k!=2){
                for(int a=0;a<2;a++){
                    for(int b=0;b<3;b++){
                        if(Gustav.canPickThing()){
                            Gustav.pickThing();
                        }
                        Gustav.move();
                    }
                    if(Gustav.canPickThing()){
                       Gustav.pickThing();
                    }
                    Gustav.turnLeft();
                    Gustav.move();
                    Gustav.turnLeft();
                    for(int b=0;b<3;b++){
                        if(Gustav.canPickThing()){
                            Gustav.pickThing();
                        }
                        Gustav.move();
                    }
                    if(Gustav.canPickThing()){
                       Gustav.pickThing();
                    }
                    for(int b=0;b<3;b++){
                        Gustav.turnLeft();
                    }
                    Gustav.move();
                    for(int b=0;b<3;b++){
                        Gustav.turnLeft();
                    }
                }
            }
            else{
                if(Gustav.canPickThing()){
                       Gustav.pickThing();
                    }
                Gustav.turnLeft();
                Gustav.move();
                for(int it=0;it<3;it++){
                    Gustav.turnLeft();
                }
                Gustav.move();
                Gustav.move();
                for(int it=0;it<3;it++){
                    Gustav.turnLeft();
                }
                Gustav.move();
                Gustav.turnLeft();
                if(Gustav.canPickThing()){
                   Gustav.pickThing();
                }
                Gustav.move();
                if(Gustav.canPickThing()){
                   Gustav.pickThing();
                }
                Gustav.turnLeft();
                Gustav.move();
                Gustav.turnLeft();
                for(int it=0;it<3;it++){
                    if(Gustav.canPickThing()){
                    Gustav.pickThing();
                    }
                    Gustav.move();
                }
                if(Gustav.canPickThing()){
                    Gustav.pickThing();
                }
                for(int it=0;it<3;it++){
                    Gustav.turnLeft();
                }
                Gustav.move();
                for(int it=0;it<3;it++){
                    Gustav.turnLeft();
                }
                for(int it=0;it<3;it++){
                    if(Gustav.canPickThing()){
                    Gustav.pickThing();
                    }
                    Gustav.move();
                }
                if(Gustav.canPickThing()){
                    Gustav.pickThing();
                }
                Gustav.turnLeft();
                Gustav.move();
                Gustav.turnLeft();
                for(int it=0;it<3;it++){
                    if(Gustav.canPickThing()){
                    Gustav.pickThing();
                    }
                    Gustav.move();
                }
                if(Gustav.canPickThing()){
                    Gustav.pickThing();
                }
                for(int it=0;it<3;it++){
                    Gustav.turnLeft();
                }
                Gustav.move();
                for(int it=0;it<3;it++){
                    Gustav.turnLeft();
                }
            }
            for(int a=0;a<4;a++){
                Gustav.move();
            }
            for(int b=0;b<3;b++){
                    Gustav.turnLeft();
            }
            Gustav.move();
        }    
    }
}
