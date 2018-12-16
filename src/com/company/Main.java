package com.company;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Банан");
        fruits.add("Яблоко");
        fruits.add("Апельсин");
        fruits.add("Мандарин");
        fruits.add(1, "Манго");

        System.out.println(fruits.get(1) + "\n");
        fruits.set(1, "Авокадо");

        System.out.printf("В списке %d элементов: \n", fruits.size());
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }

        if(fruits.contains("Банан"))
        {
            System.out.println("\n" + "В списке есть банан" + "\n");
        }

        fruits.remove("Банан");
        fruits.remove(0);

        Object[] froouits = fruits.toArray();
        for(Object froouit : froouits)
        {
            System.out.println(froouit);
        }
    }
}

