package com.nombreCreador.nombreAplicacion.feature.Y.domain;

import java.util.ArrayList;

public interface YRepository {
    ArrayList<Y> obtain();
    void add(Y y);

}
