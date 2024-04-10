package org.example.exam_springboot.repositories;

import org.example.exam_springboot.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
