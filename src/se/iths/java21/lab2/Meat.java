package se.iths.java21.lab2;

import java.util.ArrayList;
import java.util.List;

public class Meat extends Products {
    private String productName;
    private int price;
    private int eanCode;
    private String tradeMark = "Ica";
    private int stock;

    List<Meat> meatProducts = new ArrayList<>();

    public static void main(String[] args) {
        Meat m = new Meat();
    }

    public Meat(String productName,int price, int stock, String tradeMark, int eanCode) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.tradeMark = tradeMark;
        this.eanCode = eanCode;
    }
    public Meat(){

    }

    public void setProducts(){
        meatList.add(new Meat("Cow",100, stock, tradeMark,100 ));
        meatList.add(new Meat("Chicken",50,stock, tradeMark, 101  ));
        addStock(0);
        addStock(1);

    }

    public void getProducts(){
        int counter = 1;
        for (Meat m : meatList) {
            System.out.print(counter+".");
            System.out.printf("%s, Pris:%dkr I lager:%d \n Gjort av: %s \n eanCode: %d,  \n",m.productName, m.price,
                    m.stock,m.tradeMark, m.eanCode );
            counter++;
        }
    }

    public String getName(int i){
        return meatList.get(i).productName;
    }

    public int getPrice(int i){
        return meatList.get(i).price;
    }
    public int addStock(int i){
       return meatList.get(i).stock += 1;
    }

    public int stock(int i){
        return meatList.get(i).stock;
    }

    public int removeStock(int i){
        return meatList.get(i).stock -= 1;
    }




}
