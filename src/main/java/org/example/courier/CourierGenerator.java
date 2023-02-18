package org.example.courier;

import java.util.Random;

public class CourierGenerator {
    private static final Random rnd = new Random();
    private static int getRnd(){
        return rnd.nextInt(1000);
    }

    public static final Courier defaultCourier =  new Courier("vita"+getRnd(), "tank"+getRnd(), "Alex"+getRnd());

    public static Courier getWithPasswordOnly (){
        return new Courier("","tank"+getRnd(),"Alex"+getRnd());
    }

    public static Courier getWithLoginOnly (){
        return new Courier("vita"+getRnd(), "", "Alex"+getRnd());
    }

    public static Courier getWithIncorrectCredentials(){
        return new Courier("vit", "tank1221", "Alex");
    }
}