package com.company.practice.WorceProjektowePractice.PersonExample;

import java.util.List;

public interface IPersonRepository {

    void addPerson(Person person);
    void removePerson(Person person);
    List<Person> getPersonList();
    IPersonIterator iterator();
}
