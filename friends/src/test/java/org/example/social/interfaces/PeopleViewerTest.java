package org.example.social.interfaces;

import org.example.social.dto.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PeopleViewerTest {

    @Mock
    PeopleViewer peopleViewer;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void givenName_whenFindPeopleByName_thenReturnList() {
        Person person1 = new Person();
        person1.setName("Ваня Иванов");
        Person person2 = new Person();
        person2.setName("Ваня Петров");
        List<Person> people = List.of(person1, person2);
        when(peopleViewer.findPeopleByName("Ваня")).thenReturn(people);

        List<Person> peopleByName = peopleViewer.findPeopleByName("Ваня");
        assertEquals(2, peopleByName.size());
    }

    @Test
    void givenId_whenAddPersonToFriends_ThenDo() {
        when(peopleViewer.addPersonToFriends("22")).thenReturn(true);
        assertTrue(peopleViewer.addPersonToFriends("22"));
    }

    @Test
    void givenId_whenOpenPersonProfile_thenReturnPerson() {
        Person person1 = new Person();
        person1.setName("Ваня Иванов");
        when(peopleViewer.openPersonProfile("33")).thenReturn(person1);

        Person person = peopleViewer.openPersonProfile("33");
        assertEquals(person1, person);
    }
}