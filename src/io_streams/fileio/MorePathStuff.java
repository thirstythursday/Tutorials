/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.fileio;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author george
 */
public class MorePathStuff {
    
    public static void main(String[] args) throws IOException {
       
        
        Path absolutePieces = Paths.get("/Users", "george", "Java", "cmdlinejava", "test.txt");
        Path absolute = Paths.get("/Users/george/Java/cmdlinejava/test.txt");
        Path relative = Paths.get("../Java/cmdlinejava/test.txt");
        
        // if you need a path that can be opened in a browser
        // file or folder must exist!
        System.out.format("%s%n", absolutePieces.toUri());
        System.out.format("%s%n", absolute.toUri());
        System.out.format("%s%n", relative.normalize());
        System.out.format("%s%n%n", relative.toUri());
        
        Path currentRelativePath = Paths.get("");
        // to real path is better, cleans up AND returns absolute path if relative
        String s = currentRelativePath.toRealPath().toString();
        System.out.println("Current relative path is: " + s);
        
        System.out.format("%s%n", relative.toString());

        
        Path partial = Paths.get("noexist");
        try {
            Path fp = partial.toRealPath();
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", partial);
            // Logic for case when file doesn't exist.
        } catch (IOException x) {
            System.err.format("%s%n", x);
            // Logic for other sort of file error.
        }

    }
    
}
