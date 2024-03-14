package com.nombreCreador.nombreAplicacion.feature.Y.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetYUseCaseTest {
    GetYUseCase getYUseCase;

    @Test
    void CuandoDevuelveNull(){
        Y y= null;
        Assertions.assertNull(y);
    }
    @AfterEach
    void tearDown() {
        getYUseCase=null;
    }
}