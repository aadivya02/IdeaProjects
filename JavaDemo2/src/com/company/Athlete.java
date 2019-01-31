package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
  class Abc implements Comparable<Abc>{


    String name;
    String sports;
    String country;
    int world_rank;

    public Abc(String n, String s, String c, int w) {

        this.name = n;
        this.sports = s;
        this.country = c;
        this.world_rank = w;

    }
    public int compareTo(Abc x){
        return this.world_rank - x.world_rank;
    }
}

public class Athlete  {



    public static void main(String[] args) {
        ArrayList<Abc> Medals =  new ArrayList<Abc>();
        Medals.add(new Abc("Aadi","Cricket","India",50));
        Medals.add(new Abc("Raj","Chess","China",10));

        Collections.sort(Medals);
        for(Abc x:Medals){
            System.out.println(x.world_rank);
        }


    }

    }
