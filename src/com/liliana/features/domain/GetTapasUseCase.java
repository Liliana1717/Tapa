package com.liliana.features.domain;

import java.util.ArrayList;

public class GetTapasUseCase {


    private TapaRepository tapaRepository;

    public GetTapasUseCase(TapaRepository tapaRepository){

        this.tapaRepository = tapaRepository;



    }

    public ArrayList<Tapa> obtainTapas(String tapaNombre) {
        return tapaRepository.obtainTapas();
    }

    public Tapa obtainTapa(String tapaNombre) {
        return tapaRepository.obtainTapa(tapaNombre);
    }


    public ArrayList<Tapa> execute() {

  return tapaRepository.obtainTapas();
    }

}
