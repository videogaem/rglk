public class Piece{
    protected boolean exists;
    protected int x;
    protected int y;
    protected char symbol;

    public Piece(int x, int y, char symbol){
        this.x = x;
        this.y = y;
        this.exists = true;
        this.symbol = symbol;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String toString(){
        return Character.toString(this.symbol);
    }
}
