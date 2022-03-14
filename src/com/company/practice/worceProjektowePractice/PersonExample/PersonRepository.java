package com.company.practice.worceProjektowePractice.PersonExample;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IPersonRepository{

    List<Person> personList = new ArrayList<>();


    @Override
    public void addPerson(Person person) {
        if(!personList.contains(person)){
            personList.add(person);
        }else {
            System.out.println("Osoba  znajduje sie w tablicy");
        }
    }

    @Override
    public void removePerson(Person person) {
        if(personList.remove(person)){
            System.out.println("Udało się usunąć");
        };
    }

    @Override
    public List<Person> getPersonList() {
        return new ArrayList<>(personList); //do poprawy, nie powinniśmy zwracać oryginalnej listy
    }

    @Override
    public IPersonIterator iterator() {
        return new PersonIterator(personList);
    }

    private class PersonIterator implements IPersonIterator{

        private List<Person> personList;
        private int position = 0;

        public PersonIterator(List<Person> personList) {
            this.personList = personList;
        }

        @Override
        public boolean hasNext() {
            if (position < personList.size() && personList.get(position) != null) {
                return true;
            }
            return false;
        }

        @Override
        public Person next() {
            return personList.get(position++);
        }
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "personList=" + personList +
                '}';
    }
}
