package com.liliana.features.domain;


import com.liliana.features.data.TapaDataRepository;

public class GetTapaUseCase {
    private TapaRepository tapaRepository;

    public GetTapaUseCase(TapaDataRepository Nombre){
     this.tapaRepository=tapaRepository;

    }

    public Tapa execute( String tapaNombre) {

     return this.tapaRepository.obtainTapa(tapaNombre);
      }
}
