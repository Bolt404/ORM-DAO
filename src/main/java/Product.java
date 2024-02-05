public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    public Product(int id, int price, String name, String description) {
        setId(id);
        setName(name);
        setDescription(description);
        setPrice(price);
    }
    @Override
    public String toString(){
        return (
                "ID: " + getId() +
                " Name: " + getName() +
                " Description: " + getDescription() +
                " Price: " + getPrice());
    }
//region Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
//endregion
}
