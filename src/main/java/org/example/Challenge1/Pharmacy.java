package org.example.Challenge1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(inventory, pharmacy.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inventory);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "inventory=" + inventory +
                '}';
    }

    //Step2:Create a Java class 'Pharmacy' that uses a Java Map to store the Medication
    // name as the key and its information as the value.
    private Map<String, Medication> inventory = new HashMap<>();

    //Step 3: Create a method 'int getCount()' in the class Pharmacy.
    // This method should return the number of Medications in the pharmacy.
    public int getCount(){
        return inventory.size();
    }

    //Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy.
    // This method should insert the Medication indexed by its name into the pharmacy.
    public void save(Medication medication){
        inventory.put(medication.getName(), medication);
    }

    //Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should
    // return the requested Medication with this name. If no Medication with this name is found, the method should return null.
    public Medication find(String medicationName){
        return inventory.get(medicationName);
    }

    //Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete
    // the Medication with this name.
    public void delete(String medicationName){
        inventory.remove(medicationName);
    }

    //Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
    public void printAll(){
        System.out.println(inventory.values());
    }
}

