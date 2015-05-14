/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Rechnungsverwaltung;

/**
 *
 * @author Marc
 */
public class Rechnungsverwaltung {
    
    private static Rechnungsverwaltung rv;
    
    private Rechnungsverwaltung(){
        
    }
    
    public static Rechnungsverwaltung getRV(){
        if(rv == null){
            rv = new Rechnungsverwaltung();
        }
        return rv;
    }
}
