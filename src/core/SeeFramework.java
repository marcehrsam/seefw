/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import core.Produktverwaltung.Produktverwaltung;
import core.Rechnungsverwaltung.Rechnungsverwaltung;
import core.Kundenverwaltung.Kundenverwaltung;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Marc
 */
public class SeeFramework extends JFrame{
    
    private static SeeFramework instance;
    private Kundenverwaltung kdVerwaltung;
    private Produktverwaltung prVerwaltung;
    private Rechnungsverwaltung reVerwaltung;
    
    private static final String logfile = "SeeFramework.log";
    
    private SeeFramework(){
        initUI();
    }
    
    public static SeeFramework getFW(){
        if(instance == null) {
            instance = new SeeFramework();
        }
        return instance;
    }

    public void start() {
        kdVerwaltung = Kundenverwaltung.getKV();
        prVerwaltung = Produktverwaltung.getPV();
        reVerwaltung = Rechnungsverwaltung.getRV();
    }
    private void initUI(){
        
        setSize(new Dimension(1024, 768));
        setTitle(
                Constants.SFW_TITLE_STRING 
                + " "
                + Constants.SFW_VERSION_STRING
        );
        
        
        setVisible(true);
    }
    
    
}
