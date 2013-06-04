/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oo_concepts;

/**
 *
 * @author george
 */
abstract class Bicycle {
    
    protected int cadence;
    protected int gear;
    protected int speed;
    protected int id;
    // class variable shared among all subclasses.
    protected static int numberOfBikes = 0;

    protected void changeCadence(int newValue) {
        cadence = newValue;
    }

    protected void changeGear(int newValue) {
        gear = newValue;
    }

    protected void speedUp(int increment) {
        speed = speed + increment;
    }
    
    protected void applyBrakes(int increment) {
        speed = speed - increment;
    }
    
    protected int getID() {
        return id;
    }
    
    // To use this method it needs to be static, because as an abstract
    // class there will not be any "Bicycle" objects to use it on.
    protected static int getNumberOfBikes() {
        return numberOfBikes;
    }
    
    protected void printStates() {
        String kind = "";
        kind = this.getClass().getName();
        System.out.println("Bike Type: " + kind + " cadence:" + cadence + " speed:" + speed +
                " gear:" + gear + " ID: " + id);
    }
    
}
