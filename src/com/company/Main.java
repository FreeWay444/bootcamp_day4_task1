package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] array= {"blue","red","green","black","yellow","white","purple"};
        List<String> list = new ArrayList<>();
        for(String i:array){
            list.add(i);
        }
        System.out.println("ArrayList : " + list);
        list.remove(2);
        list.add("magenta");
        list.add(0,"pink");
        for (String i:list){
            System.out.println(i);
        }
        System.out.println("------------");
        List<String> listSub;
        listSub = list.subList(2,5);
        for (String i:listSub){
            System.out.println(i);
        }

    }
}
