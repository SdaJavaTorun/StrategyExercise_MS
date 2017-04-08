package com.sdajava.strategyexercisework;

public class Main {

    public static void main(String[] args) {
	    Pracownik pracownik1 = new Pracownik("lekarz");
        pracownik1.execute();
        Pracownik pracownik2 = new Pracownik("listonosz");
        pracownik2.execute();
        Pracownik pracownik3 = new Pracownik("mechanik");
        pracownik3.execute();

    }

}
