package by.petrovich.military.model;

import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    private final static int MIN_MILITARY_SERVICE_AGE = 18;
    private final static int MAX_MILITARY_SERVICE_AGE = 27;

    public PersonRegistry sortFitForMilitaryService(List<Person> persons) {
        List<Person> personsFitForMilitaryService = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= MIN_MILITARY_SERVICE_AGE && person.getAge() <= MAX_MILITARY_SERVICE_AGE
                    && person.getGender().equals(Gender.MALE)) {
                personsFitForMilitaryService.add(person);
            }
        }
        return new PersonRegistry(personsFitForMilitaryService);
    }

    public void printFitForMilitaryService(PersonRegistry personRegistry) {
        System.out.println("Persons Fit For Military Service:");
        for (Person person : personRegistry.getPersons()) {
            System.out.println(person);
        }
    }

    public int countConscriptsByCity(PersonRegistry personRegistry, String cityName) {
        int counter = 0;
        PersonRegistry sortedPersonRegistry = sortFitForMilitaryService(personRegistry.getPersons());
        for (Person person : sortedPersonRegistry.getPersons()) {
            if (person.getAddress().getCity().equalsIgnoreCase(cityName)) {
                counter++;
            }
        }
        return counter;
    }

    public int countConscriptsByName(PersonRegistry personRegistry, String personName) {
        int counter = 0;
        PersonRegistry sortedPersonRegistry = sortFitForMilitaryService(personRegistry.getPersons());
        for (Person person : sortedPersonRegistry.getPersons()) {
            if (person.getName().equalsIgnoreCase(personName)) {
                counter++;
            }
        }
        return counter;
    }

    public int countConscriptsByAgeRange(PersonRegistry personRegistry, int rangeStart, int rangeEnd) {
        int counter = 0;
        PersonRegistry sortedPersonRegistry = sortFitForMilitaryService(personRegistry.getPersons());
        for (Person person : sortedPersonRegistry.getPersons()) {
            if (person.getAge() >= rangeStart & person.getAge() <= rangeEnd) {
                counter++;
            }
        }
        return counter;
    }

}
