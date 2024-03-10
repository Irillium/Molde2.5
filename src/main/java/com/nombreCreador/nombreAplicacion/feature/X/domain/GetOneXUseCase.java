package com.nombreCreador.nombreAplicacion.feature.X.domain;

public class GetOneXUseCase {
    XRepository xRepository;

    public GetOneXUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void execute(String xCode){
        xRepository.obtainOne(xCode);
    }
}
