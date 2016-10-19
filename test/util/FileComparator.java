package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author milder
 */
public class FileComparator {
    
    private static String readLines (String filename) throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader(filename));
        String line;
        StringBuilder builder = new StringBuilder();
        while ( (line = bf.readLine()) != null )
            builder.append(line.trim());
        return builder.toString();
    }
    
    public static boolean equals(String a, String b) throws Exception {
        String linesA = readLines(a);
        String linesB = readLines(b);
        
        return linesA.equals(linesB);
    }
    
}
