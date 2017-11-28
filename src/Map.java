public class Map{
    Map.Field [][] fields;

    public Map(int sizeX, int sizeY){
        this.fields = new Map.Field[sizeX][sizeY];
    }


    public class Field{
        private Piece piece;

        public Field(Piece p){
            this.piece = p;
        }

        public Field(){
            this.piece = null;
        }
    }
}
