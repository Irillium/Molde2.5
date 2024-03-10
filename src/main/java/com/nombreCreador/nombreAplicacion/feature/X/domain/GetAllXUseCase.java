package com.nombreCreador.nombreAplicacion.feature.X.domain;

public class GetAllXUseCase {
    XRepository xRepository;

    public GetAllXUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void execute(){
        xRepository.obtainAll();
    }
}
