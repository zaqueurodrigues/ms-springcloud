package com.zaqueurodrigues.hrworker.repositories;

import com.zaqueurodrigues.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;



public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
