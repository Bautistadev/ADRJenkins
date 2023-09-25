package com.jenkins.spring.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ApiRepository {

    private static Long key =1L;
    private Map<Long,Persona> repositoryPersona = new HashMap<>();

    public ApiRepository(){
        this.repositoryPersona.put(key,new Persona("BAUTISTA","BASILIO","BATUBASILIO@HOTMIAL.COM",43463078l));
    }

    public Persona findById(Long id){
        return this.repositoryPersona.get(id);
    }
    public List<Persona> findAll(){
        return new ArrayList<>(this.repositoryPersona.values());
    }
    public boolean add(Persona persona){
        try {
            key++;
            this.repositoryPersona.put(key, persona);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean isEmpty(){
        Boolean response = this.repositoryPersona.isEmpty();
        return response;
    }



}
