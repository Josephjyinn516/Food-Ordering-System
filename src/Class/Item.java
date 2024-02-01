package Class;

public abstract class Item {

    private int itemID;
    private String name;
    private double price;
    private String description;

    public Item(int itemID, String name, double price, String description)
    {
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString()
    {
        return("Item ID: " + itemID + "\n" + "Name: " + name + "\n" + "Price: " + price);
    }
}
