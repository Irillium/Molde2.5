package com.nombreCreador.nombreAplicacion.feature.Y.domain;

import java.util.ArrayList;

public class GetYsUseCase {
    YRepository yRepository;

    public GetYsUseCase(YRepository yRepository) {
        this.yRepository = yRepository;
    }

    public ArrayList<Y> execute(){

        return yRepository.obtainAll();
    }
}
