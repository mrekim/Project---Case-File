/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.base;

/**
 *
 * @author mrucinski
 */
public class Image {

	//definitions
    private String fileName;
    private String name;
    private boolean clue;
    private int xPos;
    private int yPos;
    private int xFrom;
    private int xTo;
    private int yFrom;
    private int yTo;

	//getters and setters
    public boolean isClue() {
        return clue;
    }

    public void setClue(boolean clue) {
        this.clue = clue;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getxFrom() {
        return xFrom;
    }

    public void setxFrom(int xFrom) {
        this.xFrom = xFrom;
    }

    public int getxTo() {
        return xTo;
    }

    public void setxTo(int xTo) {
        this.xTo = xTo;
    }

    public int getyFrom() {
        return yFrom;
    }

    public void setyFrom(int yFrom) {
        this.yFrom = yFrom;
    }

    public int getyTo() {
        return yTo;
    }

    public void setyTo(int yTo) {
        this.yTo = yTo;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
