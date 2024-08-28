package org.example;

import java.time.Period;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //List, Set, Map

        //Set (quasi der Sammler) - will keine Duplikate. Hier werden nur Werte abgespeichert, wo keine Duplikate vorkommen dürfen.
        Set<String> names = new HashSet<>();//Set schneller als List weil die Daten als Hash Nummer gespeichert werden
        //Add values
        names.add("Thomas");
        names.add("Thomas");
        names.add("Maria");
        names.add("Stefanie");

        //Remove values
        names.remove("Maria");

        //How many Values
        int y = names.size();

        System.out.println(names);

        //Map -> Key, Value (Key = Artikelnummer, Value = Artikel mit allen Daten)
        Map<String, Person> currywurst = new HashMap<>();

        Person person1 = new Person("Thomas", 35, "123");
        Person person2 = new Person("Maria", 31, "456");

        //Add values
        currywurst.put(person1.getSocialSecNum(), person1);
        currywurst.put(person2.getSocialSecNum(), person2);

        System.out.println(currywurst);

        //Get Value from Map
        System.out.println(currywurst.get("123"));

        //Jet get Values
        System.out.println(currywurst.values());

        //Just get Keys
        System.out.println(currywurst.keySet());

        //Remove Object (falscher Key bei remove wird nicht als Fehler angezeigt, deshalb eine Prüfung vorher
        currywurst.remove("1");

        //Check if key exists
        boolean isPresent = currywurst.containsKey("1");
    }
}