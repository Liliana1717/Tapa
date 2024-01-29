package com.liliana.features.data;

import com.liliana.features.domain.Tapa;
import com.liliana.features.domain.TapaRepository;
import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    private ArrayList<Tapa> localTapas =new ArrayList<>();


    public TapaDataRepository(){
        initData();
    }



public ArrayList<Tapa>obtainTapa(){

return localTapas;


    }

    @Override
    public ArrayList<Tapa> obtainTapas() {
        return null;
    }

    @Override
    public Tapa obtainTapa(String tapaNombre) {

        for (Tapa tapa:localTapas) {
            if (Tapa.getNombre().equals(tapaNombre)) {
                return tapa;


            }
        }
return null;
        }

        private void initData(){


            localTapas.add(new Tapa("albondigas en escabeche", "vermuteria el atrio", "100", "1000", "2000", "tomate y carne", "500"));
            localTapas.add(new Tapa("albondiga de verano y arandanos", "bar restaurante soul kitchen", "200", "500", "1000", "arandanos y salsa de cerveza", "300"));


        }


        public void deleteTapa(String tapaNombre){


        for(int  i = 0; i< localTapas.size(); i++){

            if (localTapas.get(i).getNombre().equals(tapaNombre)){
                localTapas.remove(i);

            }
        }
        }





    }







