//Written by: Roee Shemesh
//I.D: 209035179
package test;

import java.util.Arrays;
import java.util.Objects;

public class Word{
    private Tile[] tiles;
    private int row;
    private int col;
    private boolean vertical;
    public Word(Tile[] tiles,int row,int col,boolean vertical){
        this.tiles=tiles.clone();
        this.row=row;
        this.col=col;
        this.vertical=vertical;
    }
    public Tile[] getTiles() {
        return this.tiles;
    }
    public int getRow() {return this.row;}
    public int getCol() {
        return this.col;
    }
    public boolean getVertical() {
        return this.vertical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return row == word.row && col == word.col && vertical == word.vertical && Arrays.equals(tiles, word.tiles);
    }
}
