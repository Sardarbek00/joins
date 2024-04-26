package org.example.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    Long id;
    String name;
    String lastname;
    int age;
    Automobile automobile;


    public User(Automobile automobile) {
        this.automobile=automobile;
    }
}
