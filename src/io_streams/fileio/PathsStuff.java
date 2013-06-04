/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.fileio;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author george
 */
public class PathsStuff {

    public static void main(String[] args) {
        
        /*
         * The file referenced by a path object do not have to exist!
         * The form of the path is what is important. The syntax.
         */
        
        String home = System.getProperty("user.home");
        // should be /Users/george in this case
        System.out.println("home system property is: " + home);
        
        // assembling paths using get
        Path tempPath = Paths.get("/tmp/JavaPathsTemp");
        Path cmdlinejavaPath = Paths.get(home, "Java", "cmdlinejava");
        System.out.println(cmdlinejavaPath.toString());
        
        // make a URI and assign it to a path object
        URI u = URI.create("file:///Users/george/Java/cmdlinejava/URI");
        Paths.get(u);
        System.out.println(u.toString());
        
        Path path = Paths.get("/users/george/Java/differentformats");
        
        // whole path, cleaned up
        System.out.format("%ntoString: %s%n", path.toString());
        
        // last part of the path, filename or directory?
        System.out.format("getFileName: %s%n", path.getFileName());
        
        // returns element corresponding to specified index
        System.out.format("getName(0): %s%n", path.getName(0));
        
        // returns the number of elements
        System.out.format("getNameCount: %d%n", path.getNameCount());
        
        // returns the subsequence of the path, not including a root element
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        
        // path of parent directory
        System.out.format("getParent: %s%n", path.getParent());
        
        // path of root directory
        System.out.format("getRoot: %s%n", path.getRoot());
        
        
        Path path2 = Paths.get("Java/relativepath");
        
        // whole path, cleaned up
        System.out.format("%ntoString: %s%n", path2.toString());
        
        // last part of the path, filename or directory?
        System.out.format("getFileName: %s%n", path2.getFileName());
        
        // returns element corresponding to specified index
        System.out.format("getName(0): %s%n", path2.getName(0));
        
        // returns the number of elements
        System.out.format("getNameCount: %d%n", path2.getNameCount());
        
        // returns the subsequence of the path, not including a root element
        System.out.format("subpath(0,2): %s%n", path2.subpath(0,2));
        
        // path of parent directory
        System.out.format("getParent: %s%n", path2.getParent());
        
        // path of root directory
        System.out.format("getRoot: %s%n", path2.getRoot());
        
        //normalize paths that contain . or directory/.. occurrences
    }
}
