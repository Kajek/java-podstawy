package com.company.practice.WorceProjektowePractice.PersonExample;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person("Karol", "44051401458");
        Person person2 = new Person("Kuba", "55051401458");
        Person person3 = new Person("Ania", "77051401458" );
        PersonRepository personRepository = new PersonRepository();

        personRepository.addPerson(person1);
        personRepository.addPerson(person2);
        personRepository.addPerson(person3);

        IPersonIterator iterator = personRepository.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
