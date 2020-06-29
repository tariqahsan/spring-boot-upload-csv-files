package org.tahsan.spring.files.csv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tahsan.spring.files.csv.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
