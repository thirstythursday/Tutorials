/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oo_concepts;

import static oo_concepts.Bicycle.numberOfBikes;

/**
 *
 * @author george
 */
class JohnsonBicycle extends Bicycle {

    protected JohnsonBicycle(int startCadence, int startSpeed, int startGear) {
        cadence = startCadence;
        speed = startSpeed;
        gear = startGear;
        // increment number of bikes in class and assign ID number
        // every constructor call increments the (static) class variable
        id = ++numberOfBikes;
    }
}
