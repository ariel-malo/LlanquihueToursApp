package Data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGatronomica;

public class GestorServicios {

    public void crearServicio(){

        ExcursionCultural excursion1=new ExcursionCultural("tour por melipilla", 2, "pomaire");
        ExcursionCultural excursion2=new ExcursionCultural("tour por santiago", 3, "catedral de santiago");

        PaseoLacustre paseo1= new PaseoLacustre("cumming y mas", 3, "bote");
        PaseoLacustre paseo2= new PaseoLacustre("paseo por el rio", 3, "barco");

        RutaGatronomica ruta1= new RutaGatronomica("el completo", 2, 10);
        RutaGatronomica ruta2= new RutaGatronomica("el churrasco", 2, 7);


        System.out.println(excursion1);
        System.out.println(excursion2);

        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println(ruta1);
        System.out.println(ruta2);







    }































}
