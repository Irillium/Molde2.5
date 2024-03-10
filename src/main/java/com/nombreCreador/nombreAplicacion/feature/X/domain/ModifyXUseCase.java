package com.nombreCreador.nombreAplicacion.feature.X.domain;

public class ModifyXUseCase {
    XRepository xRepository;

    public ModifyXUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void execute(String xCode, X x){
        xRepository.modify(xCode,x);
    }
}
