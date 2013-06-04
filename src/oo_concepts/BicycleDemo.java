/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oo_concepts;

/**
 *
 * @author george
 */
public class BicycleDemo {
    public static void main(String[] args) {
        
        ACMEBicycle bike1 = new ACMEBicycle(10, 10, 1);
        JohnsonBicycle bike2 = new JohnsonBicycle(10, 10, 1);
        MountainBike bike3 =  new MountainBike(10, 10, 1);
        Bicycle bike4 = new JohnsonBicycle(11, 11, 2);
        
        bike1.changeCadence(50);;
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();
        
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        
        bike3.printStates();
        bike4.printStates();
        
        System.out.println(Bicycle.getNumberOfBikes());
        System.out.println(bike1.getNumberOfBikes());
        System.out.println(bike2.getNumberOfBikes());
        System.out.println(ACMEBicycle.getNumberOfBikes());
        
    }
    
}
