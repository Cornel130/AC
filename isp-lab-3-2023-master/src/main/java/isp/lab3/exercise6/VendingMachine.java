package isp.lab3.exercise6;

import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class VendingMachine {
    private static VendingMachine instance;
    private Product[] produse;
    private int coins;

    private VendingMachine(int capacity) {
        this.produse = new Product[capacity];
        this.coins = 0;
    }

    public static VendingMachine getInstance(int capacitate) {
        if (instance == null) {
            instance = new VendingMachine(capacitate);
        }
        return instance;
    }

    public void AddProduse(int id, String name, double price) {
        if (id >= 0 && id < produse.length) {
            produse[id] = new Product(name, price);
        } else {
            System.out.println("ID invalid");
        }
    }

    public void displayProducts() {
        System.out.println("Produse disponibile:\n");
        for (int i = 0; i < produse.length; i++) {
            if (produse[i] != null) {
                System.out.println("ID: " + i + " Denumire: " + produse[i].getName());
            } else {
                System.out.println("ID: " + i + " - Produs indisponibil");
            }
        }
    }

    public void insertCoin(int value) {
        this.coins += value;
    }

    public String selectProduct(int id) {
        if (id >= 0 && id < produse.length && produse[id] != null) {
            if (coins >= produse[id].getPrice()) {
                coins -= produse[id].getPrice();
                return produse[id].getName();
            } else {
                return "Credit insuficient";
            }
        } else {
            return "ID invalid";
        }
    }

    public void displayCredit() {
        System.out.println("Credit disponibil: " + coins);
    }

    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nMeniu:");
            System.out.println("1. Afiseaza produsele disponibile");
            System.out.println("2. Insereaza bani");
            System.out.println("3. Selecteaza produs");
            System.out.println("4. Afiseaza credit disponibil");
            System.out.println("0. Iesire");
            System.out.print("Selecteaza o optiune: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    System.out.print("Introdu valoarea monedei: ");
                    int value = scanner.nextInt();
                    insertCoin(value);
                    break;
                case 3:
                    System.out.print("Introdu ID-ul produsului: ");
                    int productId = scanner.nextInt();
                    String selectedProduct = selectProduct(productId);
                    System.out.println(selectedProduct);
                    break;
                case 4:
                    displayCredit();
                    break;
                case 0:
                    System.out.println("La revedere!");
                    break;
                default:
                    System.out.println("Optiune invalida. Te rog sa incerci din nou.");
                    break;
            }
        } while (option != 0);
    }

    public static void main(String[] args) {
        VendingMachine v1 = VendingMachine.getInstance(5);
        v1.AddProduse(0, "Cola", 2);
        v1.AddProduse(1,"Pepsi",3);
        v1.AddProduse(2,"Fanta",1);
        v1.userMenu();
    }
}
