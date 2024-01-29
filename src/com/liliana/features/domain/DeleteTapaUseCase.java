package com.liliana.features.domain;

import com.liliana.features.data.TapaDataRepository;

import java.util.ArrayList;

public class DeleteTapaUseCase {

    private TapaRepository tapaRepository;

        public DeleteTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;


    }

    public DeleteTapaUseCase(TapaDataRepository tapaDataRepository) {
    }

        public void execute (String tapaNombre){
        tapaRepository.deleteTapa(tapaNombre);
    }

    }
