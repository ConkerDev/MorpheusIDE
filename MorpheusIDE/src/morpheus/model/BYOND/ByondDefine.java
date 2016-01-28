/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpheus.model.BYOND;

/**
 *
 * @author Conker
 */
class ByondDefine {
    private final String defineName;
    private String value;
    
    public ByondDefine(String name, String val){
        this.defineName = name;
        this.value = val;
    }
    
    public String getName(){
        return defineName;
    }
    
    public String getValue(){
        return value;
    }
    
    public void setValue(String val){
        this.value = val;
    }
}
