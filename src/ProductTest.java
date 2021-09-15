public class ProductTest {

    public static void main(String[] args) {


        Product[] products = new Product[5];
        products[0] = new Product("Milk", 2.19);
        products[1] = new Product("Bread", 1.75);
        products[2] = new Product("Eggs", 3.45);
        products[3] = new Product("Cereal", 3.99);
        products[4] = new Product("Cheese", 2.99);

    }

    public static double findAveragePrice(Product[] products) {
        double totalPrice = 0;
        for(Product product : products) {

            System.out.println(product.getName() + " " + product.getPriceinCents());
        }
        return totalPrice / products.length;
    }


 }


