/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizarPilas;

import becker.robots.City;
import becker.robots.Robot;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Sebastian
 */
public class Solucion {
    private Robot zac;
    private City Ibague;

    public Solucion(Robot zac, City Ibague) {
        this.zac = zac;
        this.Ibague = Ibague;
    }

    public Robot getZac() {
        return zac;
    }

    public City getIbague() {
        return Ibague;
    }
    public void Solucion(){
        int[] info= new int[10];
        int columna =0;
        for(int i=0;i<5;i++){
            int z=0;
            for(int j=0;j<9;j++){
                if(zac.canPickThing()){
                    zac.pickThing();
                    z++;
                }
                zac.move();
            }
            if(zac.canPickThing()){
                zac.pickThing();
                z++;
            }
            info[columna]= z;
            z=0;
            System.out.println(info[columna]);
            for(int it=0;it<3;it++){
                zac.turnLeft();
            }
            zac.move();
            for(int it=0;it<3;it++){
                zac.turnLeft();
            }
            columna++;
            for(int j=0;j<9;j++){
                if(zac.canPickThing()){
                    zac.pickThing();
                    z++;
                }
                zac.move();
            }
            if(zac.canPickThing()){
                zac.pickThing();
                z++;
            }
            info[columna]= z;
            System.out.println(info[columna]);
            zac.turnLeft();
            zac.move();
            zac.turnLeft();
            columna++;
        }
        System.out.println("Organizando Numeros");
        Arrays.sort(info);
        for(int i=0;i<10;i++){
            System.out.println(info[i]);
        }
        zac.turnLeft();
        for(int i=0;i<11;i++){
            zac.move();
        }
        zac.turnLeft();
        zac.turnLeft();
        zac.turnLeft();
        columna=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(info[columna]>0){
                    zac.putThing();
                    info[columna]=info[columna]-1;
                }
                zac.move();
            }
            for(int it=0;it<3;it++){
                zac.turnLeft();
            }
            zac.move();
            for(int it=0;it<3;it++){
                zac.turnLeft();
            }
            for(int h=0;h<10;h++){
                zac.move();
            }
            zac.turnLeft();
            zac.turnLeft();
            columna++;
        }
    }
    
}
