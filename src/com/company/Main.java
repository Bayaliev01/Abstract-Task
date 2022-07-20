package com.company;

public class Main {
    public static void main(String[] args) {
 Sheep sheep = new Sheep(66,8,"Kochkor","Kara-koi");
 Sheep sheep2 = new Sheep(47,7,"Koi","ak-koi");
 Sheep sheep3 = new Sheep(55,5,"Kochkor","KaraAla-koi");
 Sheep sheep4 = new Sheep(70,9,"Kochkor","CharaAla-koi");

 Cow cow = new Cow(289,17,"ui","marusya");
 Cow cow2 = new Cow(256,14,"buka","Vasya");
 Cow cow3 = new Cow(270,15,"buka","Gena");
 Cow cow4 = new Cow(243,13,"ui","Charala");
 Cow cow5 = new Cow(239,18,"buka","Kapkarashka");
 Cow cow6 = new Cow(266,19,"ui","BelayaNoch");

 Horse horse = new Horse(345,21,"aigyr,","akuula");
 Horse horse2 = new Horse(375,16,"bee,","sinyayadojd");
 Horse horse3 = new Horse(325,19,"aigyr,","tor");


 Farm farm1 = new Farm("Kashar",new Cow[]{cow,cow2,cow3,cow5,cow6},new Horse[]{horse,horse2},new Sheep[]{sheep,sheep3,sheep2},"SwniorDaniek" );
Farm farm2 = new Farm("Too",new Cow[]{cow4},new Horse[]{horse3},new Sheep[]{sheep4},"Bayaliev Syimyk");
     System.out.println("Первая Ферма \n"+farm1+"\n----------");
     System.out.println("Вторая Ферма \n"+farm2+"\n");

    }
}