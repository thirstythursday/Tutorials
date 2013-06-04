/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io_streams.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author george
 */
public class FileManipulation {
    
    public static void main(String[] args) {
        Path workingDirectory = Paths.get("user.home", "Java", "cmdlinejava");
        Path fileAPath = workingDirectory.resolve("filea.txt");
        Path fileBPath = workingDirectory.resolve("fileb.txt");
        
        // create a couple of files
        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileAPath.toString()))) {
            
            br.write("This is filea.txt test text");
            
        } catch (FileSystemException ex) {
            System.err.format("File System Exception: %s%n", ex.getReason());
        } catch (IOException ex) {
            System.err.format("IOException: %s%n", ex);
        }
        
    }
    
}
