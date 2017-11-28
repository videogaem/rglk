public class Piece{
    protected boolean exists;
    protected int x;
    protected int y;
    protected char symbol;

    public Piece(int x, int y){
        this.x = x;
        this.y = y;
        this.exists = true;
    }

    public String toString(){
        return Character.toString(this.symbol);
    }
}
