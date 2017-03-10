/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizarPilas;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author Sebastian
 */
public class Escenario {
    private City ciudad;
    private Robot robot;

    public Escenario(City ciudad, Robot robot) {
        this.ciudad = ciudad;
        this.robot = robot;
    }
    
        

        public City getCiudad() {
            return ciudad;
        }

        public Robot getRobot() {
            return robot;
        }

    public void setCiudad(City ciudad) {
        this.ciudad = ciudad;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
        
        
        public void CrearEscenario(){
            Thing[] cosa;
            cosa = new Thing[54];
            int t=0;
            for(int i =2;i<9;i++){
                for(int j=0;j<12;j++){
                    if(i>=j){
                        cosa[t]= new Thing (ciudad,i-2,j+1);
                        t++;
                    }
                }
            }
        }
        
    
}
