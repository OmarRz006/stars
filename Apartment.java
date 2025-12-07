package OOP;
public class Apartment {
   private char size;
   private int rooms;

    public Apartment() {
        size='S';
        rooms=3;
    }

    public Apartment(char size, int rooms) {
        this.size = size;
        this.rooms = rooms;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if(this.size=='L' || this.size=='S'){
        this.size = size;
        }else{
            System.out.println("Error");
        }
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if(this.rooms>=1 || this.rooms<=8){
        this.rooms = rooms;
        }else{
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return "Apartment{" + "size=" + size + ", rooms=" + rooms + '}';
    }
   public double getSizeCost(){
       double Scost=0;
       switch(size){
           case 'S':Scost=15000;break;
           case 'L':Scost=30000;break;
       }
       return Scost;
   }
   public double getRoomsCost(){
       double Rcost=0;
       if(rooms>=1 || rooms<=2){
           Rcost=rooms*4000;
       }
       if(rooms>=3 || rooms<=5){
           Rcost=rooms*3000;
       }
       if(rooms>=6 || rooms<=8){
           Rcost=rooms*2500;
       }
       return Rcost;
   }
   public double getSaleCost(){
       double SaleCost;
       SaleCost=getRoomsCost()+getSizeCost()+5000;
       return SaleCost;
   }
}
