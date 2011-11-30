/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.internal;

import mygame.base.Case;

/**
 *
 * @author mrucinski
 */
public class LoadCase {
    public Case currentCase = new Case();
    
    public void Load()
    {
        
        currentCase.setPages(null); //dummy
        currentCase.setTitle("Fall 1"); //dummy
    }
}
