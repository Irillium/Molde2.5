package com.nombreCreador.nombreAplicacion.feature.Y.data;

import com.nombreCreador.nombreAplicacion.feature.Y.data.local.FileLocalDataSourceY;
import com.nombreCreador.nombreAplicacion.feature.Y.domain.Y;
import com.nombreCreador.nombreAplicacion.feature.Y.domain.YRepository;

import java.util.ArrayList;

public class YDataRepository implements YRepository {
    public static YDataRepository instance = null;
    private static FileLocalDataSourceY fileLocalDataSourceY;

    public  static YDataRepository newInstancia(){
        if(instance == null){
            instance = new YDataRepository();
            fileLocalDataSourceY = new FileLocalDataSourceY();

        }
        return instance;
    }

    @Override
    public Y obtainOne(String id) {
        return  fileLocalDataSourceY.findById(id);
    }

    @Override
    public ArrayList<Y> obtainAll() {
        return  (ArrayList<Y>) fileLocalDataSourceY.findAll();
    }

    @Override
    public void add(Y y) {
        fileLocalDataSourceY.save(y);
    }


}
