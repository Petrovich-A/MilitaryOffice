package by.petrovich.military.service;

import by.petrovich.military.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {
    private static MilitaryOffice militaryOffice = new MilitaryOffice();

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Alexandr", 27, Gender.MALE, new Address("Russian", "Moscow")));
        persons.add(new Person("Victor", 25, Gender.MALE, new Address("Belarus", "Minsk")));
        persons.add(new Person("Evgeniy", 23, Gender.MALE, new Address("Belarus", "Minsk")));
        persons.add(new Person("Arnold", 19, Gender.MALE, new Address("Belarus", "Minsk")));
        persons.add(new Person("Alexandr", 24, Gender.MALE, new Address("Belarus", "Grodno")));
        persons.add(new Person("Igor", 18, Gender.MALE, new Address("Belarus", "Grodno")));
        persons.add(new Person("Alexandr", 20, Gender.MALE, new Address("Belarus", "Vitebsk")));
        persons.add(new Person("Vasiliy", 54, Gender.MALE, new Address("Belarus", "Zhodino")));
        persons.add(new Person("Gertruda", 36, Gender.FEMALE, new Address("Belarus", "Minsk")));
        PersonRegistry personRegistry = militaryOffice.sortFitForMilitaryService(persons);
        militaryOffice.printFitForMilitaryService(personRegistry);
        System.out.println("Number of conscripts: " + militaryOffice.countConscriptsByCity(personRegistry, "Minsk"));
        System.out.println("Number of conscripts: " + militaryOffice.countConscriptsByName(personRegistry, "Alexandr"));
    }
}
