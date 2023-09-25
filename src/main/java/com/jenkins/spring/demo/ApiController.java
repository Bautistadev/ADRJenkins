package com.jenkins.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import com.jenkins.spring.demo.Persona;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
class ApiController {

    @Autowired
    private ApiService apiService;


    @GetMapping("/retriveAll")
    public List<Persona> getAll(){
        return this.apiService.findAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody Persona persona){
       return this.apiService.add(persona);
    }

    @GetMapping("/retriveById/{id}")
    public Persona retriveById(@PathVariable Long id){
        return this.apiService.findById(id);
    }

}

