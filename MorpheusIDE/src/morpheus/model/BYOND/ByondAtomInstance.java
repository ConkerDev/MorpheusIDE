/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpheus.model.BYOND;

import morpheus.model.BYOND.ByondAtom;

/**
 *
 * @author ConkerDev <https://github.com/ConkerDev>
 */
public class ByondAtomInstance {

    private ByondAtom atom;
    private long ID;

    private Coordinates coords;
    
    private static class Coordinates {
        public int x;
        public int y;
        public int z;
        Coordinates(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

}
