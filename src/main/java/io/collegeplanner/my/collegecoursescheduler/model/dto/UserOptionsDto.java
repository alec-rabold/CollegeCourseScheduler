package io.collegeplanner.my.collegecoursescheduler.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserOptionsDto {
    private List<String> chosenCourseNames;
    private String[] wantedProfessors;
    private String[] unwantedProfessors;
    private String[] excludeProfessors;
    private boolean showWaitlistedClasses;
    private long[] unavailableTimesBitBlocks;
    @Builder.Default
    private int daysPerWeekPreference = 1;
    @Builder.Default
    private int scheduleSpreadPreference = 1;
    @Builder.Default
    private boolean showOnlineClasses = true;
    @Builder.Default
    private boolean removeSimilarLayouts = false;
}