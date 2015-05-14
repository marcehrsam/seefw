/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Kundenverwaltung;

/**
 *
 * @author Marc
 */
public class Kundenverwaltung {
    
    private static Kundenverwaltung kv;
    
    private Kundenverwaltung(){
        
    }
    
    public static Kundenverwaltung getKV(){
        if(kv == null) kv = new Kundenverwaltung();
        return kv;
    }
    
}
