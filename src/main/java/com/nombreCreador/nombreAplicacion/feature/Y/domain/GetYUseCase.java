package com.nombreCreador.nombreAplicacion.feature.Y.domain;

public class GetYUseCase {
    YRepository yRepository;

    public GetYUseCase(YRepository yRepository) {
        this.yRepository = yRepository;
    }
    public Y execute(String id){
        return yRepository.obtainOne(id);
    }
}
