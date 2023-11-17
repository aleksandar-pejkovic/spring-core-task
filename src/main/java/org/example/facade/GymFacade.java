package org.example.facade;

import java.util.List;

import org.example.model.Trainee;
import org.example.model.Trainer;
import org.example.model.Training;
import org.example.service.TraineeService;
import org.example.service.TrainerService;
import org.example.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GymFacade {

    private final TraineeService traineeService;
    private final TrainerService trainerService;
    private final TrainingService trainingService;

    @Autowired
    public GymFacade(TraineeService traineeService, TrainerService trainerService, TrainingService trainingService) {
        this.traineeService = traineeService;
        this.trainerService = trainerService;
        this.trainingService = trainingService;
    }

    public void readTrainees() {
        List<Trainee> trainees = traineeService.getAllTrainees();
        for (Trainee trainee : trainees) {
            System.out.println(trainee.toString());
        }
    }

    public void readTrainers() {
        List<Trainer> trainers = trainerService.getAllTrainers();
        for (Trainer trainer : trainers) {
            System.out.println(trainer.toString());
        }
    }

    public void readTrainings() {
        List<Training> trainings = trainingService.getAllTrainings();
        for (Training training : trainings) {
            System.out.println(training.toString());
        }
    }

    // CRUD methods for Trainee
    public void createTrainee(Trainee trainee) {
        traineeService.createTrainee(trainee);
    }

    public Trainee getTraineeById(Long traineeId) {
        return traineeService.getTraineeById(traineeId);
    }

    public void updateTrainee(Trainee trainee) {
        traineeService.updateTrainee(trainee);
    }

    public void deleteTrainee(Long traineeId) {
        traineeService.deleteTrainee(traineeId);
    }

    // CRUD methods for Trainer
    public void createTrainer(Trainer trainer) {
        trainerService.createTrainer(trainer);
    }

    public Trainer getTrainerById(Long trainerId) {
        return trainerService.getTrainerById(trainerId);
    }

    public void updateTrainer(Trainer trainer) {
        trainerService.updateTrainer(trainer);
    }

    public void deleteTrainer(Long trainerId) {
        trainerService.deleteTrainer(trainerId);
    }

    // CRUD methods for Training
    public void createTraining(Training training) {
        trainingService.createTraining(training);
    }

    public Training getTrainingById(Long trainingId) {
        return trainingService.getTrainingById(trainingId);
    }

    public void updateTraining(Training training) {
        trainingService.updateTraining(training);
    }

    public void deleteTraining(Long trainingId) {
        trainingService.deleteTraining(trainingId);
    }
}
