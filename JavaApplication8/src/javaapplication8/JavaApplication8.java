package javaapplication8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rasimsafarli
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("forgit.txt");
        OutputStream o;
        try {
            o = new FileOutputStream(f);
            o.write(55);
        } catch (Exception ex) {
            System.out.println("xeha bash verdi");
        }

    }

}
