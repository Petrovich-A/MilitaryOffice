package by.petrovich.military.model;

import java.util.List;

public class PersonRegistry {
    private List<Person> persons;

    public PersonRegistry() {
    }

    public PersonRegistry(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonRegistry{");
        sb.append("persons=").append(persons);
        sb.append('}');
        return sb.toString();
    }
}
