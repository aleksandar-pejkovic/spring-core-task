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

    private Long traineeId;

    private Long trainerId;

    private String trainingName;

    private Long trainingTypeId;

    private Date trainingDate;

    private int trainingDuration;
}
