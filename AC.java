package OOP;
public class AC {
String brand;
char type;
double size;

    public AC() {
        brand="LG";
        type='r';
        size=1.5;
    }

    public AC(String brand, char type, double size) {
        this.brand = brand;
        this.type = type;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AC{" + "brand=" + brand + ", type=" + type + ", size=" + size + '}';
    }
    public double getSizePrice(){
        double Scost=0;
        if(this.size>=1 || this.size<2){
            Scost=size*50;
        }
        if(this.size>=2 || this.size<5){
            Scost=size*70;
        }
        if(this.size>=5 || this.size<=8){
            Scost=size*10;
        }
        return Scost;
    }
    public double getTypePrice(){
        double Tcost=0;
        switch(type){
            case 'r':Tcost=200;break;
            case 'i':Tcost=400;break;
        }
        return Tcost;
    }
    public double getTotalPrice(){
        double TotalCost=0;
        TotalCost=getSizePrice()+getTypePrice()+10;
        return TotalCost;
    }
}
