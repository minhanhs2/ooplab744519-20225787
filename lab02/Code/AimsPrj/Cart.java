package AimsPrj;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    int Order;
    List<DigitalVideoDisc> listDVDInCart = new ArrayList<>();

    public void showbill() {
        if (listDVDInCart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("List of DVDs in cart:");
        for (DigitalVideoDisc dvd : listDVDInCart) {
            System.out.println(dvd.getName() + " - " + dvd.getprice());
        }
        System.out.println("Your bill: " + totalPrice());
    }

    public void remove(String dvdTitle) {
        for (int i = 0; i < listDVDInCart.size(); i++) {
        	DigitalVideoDisc dvd = listDVDInCart.get(i);
            if (dvd.getName().equals(dvdTitle)) {
                listDVDInCart.remove(i);
                Order--;
                System.out.println("Removed " + dvdTitle + " from cart.");
                return;
            }
        }
        System.out.println( dvdTitle + " not found in cart.");
    }

    public void addDVD(DigitalVideoDisc dvd) {
        listDVDInCart.add(dvd);
        Order++;
        System.out.println("Already added" + dvd.getName() + " to cart.");
    }

    public double totalPrice() {
        double total = 0;
        for (DigitalVideoDisc dvd : listDVDInCart) {
            total += dvd.getprice();
        }
        return total;
    }

    public void bill() {
        if (listDVDInCart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("List of DVDs in cart:");
        for (DigitalVideoDisc dvd : listDVDInCart) {
            System.out.println(dvd.getName() + " - " + dvd.getprice());
        }
        System.out.println("Your bill: " + totalPrice());
    }

    public void searchDVD(String dvdTitle) {
        for (DigitalVideoDisc dvd : listDVDInCart) {
            if (dvd.getName().equals(dvdTitle)) {
                System.out.println("DVD's detail:");
                dvd.ShowDetail();
                return;
            }
        }
        System.out.println("DVD '" + dvdTitle + "' not found in cart.");
    }
}