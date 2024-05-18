package com.liliana.features.presentation;

import com.liliana.features.data.TapaDataRepository;
import com.liliana.features.domain.*;

import java.util.ArrayList;

public class MainTapa {


    private static com.liliana.features.domain.Tapa Tapa;

    //mostrar el listado de tapas//
    public static void printTapas() {
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(new TapaDataRepository());
        ArrayList<Tapa> tapas = tapasUseCase.execute();

        // para imprimir


        System.out.println(tapas.toString());
    }

    public static void printTapa(String tapaNombre) {
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(new TapaDataRepository());
        Tapa tapa = getTapaUseCase.execute(tapaNombre);
        System.out.println(tapa.toString());


    }

public static void deleteTapa(String tapaNombre){

        TapaDataRepository tapaDataRepository = new TapaDataRepository();
        GetTapasUseCase tapasUseCase =new GetTapasUseCase(tapaDataRepository);
        ArrayList<Tapa> tapasBeforeDelete= tapasUseCase.execute();


ArrayList<Tapa>TapasAfterDelete=tapasUseCase.execute();
}






    public static void TapadeleteNotWorking(String tapaNombre) {
        printTapas();


        GetTapasUseCase tapasUseCase=new GetTapasUseCase(new TapaDataRepository());
        ArrayList<Tapa>tapas1= tapasUseCase.execute();
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(new TapaDataRepository());
        deleteTapaUseCase.execute(tapaNombre);


            ArrayList<Tapa> tapas2 = tapasUseCase.execute();
          System.out.println("");

        }

public static void createTapa( Tapa tapa){
        SaveTapaUseCase createTapaUseCase = new SaveTapaUseCase();
        createTapaUseCase.execute(Tapa);

}

    }

