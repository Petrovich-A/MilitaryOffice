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

    public int countConscripts(PersonRegistry personRegistry, String cityName) {
        int counter = 0;
        PersonRegistry sortedPersonRegistry = sortFitForMilitaryService(personRegistry.getPersons());
        for (Person person : sortedPersonRegistry.getPersons()) {
            if (person.getAddress().getCity().equalsIgnoreCase(cityName)) {
                counter++;
            }
        }
        return counter;
    }

}
