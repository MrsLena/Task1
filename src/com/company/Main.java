package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Дан отсортированный лист Integer. Необходимо удалить из него все дубликаты.
        //{6,6,8,9,14,15,15,15,20} -> {6,8,9,14,15,20}

        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(9);
        list.add(9);
        list.add(20);
        list.add(26);
        list.add(26);


        Set<Integer> rez = new TreeSet<>();
        rez.addAll(list);

        for (Integer i: rez) {
            System.out.println(i);
        }

    }
}
