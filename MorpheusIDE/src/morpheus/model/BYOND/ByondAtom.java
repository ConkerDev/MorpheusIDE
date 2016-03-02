/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpheus.model.BYOND;

import java.util.ArrayList;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


/**
 *
 * @author ConkerDev <https://github.com/ConkerDev>
 * @author Rob "N3X15" Nelson <https://github.com/N3X15>
 */

public class ByondAtom {
    /*  Shamelessly ripped from ByondTools https://github.com/N3X15/ByondTools */
    
    private final StringProperty path;        //The absolute path of this atom.  ex: */obj/item/weapon/gun*
    private final StringProperty filename;    //The file this atom originated from.
    private final IntegerProperty line;           //The line in the file that this atom comes from
    
    private final ObjectProperty<ByondAtom> parent;   //The parent to this atom. Can be null in the case of base atoms
    private ArrayList<ByondAtom> children = new ArrayList<>();;

    /**
     * Constructor for a Byond Atom (code wise)
     * @param path 
     * @param filename
     * @param line
     * @param parent
     */
    public ByondAtom(String path, String filename, int line, ByondAtom parent) {
        this.path = new SimpleStringProperty(path);
        this.filename = new SimpleStringProperty(filename);
        this.line = new SimpleIntegerProperty(line);
        this.parent = new SimpleObjectProperty<>(parent);
    }

    public ArrayList<ByondAtom> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<ByondAtom> children) {
        this.children = children;
    }
    
    public boolean addChild(ByondAtom child){
        return this.children.add(child);
    }
    
    public String getPath() {
        return path.get();
    }

    public void setPath(String path) {
        this.path.set(path);
    }

    public StringProperty getPathProperty() {
        return path;
    }

    public String getFilename() {
        return filename.get();
    }
    
    public void setFilename(String filename) {
        this.filename.set(filename);
    }
    
    public StringProperty getFilenameProperty() {
        return filename;
    }

    public int getLine() {
        return line.get();
    }
    
    public void setLine(int line) {
        this.line.set(line);
    }

    public IntegerProperty getLineProperty() {
        return line;
    }
    
    public ObjectProperty<ByondAtom> getParent() {
        return parent;
    }
    
    public void setParent(ByondAtom par) {
        this.parent.set(par);
    }

}

