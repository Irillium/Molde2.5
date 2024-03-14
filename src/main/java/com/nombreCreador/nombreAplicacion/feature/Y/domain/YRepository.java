package com.nombreCreador.nombreAplicacion.feature.Y.domain;

import java.util.ArrayList;

public interface YRepository {
    ArrayList<Y> obtainAll();
    void add(Y y);
     Y obtainOne(String id);

}
