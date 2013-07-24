/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeoross;

/**
 *
 * @author george
 */
public class InterfaceLesson {
    
    interface Monster {
        void menace();
    }
    
    interface DangerousMonster extends Monster {
        void destroy();
    }
    
    static class DragonZilla implements DangerousMonster {
        @Override
        public void menace() {}
        @Override
        public void destroy() {}
    }
    
    interface Lethal {
        void kill();
    }
    
    interface Vampire extends DangerousMonster, Lethal {
        void drinkBlood();
    }
    
    static class VeryBadVampire implements Vampire {
        @Override
        public void menace() {}
        @Override
        public void destroy() {}
        @Override
        public void kill() {}  
        @Override
        public void drinkBlood() {}
    }
    
}
