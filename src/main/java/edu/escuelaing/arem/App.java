package edu.escuelaing.arem;
import edu.escuelaing.arem.model.calculatorKitModel.calculatorKit;

import static spark.Spark.*;

/**
 * This is the main class to execute the PSP0 Program
 *
 * @author  Andres Martin Cantor Urrego (andres.cantor-u@mail.escuelaing.edu.co)
 */
public class App {

    public static void main( String[] args ) {
        final calculatorKit calculatorKit = new calculatorKit("./src/main/resources/columna1.txt");
        port(getPort());
        get("/mean", (req, res) -> calculatorKit.calculateMean());
    }

    private static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
