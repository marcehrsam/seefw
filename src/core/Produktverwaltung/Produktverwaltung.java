/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Produktverwaltung;

/**
 *
 * @author Marc
 */
public class Produktverwaltung {
    
    private static Produktverwaltung pv;
    
    private Produktverwaltung(){
    
    }
    
    public static Produktverwaltung getPV(){
        if(pv == null){
            pv=new Produktverwaltung();
        }
        return pv;
    }
    
}
