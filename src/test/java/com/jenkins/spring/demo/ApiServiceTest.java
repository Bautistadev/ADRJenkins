package com.jenkins.spring.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ApiServiceTest {


    @Mock
    private ApiRepository apiRepository;

    @InjectMocks
    private ApiService apiService;


    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    void findAll() {
        List<Persona> request = this.apiService.findAll();
        Persona persona = new Persona("BAUTISTA","BASILIO","BATUBASILIO@HOTMIAL.COM",43463078l);
        when(request).thenReturn(Arrays.asList(persona));
    }

    @Test
    void addService() {
        Persona persona = new Persona("BAUTISTA","BASILIO","BATUBASILIO@HOTMIAL.COM",43463078l);
        when(this.apiService.add(persona)).equals("202: ok");
    }

}