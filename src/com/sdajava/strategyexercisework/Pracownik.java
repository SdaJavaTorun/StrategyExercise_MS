package com.sdajava.strategyexercisework;

import com.sdajava.strategyexercisework.dojezdzac.Dojezdzac;
import com.sdajava.strategyexercisework.dojezdzac.Rower;
import com.sdajava.strategyexercisework.dojezdzac.Samochod;
import com.sdajava.strategyexercisework.pracowac.Leczenie;
import com.sdajava.strategyexercisework.pracowac.NaprawaSamochodow;
import com.sdajava.strategyexercisework.pracowac.Pracowac;
import com.sdajava.strategyexercisework.pracowac.RoznoszenieListow;
import com.sdajava.strategyexercisework.wolnyczas.LiteraturaPopularnoNaukowa;
import com.sdajava.strategyexercisework.wolnyczas.Silownia;
import com.sdajava.strategyexercisework.wolnyczas.SpedzanieWolnegoCzasu;

/**
 * Created by RENT on 2017-04-08.
 */
public class Pracownik {
    String nazwaPracy;
    Dojezdzac dojezdzac;
    Pracowac pracowac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;

    public Pracownik(String nazwaPracy) {
        this.nazwaPracy = nazwaPracy;
    }

    public void execute () {
        if (nazwaPracy.equals("mechanik")) {
            System.out.println(nazwaPracy + ":" );
            new Samochod().dojezdzacMethod();
            new NaprawaSamochodow().pracowacMethod();
            new LiteraturaPopularnoNaukowa().spedzanieWolnegoCzasuMethod();
        } else if (nazwaPracy.equals("listonosz")){
            System.out.println(nazwaPracy + ":" );
            new Rower().dojezdzacMethod();
            new RoznoszenieListow().pracowacMethod();
            new LiteraturaPopularnoNaukowa().spedzanieWolnegoCzasuMethod();
        } else if (nazwaPracy.equals("lekarz")){
            System.out.println(nazwaPracy + ":" );
            new Samochod().dojezdzacMethod();
            new Leczenie().pracowacMethod();
            new Silownia().spedzanieWolnegoCzasuMethod();
        }
    }
}
