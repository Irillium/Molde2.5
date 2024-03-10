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
    public ArrayList<Y> obtain() {
        ArrayList<Y> ys=new ArrayList<>();
        Y y = fileLocalDataSourceY.obtain();
        if (y!=null){
            ys.add(y);
        }
        return ys;
    }

    @Override
    public void add(Y y) {
        fileLocalDataSourceY.save(y);
    }


}
