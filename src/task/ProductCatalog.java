package task;

import java.util.ArrayList;

public class ProductCatalog {

    ArrayList<Product> LstProducts = new ArrayList<>();

    public ArrayList<Product> getAllProducts(){
        return LstProducts;
    }

    public void createProduct(Product product) throws ProductAlreadyExists{
        for (Product p: LstProducts){
            if (p.getName().equals(product.getName())){
                throw new ProductAlreadyExists("В справочнике уже есть продукт с таким же именем");
            }
        }
        LstProducts.add(product);
        System.out.println("Продукт добавлен");
    }

    public void updateProduct(Product product) throws ProductNotFound, ProductNotValid{
        for (Product p: LstProducts) {
            if (p.getId() == product.getId()) {
                if (product.getName().equals("")) {
                    throw new ProductNotValid("Название продукта отсутствует");
                } else {
                    LstProducts.add(product);
                    LstProducts.remove(p);
                    System.out.println("Продукт обновлен");
                    return;
                }
            }
        }
        throw new ProductNotFound("Продукт с таким идентификатором не существует");
    }

    public void deleteProduct(int id) throws ProductNotFound{
        Product pr = null;
        for (Product p: LstProducts){
            if (p.getId() == id){
                pr = p;
                System.out.println("Продукт удален");
            }
        }
        if (pr != null){
            LstProducts.remove(pr);
        }
        else{
            throw new ProductNotFound("Продукт в справочнике не найден");
        }
    }
}