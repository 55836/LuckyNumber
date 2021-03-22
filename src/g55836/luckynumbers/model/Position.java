package g55836.luckynumbers.model;

/**
 * Position that we will use for the Board
 * It only return the row and the column
 * @author Kerdoudi Zakaria
 * 55836
 *
 */
public class Position
{
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() { return row; }
    public int getColumn() { return column; }
}
