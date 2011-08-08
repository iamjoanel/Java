/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divinagracialab5;

/**
 *
 * @author jmd11631
 */
public class Cage {
    //attributes
    private int length;
    private int width;
    private int height;
    private boolean clean;
    private boolean covered;

    //constructor
    public Cage()
    {
        this.length = 10;
        this.width = 10;
        this.height = 10;
        this.clean = true;
        this.covered = true;
    }

    //setters

    public void setLength(int length)
    {
        this.length = length;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    //getters
    public int getLength()
    {
        return this.length = length;
    }

    public int getWidth()
    {
        return this.width = width;
    }

    public int getHeight()
    {
        return this.height = height;
    }

    public void cleanned()
    {
        //???
    }

    public boolean isClean()
    {
        return this.clean;
    }

    public boolean isCovered()
    {
        return this.covered;
    }
    
}
