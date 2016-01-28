/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpheus.model.BYOND;

/**
 *
 * @author obrai_000
 */
class ByondDefine<T> {
    private final String defineName;
    private T value;
    
    public ByondDefine(String name, T val){
        this.defineName = name;
        this.value = val;
    }
    
    public String getName(){
        return defineName;
    }
    
    public T getValue(){
        return value;
    }
    
    public void setValue(T val){
        this.value = val;
    }
}
