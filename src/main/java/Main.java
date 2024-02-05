import java.util.List;

public class Main {
    public static void main(String[] args) {

        // (1) Initialisering af vores repository:
        ProductDAO dao = new ProductDAORepository();

        // (2) Læser hvilke produkter der findes i vores repos
        List<Product> alleProdukter = dao.readAll();
        for (Product p:alleProdukter){
            System.out.println(p);
        }
        System.out.println();

        // (3) Tilføjer (skriver) et nyt produkt til vores repos
        dao.add(new Product(4,2,"mælk","Fra en ko"));

        // (4) Læser hvilke produkter der findes i vores repos

        alleProdukter = dao.readAll();
        for (Product p:alleProdukter){
            System.out.println(p);
        }
        System.out.println();

        System.out.println(dao.read(20));

        System.out.println("OLD " + dao.read(4));
        dao.update(new Product(4,2,"Ost","mere ost"));
        System.out.println("NEW " + dao.read(4));

        System.out.println();

        for (Product p:alleProdukter){
            System.out.println(p);
        }

        System.out.println();

        System.out.println(dao.read(20));
    }
}