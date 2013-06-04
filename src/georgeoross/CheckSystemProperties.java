/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeoross;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author george
 */
public class CheckSystemProperties {
    
    public static void main(String[] args) {

        System.out.format("The list of system properties for this run is: %n%n");
        System.out.format("java.version property is: %s%n", System.getProperty("java.version"));
        System.out.format("java.vendor property is: %s%n", System.getProperty("java.vendor"));
        System.out.format("java.vendor.url property is: %s%n", System.getProperty("java.vendor.url"));
        System.out.format("java.home property is: %s%n", System.getProperty("java.home"));
        System.out.format("java.class.version property is: %s%n", System.getProperty("java.class.version"));
        System.out.format("java.class.path property is: %s%n", System.getProperty("java.class.path"));
        System.out.format("os.name property is: %s%n", System.getProperty("os.name"));
        System.out.format("os.arch property is: %s%n", System.getProperty("os.arch"));
        System.out.format("os.version is: %s%n", System.getProperty("os.version"));
        System.out.format("file.separator is: %s%n", System.getProperty("file.separator"));
        System.out.format("path.separator is: %s%n", System.getProperty("path.separator"));
        System.out.format("line.separator is always \\n on UNIX and \\r\\n on Windows.%n");
        System.out.format("user.name is: %s%n", System.getProperty("user.name"));
        System.out.format("user.home is: %s%n", System.getProperty("user.home"));
        System.out.format("user.dir is %s%n%n", System.getProperty("user.dir"));
        
        System.out.format("Now come the environment variables!: %n");
        Map<String, String> environment = new HashMap<String, String>(System.getenv());
        Iterator it = environment.keySet().iterator();
        while(it.hasNext()){
            System.out.format("%s: %s%n" , it.next() ,environment.get(it));
        }
    }
}
