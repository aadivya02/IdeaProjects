package com.company;

import java.util.HashMap;

public class collectionDemo {

    public static void main(String[] args) {


        HashMap hashMap=new HashMap();
        hashMap.put(new collectionDemo(),2 );
        hashMap.put(new collectionDemo(),4);   //hashcode of both object are same , but in case of map ,, the size will be 2
        System.out.println(hashMap.size());
        System.out.println(hashMap.hashCode());

    }



    String name;
    Integer id;
    @Override
    public int hashCode() {

        System.out.println("Students Name");
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(0);
    }
}