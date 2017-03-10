/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizarPilas;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Sebastian
 */
public class main {
    public static void main(String[] args) {
        
        City Bogota= new City();
        Robot x=new Robot(Bogota, 9, 1, Direction.NORTH);
        Escenario h = new Escenario(Bogota,x);
        h.CrearEscenario();
        Solucion j= new Solucion(x,Bogota);
        j.Solucion();
    }
 }

