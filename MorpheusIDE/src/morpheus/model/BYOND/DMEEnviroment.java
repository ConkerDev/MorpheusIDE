/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpheus.model.BYOND;

import java.util.ArrayList;

/**
 *
 * @author Conker
 */
public class DMEEnviroment {
    private ArrayList<String> filelist;
    private String filedir;
    private boolean debug;

    public DMEEnviroment(){
        filelist = null;
        filedir = null;
        debug = false;
    }
    
    public ArrayList<String> getFilelist() {
        return filelist;
    }

    public boolean addFile(String file) {
        return this.filelist.add(file);
    }

    public String getFiledir() {
        return filedir;
    }

    public void setFiledir(String filedir) {
        this.filedir = filedir;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }
    
    
}
