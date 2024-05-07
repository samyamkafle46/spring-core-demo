package pojo;

public class Products {
    private int id;
    private String name;
    private int price;
    private int quantityInStock;

    public Products() {}

    public Products(int id, String name, int price, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void getData() {
        System.out.println(getId() + "\t" + getName()+"\t"+getPrice()+"\t"+getQuantityInStock());
    }

}
