/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpheus.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ConkerDev <https://github.com/ConkerDev>
 */
public class LineReader {
    //Static class?

    public List<String> readLines(String path) throws IOException {
        List<String> textLines = new LinkedList<>();
        try {
            File file = new File(path);
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    textLines.add(line.trim());
                }
                bufferedReader.close();
            }
        } catch (IOException e) {
            throw e;
        }
        return textLines;
    }
    
    public LineReader(){
    }
    
}
