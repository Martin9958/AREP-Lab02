package edu.escuelaing.arem;

import edu.escuelaing.arem.service.calculatorService;

import static spark.Spark.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

/**
 * This is the main class to execute the PSP0 Program
 *
 * @author  Andres Martin Cantor Urrego (andres.cantor-u@mail.escuelaing.edu.co)
 */
public class SparkControllerApp {

    public static void main( String[] args ) {
        final calculatorService calculatorService = new calculatorService();
        port(getPort());
        get("/result", (req, res) -> {
            calculatorService.getTheResult("./src/main/resources/columna1.txt");
            String page = FileUtils.readFileToString(new File("src/main/resources/static/index.html"), StandardCharsets.UTF_8);
            return page;
        });
    }

    private static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
