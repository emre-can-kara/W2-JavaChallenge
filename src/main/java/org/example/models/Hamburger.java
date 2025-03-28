package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;



    Hamburger() {

    }

  public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price= price;
        this.breadRollType = breadRollType;

    }

    public Hamburger(String name, double price, String breadRollType) {
        this.name = name;
        this.price= price;
        this.breadRollType = breadRollType;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }



    public void addHamburgerAddition1(String name, double price) {

        this.addition1Name = name;
        this.addition1Price = price;

    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;

    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;

    }
    // itemize hamburger must print all the ingredients as well as price of and in the burgers


        public double itemizeHamburger() {
            double totalPrice = this.price;
            System.out.println("Total burger price: " + totalPrice);
            System.out.println(this.name + " Burger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
            return totalPrice;

            }



    }


