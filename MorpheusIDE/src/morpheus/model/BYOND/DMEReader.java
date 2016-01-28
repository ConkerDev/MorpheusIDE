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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import morpheus.model.LineReader;

/**
 *
 * @author obrai_000
 */
public class DMEReader {
    
    public DMEEnviroment readDME(String path){
        LineReader reader = new LineReader();
        List<String> list = new LinkedList<>();
        DMEEnviroment dme = new DMEEnviroment();
        String filedir;
        
        try {
            list = reader.readLines(path);
            for(String s : list){
                if (s.startsWith("//")){                        //Is a comment?
                    
                }
                else if (s.startsWith("#include")){             //Is a file to be included?
                    dme.addFile(s.substring(10, s.length()-2));
                } else if (s.startsWith("#define FILE_DIR ")){  //Is a FILE_DIR directive?
                    dme.setFiledir(s.substring(17, s.length()-1));    //Do we even need them?
                } else if (s.startsWith("#define DEBUG")){      //Is a DEBUG directive?
                    dme.setDebug(true);
                }   
            }
        } catch (IOException e){
            
        }
        return dme;
    }
    
}
