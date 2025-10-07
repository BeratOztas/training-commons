package com.epam.trainingcommons.dto; 

import java.util.List;

public record TrainerWorkloadResponse(
    String trainerUsername,
    String trainerFirstName,
    String trainerLastName,
    Boolean isActive,
    List<YearlySummaryDto> yearlySummaries 
) {
}