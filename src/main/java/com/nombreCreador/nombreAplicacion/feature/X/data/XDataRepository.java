package com.nombreCreador.nombreAplicacion.feature.X.data;

import com.nombreCreador.nombreAplicacion.feature.X.domain.X;
import com.nombreCreador.nombreAplicacion.feature.X.domain.XRepository;

import java.util.ArrayList;

public class XDataRepository implements XRepository {
    public static XDataRepository instance = null;
    ArrayList<X> localX = new ArrayList<>();

    public  static XDataRepository newInstancia(){
        if(instance == null){
            instance = new XDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<X> obtainAll() {
        return localX;
    }

    @Override
    public X obtainOne(String xCode) {
        for(X x:localX){
            if(x.getxCode().equals(xCode)){
                return x;
            }
        }
        return null;
    }

    @Override
    public void delete(String xCode) {
        for(X x:localX){
            if(x.getxCode().equals(xCode)){
               localX.remove(x);
            }
        }
    }

    @Override
    public void add(X x) {
        localX.add(x);
    }

    @Override
    public void modify(String xCode,X x) {
        for(X y:localX){
            if(y.getxCode().equals(xCode)){
                y=x;
            }
        }
    }
}
