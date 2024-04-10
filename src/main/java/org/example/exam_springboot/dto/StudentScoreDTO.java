package org.example.exam_springboot.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.example.exam_springboot.entities.Student;
import org.example.exam_springboot.entities.Subject;

@Data
public class StudentScoreDTO {
    private Long studentScoreId;

    private Long studentId;
    private StudentDTO student;

    private Long subjectId;
    private SubjectDTO subject;

    private Double score1;
    private Double score2;
}
