public class Map{
    private Map.Field [][] fields;
    private int sizeX;
    private int sizeY;

    public Map(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.fields = new Map.Field[sizeX][sizeY];
        generateEmptyMap(this.fields);
    }

    public void generateEmptyMap(Map.Field[][] m){
        for(int i = 0; i < sizeX; i++){
            m[i][0] = new Field(new Structure(i, 0));
        }
        for(int i = 1; i < sizeY-1; i++){
            for(int j = 0; j < sizeX; j++){
                if(j == 0 || j == sizeX-1){
                    m[j][i] = new Field(new Structure(j, i));
                } else {
                    m[j][i] = new Field();
                }
            }
        }
        for(int i = 0; i < sizeX; i++){
            m[i][sizeY-1] = new Field(new Structure(i, sizeY-1));
        }
    }

    public void addPiece(Piece p){
        int x = p.getX();
        int y = p.getY();
        if(x < sizeX && y < sizeY && this.fields[x][y].piece == null){
            this.fields[x][y].piece = p;
        }
    }

    public void movePiece(Piece p, int xMove, int yMove){
        int x = p.getX();
        int y = p.getY();
        int xNew = x + xMove;
        int yNew = y + yMove;
        if(this.fields[xNew][yNew].isEmpty()){
            p.setX(xNew);
            p.setY(yNew);
            this.fields[x][y].clearField();
            this.addPiece(p);

        }

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sizeY; i++){
            for(int j = 0; j < sizeX; j++){
                sb.append(this.fields[j][i]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public class Field{
        private Piece piece;

        public Field(Piece p){
            this.piece = p;
        }

        public Field(){
            this.piece = null;
        }

        public boolean isEmpty(){
            if(this.piece == null){
                return true;
            } else {
                return false;
            }
        }

        public void clearField(){
            this.piece = null;
        }

        public String toString(){
            if(this.isEmpty()){
                return " ";
            } else {
                return this.piece.toString();
            }
        }
    }
}
