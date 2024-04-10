package org.example.exam_springboot.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class SubjectDTO {
    private Long subjectId;
    private String subjectCode;
    private String subjectName;
    private Integer credit;
}
