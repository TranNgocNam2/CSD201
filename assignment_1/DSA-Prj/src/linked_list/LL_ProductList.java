/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

import com.Product;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class LL_ProductList extends SLL {

    Scanner sc = null;

    public LL_ProductList() {
        super();
        sc = new Scanner(System.in);
    }

    private SLLNode<Product> find(String code) {
        SLLNode<Product> ref;
        for (ref = this.getHead(); ref != null; ref = ref.next) {
            if (ref.info.getCode().equals(code)) {
                return ref;
            }
        }
        return null;
    }

    public void add() {
        String code = "", name = "";
        int price = 0;
        int warranty = 0;
        System.out.println("Add new Product: ");
        boolean proceed = false;
        do {
            System.out.println("Enter product's code: ");
            code = sc.nextLine().toUpperCase();
            proceed = find(code) != null;
            if (proceed == true) {
                System.out.println("This code is duplicated!");
            }
        } while (proceed);
        do {
            System.out.println("Enter product's name: ");
            name = sc.nextLine().trim();
            proceed = (name.length() == 0);
            if (proceed == true) {
                System.out.println("Product's must be inputted!");
            }
        } while (proceed);
        do {
            System.out.println("Enter product's price: ");
            price = Integer.parseInt(sc.nextLine());
            if (price <= 0) {
                System.out.println("Product's price must be greater than 0!");
            }
        } while (price <= 0);
        do {
            System.out.println("Enter product's warranty: ");
            warranty = Integer.parseInt(sc.nextLine());
            if (warranty <= 0) {
                System.out.println("Product's warranty must be greater than 0!");
            }
        } while (warranty <= 0);
        Product pro = new Product(code, name, price, warranty);
        this.addToTail(pro);
        System.out.println("This employee is added");
    }

    public void remove() {
        if (this.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            String code = "";
            System.out.print("Enter the code of product which will be removed: ");
            code = sc.nextLine().toUpperCase();
            SLLNode<Product> ref = find(code);
            if (ref == null) {
                System.out.println("Product does not exist!");
            } else {
                this.delete(ref.info);
                System.out.println("This product has been removed!");
            }
        }
    }

    public void updatePrice() {
        if (this.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            String code = "";
            System.out.print("Enter the code of product which will be updated price: ");
            code = sc.nextLine().toUpperCase();
            SLLNode<Product> ref = find(code);
            if (ref == null) {
                System.out.println("Product does not exist!");
            } else {
                int oldPrice = ref.info.getPrice();
                int newPrice;
                do {
                    System.out.println("Old price" + oldPrice + ", new price:");
                    newPrice = Integer.parseInt(sc.nextLine());
                } while (newPrice <= oldPrice);
                ref.info.setPrice(newPrice);
                System.out.println("Product's price has been updated");
            }
        }
    }
    
        public void updateWarranty() {
        if (this.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            String code = "";
            System.out.print("Enter the code of product which will be updated warranty: ");
            code = sc.nextLine().toUpperCase();
            SLLNode<Product> ref = find(code);
            if (ref == null) {
                System.out.println("Product does not exist!");
            } else {
                int oldWarranty = ref.info.getWarranty();
                int newWarranty;
                do {
                    System.out.println("Old warranty" + oldWarranty + ", new warranty: ");
                    newWarranty = Integer.parseInt(sc.nextLine());
                } while (newWarranty <= oldWarranty);
                ref.info.setWaranty(newWarranty);
                System.out.println("Product's warranty has been updated!");
            }
        }
    }

    public void print() {
        if (this.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("PRODUCT LIST");
            this.printAll();
        }
    }
}
