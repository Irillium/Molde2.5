package com.nombreCreador.nombreAplicacion.feature.Y.data;

import com.nombreCreador.nombreAplicacion.feature.Y.domain.Y;
import com.nombreCreador.nombreAplicacion.feature.Y.domain.YRepository;

import java.util.ArrayList;

public class StubYsNullDataRepository implements YRepository {


    @Override
    public ArrayList<Y> obtainAll() {
        return null;
    }

    @Override
    public void add(Y y) {

    }

    @Override
    public Y obtainOne(String id) {
        return null;
    }
}
