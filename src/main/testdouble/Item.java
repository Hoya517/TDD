package main.testdouble;

public class Item {
    private String name;
    private String category;
    private int price;

    public Item(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getCategory() {
        return category;
    }
}
