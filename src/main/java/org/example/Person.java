package org.example;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String socialSecNum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(socialSecNum, person.socialSecNum);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", socialSecNum='" + socialSecNum + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSocialSecNum() {
        return socialSecNum;
    }

    public void setSocialSecNum(String socialSecNum) {
        this.socialSecNum = socialSecNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, socialSecNum);
    }

    public Person(String name, int age, String socialSecNum) {
        this.name = name;
        this.age = age;
        this.socialSecNum = socialSecNum;
    }
}

