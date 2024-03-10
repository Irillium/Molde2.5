package com.nombreCreador.nombreAplicacion.feature.X.domain;

import java.util.ArrayList;

public interface XRepository {
    ArrayList<X> obtainAll();
    X obtainOne(String xCode);
    void delete(String xCode);
    void add(X x);
    void modify(String xCode,X x);
}
