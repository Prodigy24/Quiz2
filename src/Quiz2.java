/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Prodigy24
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        Robot defaultsteve = new Robot(kw, 1, 1, Direction.WEST);

        //program solutions coded under here
        while (true) {
            if (defaultsteve.frontIsClear()) {
                defaultsteve.move();
            } else { //front is not clear, resume course
                defaultsteve.turnLeft();
                defaultsteve.move();
                defaultsteve.turnLeft();
                defaultsteve.turnLeft();
                defaultsteve.turnLeft();
                if (defaultsteve.frontIsClear()) { //if the wal ends, stop
                    break;
                }
            }
        }
    }
}
