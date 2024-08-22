package oop.enumeration;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //Задача:
        //Составить справочник стран, которым можно пользоваться в любом классе
        //Япония: население 140млн, язык японский
        //Греция: население 10млн, язык греческий
        //Аргентина: население 47млн, язык испанский
        System.out.println(Arrays.toString(Country.values()));
        System.out.println(Country.valueOf("JAPAN").getPeopleCount());

    }

    public static Country2[] getCountries() {
        Country2[] countries = new Country2[3];
        countries[0] = new Country2("Япония", 140, "японский");
        countries[1] = new Country2("Греция", 10, "греческий");
        countries[2] = new Country2("Аргентина", 47, "v");
        return countries;

    }


}
