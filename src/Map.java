public class Map{
    Map.Field [][] fields;
    int sizeX;
    int sizeY;

    public Map(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.fields = new Map.Field[sizeX][sizeY];
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

        public String toString(){
            if(this.isEmpty()){
                return " ";
            } else {
                return this.piece.toString();
            }
        }
    }
}
