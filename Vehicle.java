public abstract class Vehicle implements Comparable{
    int price;
    public Vehicle() {

    }
    public Vehicle(int price){
        this.price = price;
    }
    public abstract void move();
    @Override
    public boolean equals(Object other){
        if(other instanceof Vehicle)
            return getPrice() == ((Vehicle) other).getPrice();
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Vehicle){
            if(((Vehicle) o).getPrice() < getPrice())
                return 1;
            else if(((Vehicle) o).getPrice() > getPrice())
                return -1;
        }
        return 0;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

