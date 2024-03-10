package com.nombreCreador.nombreAplicacion.feature.X.domain;

public class DeleteXUseCase {
    XRepository xRepository;

    public DeleteXUseCase(XRepository xRepository) {
        this.xRepository = xRepository;
    }

    public void execute(String xCode){
        xRepository.delete(xCode);
    }
}
