package com.nombreCreador.nombreAplicacion.feature.X.domain;

public class AddXUseCase {
    XRepository xRepository;

    public AddXUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void execute(X x){
        xRepository.add(x);
    }
}
