/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeoross;

import georgeoross.InterfaceLesson.DangerousMonster;
import georgeoross.InterfaceLesson.DragonZilla;
import georgeoross.InterfaceLesson.Lethal;
import georgeoross.InterfaceLesson.Monster;
import georgeoross.InterfaceLesson.Vampire;
import georgeoross.InterfaceLesson.VeryBadVampire;

/**
 *
 * @author george
 */
public class HorrorShow {
    
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        // w(barney); can't do this
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
    
    static void u(Monster b) { b.menace(); }
    
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    
    static void w(Lethal l) { l.kill(); }
    
}
