package com.nombreCreador.nombreAplicacion.feature.Y.domain;

public class GetYsUseCase {
    YRepository yRepository;

    public GetYsUseCase(YRepository yRepository) {
        this.yRepository = yRepository;
    }

    public void execute(){
        yRepository.obtain();
    }
}
