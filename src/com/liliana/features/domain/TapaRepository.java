package com.liliana.features.domain;

import java.util.ArrayList;

public interface TapaRepository {


 ArrayList<Tapa> obtainTapas();

  Tapa obtainTapa(String tapaNombre);

 void deleteTapa(String tapaNombre);
}