package com.boyo.j;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;

public class Jack {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Person person = new Person("John", 30);
        try {
            mapper.writeValue(new File("target/person.json"), person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Person person2 = mapper.readValue(new File("target/person.json"), Person.class);
            System.out.println(person2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
