package task;

public class Main {
    public static void main(String[] args){
        ProductCatalog catalog = new ProductCatalog();
        Product product1 = new Product(12345, "хлеб", "белый", 25);
        Product product2 = new Product(76567, "молоко", "белый", 50);
        Product product3 = new Product(98654, "молоко", "белый", 45);

        System.out.println("Добавление нового продукта:\n");
        try {
            catalog.createProduct(product1);
            catalog.createProduct(product2);
            catalog.createProduct(product3);
        }
        catch (ProductAlreadyExists e) {
            System.out.println(e.getMessage());
        }
        for (Product product : catalog.getAllProducts()) {
            product.printInfo();
        }
        System.out.println();

        Product product4 = new Product(12345, "шоколад", "молочный", 80);

        System.out.println("Обновление существующего продукта:\n");
        try{
            catalog.updateProduct(product4);
        }
        catch (ProductNotValid e){
            System.out.println(e.getMessage());
        }
        for (Product product : catalog.getAllProducts()) {
            product.printInfo();
        }
        System.out.println();

        System.out.println("Удаление существующего продукта:\n");
        catalog.deleteProduct(12345);
        for (Product product : catalog.getAllProducts()) {
            product.printInfo();
        }
    }
}