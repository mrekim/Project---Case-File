/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.base;

import java.util.ArrayList;

/**
 *
 * @author mrucinski
 */
public class Page {
    private String name;
    private String text;
    private ArrayList<Clue> clues;
    private ArrayList<Image> images;
    private boolean visible;
    private String visibleOn;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Clue> getClues() {
        return clues;
    }

    public void setClues(ArrayList<Clue> clues) {
        this.clues = clues;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getVisibleOn() {
        return visibleOn;
    }

    public void setVisibleOn(String visibleOn) {
        this.visibleOn = visibleOn;
    }
}
