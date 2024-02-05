import java.util.List;

public interface ProductDAO {
    //CRUD Support.

    boolean add(Product p); //Create

    Product read(int id); //Read. (Single Product.)

    List<Product> readAll(); // Read. (All Products.)

    void update(Product p); // Update. (Single Product.)

    boolean delete(int id); // Delete (Single Product.)
}