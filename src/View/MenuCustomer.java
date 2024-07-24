package View;

import Manager.CustomerManager;
import model.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCustomer {
    CustomerManager customerManager = new CustomerManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMenuCustomer() {
        int choice;
        do {
            System.out.println("=======Menu Customer========\n1.Thêm Khách hàng mới :\n2.Sửa thông tin KH:\n3 Xoá thông tin KH :\n4: Hiển thị tất cả :\n0 : thoát :");
            System.out.println("Nhập lựa chọn :");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 4 :
                    showAllCustomer();
                    break;
                case 3 :
                    showMenuRemove();
                    break;



            }
        } while (choice != 0);

    }

    public void showMenuAdd() {
        System.out.println("=======Menu thêm khách hàng mới :========");
        System.out.println("Nhập Id khách hàng :");
        int id = inputInt.nextInt();
        System.out.println("Nhập tên khách hàng :");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi khách hàng :");
        int age = inputInt.nextInt();
        Customer customer = new Customer(id, name, age);
        customerManager.add(customer);
        System.out.println("Thêm thông tin khách hàng thành công !");
    }
    public void showAllCustomer(){
        System.out.println("====Danh sách thông tin khách hàng là :=========");
        ArrayList<Customer> customers = customerManager.findAll();
        if (customers == null) {
            System.out.println("Danh sách khách hàng rỗng.");
            return;
        }
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    public void showMenuRemove(){
        System.out.println("======Menu xóa thông tin khách hàng :=====");
        System.out.println("Nhập id khách hàng cần xóa : ");
        int id = inputInt.nextInt();
        customerManager.remove(id);
        System.out.println("xóa thông tin thành công !");
    }
}
