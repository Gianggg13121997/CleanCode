package Manager;

import model.Product;

import java.util.ArrayList;

public class ProductManager implements  IManager<Product>{
    ArrayList<Product> list;
    public ProductManager(){
        list = new ArrayList<>();
    }
    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void remove(int id) {
        int index = findIndexbyId(id);
        list.remove(index);

    }

    @Override
    public int findIndexbyId(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int id, Product product) {
        int index = findIndexbyId(id);
        list.set(index, product);


    }
    public Product getProductById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        }return null;
    }

    @Override
    public ArrayList<Product> findAll() {
        return list;
    }
}