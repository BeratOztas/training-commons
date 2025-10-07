package com.epam.trainingcommons.dto;

import java.util.List;

public record YearlySummaryDto(
    int year,
    List<MonthlySummaryDto> monthlySummary
) {}