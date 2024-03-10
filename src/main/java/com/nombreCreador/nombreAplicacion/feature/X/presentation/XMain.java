package com.nombreCreador.nombreAplicacion.feature.X.presentation;


import com.nombreCreador.nombreAplicacion.feature.X.data.XDataRepository;
import com.nombreCreador.nombreAplicacion.feature.X.domain.*;

public class XMain {
    public static void printAllX(){
        GetAllXUseCase getAllXUseCase = new GetAllXUseCase(XDataRepository.newInstancia());
        getAllXUseCase.execute();
    }
    public static void printOneX(String xCode){
        GetOneXUseCase getOneXUseCase = new GetOneXUseCase(XDataRepository.newInstancia());
        getOneXUseCase.execute(xCode);
    }
    public static void deleteX(String xCode){
        DeleteXUseCase deleteXUseCase = new DeleteXUseCase(XDataRepository.newInstancia());
        deleteXUseCase.execute(xCode);
    }
    public static void addX(X x){
        AddXUseCase addXUseCase = new AddXUseCase(XDataRepository.newInstancia());
        addXUseCase.execute(x);
    }
    public static void modifyX(String xCode,X x){
        ModifyXUseCase modifyXUseCase = new ModifyXUseCase(XDataRepository.newInstancia());
        modifyXUseCase.execute(xCode,x);
    }
}
