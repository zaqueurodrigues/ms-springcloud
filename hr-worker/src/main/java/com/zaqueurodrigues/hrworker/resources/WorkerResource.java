package com.zaqueurodrigues.hrworker.resources;

import com.zaqueurodrigues.hrworker.entities.Worker;
import com.zaqueurodrigues.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository repo;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return ResponseEntity.ok().body(repo.findAll());
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Worker obj = repo.findById(id).get();
        return ResponseEntity.ok().body(obj);
    }
}
