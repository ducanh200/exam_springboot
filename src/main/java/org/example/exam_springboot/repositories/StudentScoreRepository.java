package org.example.exam_springboot.repositories;

import org.example.exam_springboot.entities.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentScoreRepository extends JpaRepository<StudentScore,Long> {
}
