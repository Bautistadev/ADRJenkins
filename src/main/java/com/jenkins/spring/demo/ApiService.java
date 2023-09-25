package com.jenkins.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {

    @Autowired
    private ApiRepository apiRepository;


    public Persona findById(Long id){
        return this.apiRepository.findById(id);
    }
    public List<Persona> findAll(){
        return new ArrayList<>(this.apiRepository.findAll());
    }
    public String add(Persona persona){
       if(this.apiRepository.add(persona))
            return "202: ok";
        else
           return "500: internal error";
    }

    public boolean isEmpty(){
        Boolean response = this.apiRepository.isEmpty();
        return response;
    }

}
