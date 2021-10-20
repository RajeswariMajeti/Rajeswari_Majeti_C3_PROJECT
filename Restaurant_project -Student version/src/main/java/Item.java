public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }

    @Override
    public boolean equals(Object item) {
        if(this.name.equals(((Item) item).getName()) && this.price == ((Item) item).getPrice()) {
            return true;
        } else {
            return false;
        }
    }
}
