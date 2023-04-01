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
        System.out.println("Persons fit for military service:");
        for (Person person : personRegistry.getPersons()) {
            System.out.println(person);
        }
    }

    public PersonRegistry countConscriptsByCity(PersonRegistry personRegistry, String cityName) {
        PersonRegistry sortedPersonRegistry = sortFitForMilitaryService(personRegistry.getPersons());
        List<Person> personsWithRequiredCityName = new ArrayList<>();
        for (Person person : sortedPersonRegistry.getPersons()) {
            if (person.getAddress().getCity().equalsIgnoreCase(cityName)) {
                personsWithRequiredCityName.add(person);
            }
        }
        return new PersonRegistry(personsWithRequiredCityName);
    }

    public PersonRegistry countConscriptsByName(PersonRegistry personRegistry, String personName) {
        PersonRegistry sortedPersonRegistry = sortFitForMilitaryService(personRegistry.getPersons());
        List<Person> personsWithRequiredPersonName = new ArrayList<>();
        for (Person person : sortedPersonRegistry.getPersons()) {
            if (person.getName().equalsIgnoreCase(personName)) {
                personsWithRequiredPersonName.add(person);
            }
        }
        return new PersonRegistry(personsWithRequiredPersonName);
    }

    public PersonRegistry countConscriptsByAgeRange(PersonRegistry personRegistry, int rangeStart, int rangeEnd) {
        PersonRegistry sortedPersonRegistry = sortFitForMilitaryService(personRegistry.getPersons());
        List<Person> personsWithRequiredPersonName = new ArrayList<>();
        for (Person person : sortedPersonRegistry.getPersons()) {
            if (person.getAge() >= rangeStart & person.getAge() <= rangeEnd) {
                personsWithRequiredPersonName.add(person);
            }
        }
        return new PersonRegistry(personsWithRequiredPersonName);
    }

}
