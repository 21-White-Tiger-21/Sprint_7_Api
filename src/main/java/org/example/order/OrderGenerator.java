package org.example.order;

public class OrderGenerator {
    public static Order getWithGrey(){
        return new Order("Виталий","Матвеев","Toreza, 123 apt.","5", "+79996481857",  "5","2023-02-15","Saske, come back to Toreza", new String[]{"GREY"});
    }

    public static Order getWithBlack(){
        return new Order("Виталий","Матвеев","Toreza, 123 apt.","5","+79996481857","5","2023-02-15","Saske, come back to Toreza",new String[]{"BLACK"});
    }

    public static Order getWithoutTwoColours(){
        return new Order("Виталий","Матвеев","Toreza, 123 apt.","5","+79996481857","5","2023-02-15","Saske, come back to Toreza",null);
    }

    public static Order getWithTwoColours(){
        return new Order("Виталий","Матвеев","Toreza, 123 apt.","5","+79996481857","5","2023-02-15","Saske, come back to Toreza",new String[]{"GREY","BLACK"});
    }
}