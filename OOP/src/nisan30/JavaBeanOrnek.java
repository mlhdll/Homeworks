/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nisan30;

/**
 *
 * @author LENOVO
 */
public final class JavaBeanOrnek {

    private final String name;
    
    //public JavaBeanOrnek(){
    //    
    //}
    
    public JavaBeanOrnek(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    //public void setName(String name){
    //    this.name = name;
    //}
    
    public static void main(String [] args){
        String str = "merhaba dünya";
        str = str.replace("merhaba","selam");
        System.out.println(str);
    }
    
    
}
