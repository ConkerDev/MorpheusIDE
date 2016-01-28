/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpheus.model.BYOND;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import morpheus.model.LineReader;

/**
 *
 * @author obrai_000
 */
public class DMEReader {
    
    public List<String> readDME(String path){
        LineReader reader = new LineReader();
        List<String> list = new LinkedList<>();
        
        try {
            list = reader.readLines(path);
            for(String s : list){
                if (s.startsWith("//")){
                    list.remove(s);
                }
            }
        } catch (IOException e){
            
        }
        return list;
    }
    
}
