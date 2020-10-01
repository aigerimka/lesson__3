package task;

public class Product {
    private long id;
    private String name;
    private String colour;
    private int price;

    public Product(){}

    public Product(long id, String name, String colour, int price){
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getColour(){
        return colour;
    }

    public int getPrice(){
        return price;
    }

    public void printInfo(){
        System.out.println("Идентификатор: " + id + "; Имя: " + name + "; Цвет: "
                + colour + "; Цена: " + price);
    }

    public String toString(){
        return id + "_" + name;
    }
}