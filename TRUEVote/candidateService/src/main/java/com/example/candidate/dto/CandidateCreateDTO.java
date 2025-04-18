package com.example.candidate.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateCreateDTO {

    @NotBlank(message = "Name is required")
    private String name;
    private String party;
    private String position;
    private String description;
    private String imageUrl;
}
