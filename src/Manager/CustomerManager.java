package Manager;

import model.Customer;

import java.util.ArrayList;

public class CustomerManager implements IManager<Customer> {
    ArrayList<Customer> listCustomers;
    public CustomerManager() {
        listCustomers = new ArrayList<>();
    }

    @Override
    public void add(Customer customer) {
        listCustomers.add(customer);
    }

    @Override
    public void remove(int id) {
        int index =findIndexbyId(id);
        listCustomers.remove(index);

    }

    @Override
    public int findIndexbyId(int id) {
        for (int i = 0; i < listCustomers.size(); i++) {
            if (listCustomers.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int id, Customer customer) {
        int index = findIndexbyId(id);
        listCustomers.set(index, customer);

    }

    @Override
    public ArrayList<Customer> findAll() {
        return listCustomers;
    }
}
