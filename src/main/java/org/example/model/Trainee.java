package org.example.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Trainee {

    private Long id;

    private Date dateOfBirth;

    private String address;

    private Long userId;
}
