/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;

/**
 *
 * @author Marc
 */
public class Debug implements Serializable{
    
    public static final boolean INITIALVALUES = true;
    public static final boolean DEBUG = true;
    
    public static final void out(final String s){
        if(DEBUG){
            System.out.println(s);
        }
    }
    
    public static final void out(Object o){
        if(DEBUG){
            System.out.println(o);
        }
    }
    
}
