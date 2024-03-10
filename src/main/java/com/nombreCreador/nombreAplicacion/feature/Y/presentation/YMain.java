package com.nombreCreador.nombreAplicacion.feature.Y.presentation;


import com.nombreCreador.nombreAplicacion.feature.Y.data.YDataRepository;
import com.nombreCreador.nombreAplicacion.feature.Y.domain.*;

public class YMain {
    public static void print(){
        GetYsUseCase getYsUseCase = new GetYsUseCase(YDataRepository.newInstancia());
        getYsUseCase.execute();
    }

    public static void add(Y y){
        AddYUseCase addXUseCase = new AddYUseCase(YDataRepository.newInstancia());
        addXUseCase.execute(y);
    }

}
