package com.epam.trainingcommons.dto;

import java.time.LocalDate;

import com.epam.trainingcommons.utils.ActionType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record TrainerWorkloadRequest(
	    @NotBlank(message = "Trainer username cannot be blank") String trainerUsername,
	    @NotBlank(message = "Trainer first name cannot be blank") String trainerFirstName,
	    @NotBlank(message = "Trainer last name cannot be blank") String trainerLastName,
	    @NotNull(message = "isActive cannot be null") Boolean isActive,
	    @NotNull(message = "Training date cannot be null") LocalDate trainingDate,
	    @NotNull(message = "Training duration must be a positive number") long trainingDuration,
	    @NotNull(message = "Action type cannot be null") ActionType actionType,
	    @NotBlank(message = "Transaction ID cannot be blank") String transactionId) {

	    public TrainerWorkloadRequest(String trainerUsername, String trainerFirstName, String trainerLastName,
	            Boolean isActive, LocalDate trainingDate, long trainingDuration, ActionType actionType, String transactionId) {
	        this.trainerUsername = trainerUsername;
	        this.trainerFirstName = trainerFirstName;
	        this.trainerLastName = trainerLastName;
	        this.isActive = isActive;
	        this.trainingDate = trainingDate;
	        this.trainingDuration = trainingDuration;
	        this.actionType = actionType;
	        this.transactionId = transactionId;
	    }
	}
