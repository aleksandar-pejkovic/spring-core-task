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
public class Training {

    private Long id;

    private Trainee trainee;

    private Trainer trainer;

    private String trainingName;

    private TrainingType trainingType;

    private Date trainingDate;

    private int trainingDuration;
}
