/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.internal;

import mygame.base.Clue;

/**
 *
 * @author mrucinski
 */
public class InventoryObject {
    private String text = null;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    private int size = 0;
    
    public boolean compareToClue(Clue clue)
    {
        return this.text.contains(clue.getText());                       
    }
}
