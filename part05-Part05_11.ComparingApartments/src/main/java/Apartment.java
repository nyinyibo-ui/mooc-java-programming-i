
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquares(){
        return this.squares;
    }
    
    public int getPricePerSquare(){
        return this.princePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        // if the object square area is larger than compared object return true else return false
        if (this.squares > compared.getSquares()) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        //calculate object total price
        int objectPrice=this.squares*this.princePerSquare;
        //calculate compared object total price
        int comparedPrice=compared.getSquares()*compared.getPricePerSquare();
        // if the object more expensive than the compared extract compared price from object price
        if (this.moreExpensiveThan(compared)){
            return (objectPrice-comparedPrice);
        }
        return (comparedPrice-objectPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.squares*this.princePerSquare>compared.getSquares()*compared.getPricePerSquare()){
            return true;
        }
        return false;
    }
}
