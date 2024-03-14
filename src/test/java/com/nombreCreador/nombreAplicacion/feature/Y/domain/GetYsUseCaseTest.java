package com.nombreCreador.nombreAplicacion.feature.Y.domain;

import com.nombreCreador.nombreAplicacion.feature.Y.data.StubNotNullYsDataRepository;
import com.nombreCreador.nombreAplicacion.feature.Y.data.StubYsNullDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetYsUseCaseTest {

    GetYsUseCase getYsUseCase;
    @BeforeEach
    void setUp() {

    }
    @Test
    void cuandoDevuelveNull(){
       //Given
         getYsUseCase = new GetYsUseCase(new StubYsNullDataRepository());

        //When
        ArrayList<Y> resultado= getYsUseCase.execute();
        boolean esNulo=false;
        if(resultado==null){
            esNulo=true;
        }
        //Then
        Assertions.assertTrue(esNulo);

    }
    @Test
    void CuandoNoDevuelveNulo(){
        //Given
         getYsUseCase = new GetYsUseCase(new StubNotNullYsDataRepository());
         ArrayList<Y> ys= new ArrayList<>();

        //When
        ArrayList<Y> resultado=getYsUseCase.execute();
        boolean esNulo=true;
        if(resultado!=null){
            esNulo=false;
        }
        //Then
        Assertions.assertFalse(esNulo);
    }
    @AfterEach
    void tearDown() {
        getYsUseCase=null;
    }
}