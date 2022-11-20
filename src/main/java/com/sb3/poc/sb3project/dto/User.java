package com.sb3.poc.sb3project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Bhardwaj, Abhishek
 * @project my-java-exercise-1
 * @date 20/11/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer userId;

    private String firstName;

    private String lastName;

}
