package com.nombreCreador.nombreAplicacion.feature.Y.domain;

public class AddYUseCase {
    YRepository yRepository;

    public AddYUseCase(YRepository yRepository) {
        this.yRepository = yRepository;
    }

    public void execute(Y y){
        yRepository.add(y);
    }
}
