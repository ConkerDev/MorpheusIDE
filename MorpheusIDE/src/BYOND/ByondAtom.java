/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYOND;

import java.util.ArrayList;

/**
 *
 * @author obrai_000
 */
public class ByondAtom {
    /*  Shamelessly ripped from ByondTools https://github.com/N3X15/ByondTools */
    
    private String path;        //The absolute path of this atom.  ex: */obj/item/weapon/gun*
    private String filename;    //The file this atom originated from.
    private int line;           //The line in the file that this atom comes from
    
    private ByondAtom parent=null;   //The parent to this atom. Can be null in the case of base atoms
    private ArrayList<ByondAtom> children;
    
}
