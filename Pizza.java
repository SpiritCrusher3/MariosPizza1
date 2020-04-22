package com.Mikkel;
//test
//Test2

public class Pizza {

    private int nr;
    private String navn;
    private int pris;
    private String toppings;

    public Pizza(int nr, String navn, int pris, String toppings){
        this.nr = nr;
        this.navn = navn;
        this.pris = pris;
        this.toppings = toppings;
    }

    //gettere

    public int getNr() {
        return nr;
    }

    public String getNavn(){
        return navn;
    }

    public int getPris(){
        return pris;
    }

    public String getToppings(){
        return toppings;
    }

    //settere

    public void setNr(int nr) {
        this.nr = nr;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    // constructor info: Pizza nr , Pizza navn , pris , toppings.
   // Constructor()


}
