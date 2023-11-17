package org.example.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.dao.TraineeDAO;
import org.example.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeService {

    private static final Logger logger = LogManager.getLogger(TraineeService.class);

    private final TraineeDAO traineeDAO;

    @Autowired
    public TraineeService(TraineeDAO traineeDAO) {
        this.traineeDAO = traineeDAO;
    }

    public void createTrainee(Trainee trainee) {
        traineeDAO.save(trainee);
        logger.info("Trainee created: {}", trainee);
    }

    public Trainee getTraineeById(long id) {
        Trainee trainee = traineeDAO.findById(id);
        logger.info("Retrieved Trainee by ID {}: {}", id, trainee);
        return trainee;
    }

    public void updateTrainee(Trainee trainee) {
        traineeDAO.update(trainee);
        logger.info("Trainee updated: {}", trainee);
    }

    public void deleteTrainee(long id) {
        traineeDAO.delete(id);
        logger.info("Trainee deleted with ID: {}", id);
    }

    public List<Trainee> getAllTrainees() {
        List<Trainee> trainees = traineeDAO.getAllTrainees();
        logger.info("Retrieved all Trainees: {}", trainees);
        return trainees;
    }
}
