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
public class Case {
    private ArrayList<Page> pages;
    private String title;
    private Solution solution;

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }
}
