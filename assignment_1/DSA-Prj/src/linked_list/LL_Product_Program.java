/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

import com.Menu;

/**
 *
 * @author admin
 */
public class LL_Product_Program {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new product");
        menu.add("Remove an prodiuct");
        menu.add("Update price");
        menu.add("Update waranty");
        menu.add("Print all product");
        menu.add("Quit");
        LL_ProductList proList = new LL_ProductList();
        int userChoice;
        do {
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case 1:
                    proList.add();
                    break;
                case 2:
                    proList.remove();
                    break;
                case 3:
                    proList.updatePrice();
                    break;
                case 4:
                    proList.updateWarranty();
                    break;
                case 5:
                    proList.print();
                    break;
                default:
                    System.out.println("Goodbye!");
            }
        } while (userChoice > 0 && userChoice < 6);

    }
}
