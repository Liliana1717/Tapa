import com.liliana.features.domain.Tapa;
import com.liliana.features.presentation.MainTapa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MainTapa.printTapas();
        MainTapa.printTapa("albondigas en escabeche");

        MainTapa.TapadeleteNotWorking("albondigas en escabeche");


        MainTapa.createTapa(new Tapa("albondigas en escabeche", "vermuteria el atrio", "100","1000","2000","tomate y carne","500"));









    }



}