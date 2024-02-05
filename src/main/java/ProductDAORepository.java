import java.util.ArrayList;
import java.util.List;

public class ProductDAORepository implements ProductDAO {

    private ArrayList<Product> products;

    public ProductDAORepository() {
        products = new ArrayList<>();

        products.add(new Product(1,10,"Kaffe","Filter kaffe"));
        products.add(new Product(2,20,"Smør","Smørbar"));
        products.add(new Product(3,30,"Æg","6 styk"));
        products.add(new Product(20,3000,"Bil","med 4 dæk"));

    }

    @Override
    public boolean add(Product p) {
        this.products.add(p);
        return true;
    }

    @Override
    public Product read(int id) {
        return this.products.get(findIDInArray(id));
    }

    @Override
    public List<Product> readAll() {
        return this.products;
    }

    @Override
    public void update(Product p) {
        int id = p.getId();
        delete(findIDInArray(id));
        add(p);
    }

    @Override
    public boolean delete(int id) {
        this.products.remove(findIDInArray(id));
        return true;
    }
    private int findIDInArray(int id){
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if(p.getId() == id) {
                index = i;
            }
        }
        return index;
    }
}
