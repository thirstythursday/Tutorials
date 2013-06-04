/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.fileio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author george
 */
public class PathCombining {
    
    public static void main(String[] args) {
        
        Path javaPath = Paths.get(System.getProperty("user.home"));
        System.out.format("javaPath is: %s%n", javaPath);
        
        Path pathToDest = Paths.get("Java/cmdlinepath");
        System.out.format("pathToDest is: %s%n", pathToDest);
        
        // combines two paths into a third variable, or straight toString()
        Path combinedPaths = javaPath.resolve(pathToDest);
        System.out.format("combinedPaths is: %s%n", combinedPaths);
        System.out.format("or another way: %s%n", javaPath.resolve(pathToDest));
    }
    
}
