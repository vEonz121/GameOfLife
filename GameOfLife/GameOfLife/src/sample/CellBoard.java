package sample;

public class CellBoard {
    int size;
    Cell[][] gridOfCells;
    CellBoard(int size){
        setSize(size);
        gridOfCells= new Cell[getSize()][getSize()];
    };



    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setCellOnGrid(Cell cell, int x, int y) {
        this.gridOfCells[x][y] = cell;
    }

    public Cell getCellFromGrid(int x,int y){
        return gridOfCells[x][y];
    }

    public boolean isEmptyCell(int x, int y) {
        boolean ans;
        if(gridOfCells[x][y] instanceof EmptyCell)
            ans = true;
        else
            ans = false;
        return ans;
    }

}
