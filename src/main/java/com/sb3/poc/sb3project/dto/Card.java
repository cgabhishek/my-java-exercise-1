package com.sb3.poc.sb3project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author Bhardwaj, Abhishek
 * @project my-java-exercise-1
 * @date 20/11/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    private Integer id;

    private CardLabel label;

    private LocalDate createdDate;

    private LocalDate lastUpdateDate;

    private User createdBy;

    private String tag;

}
