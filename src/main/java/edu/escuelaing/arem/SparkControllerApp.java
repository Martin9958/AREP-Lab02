package edu.escuelaing.arem;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import edu.escuelaing.arem.model.linkedListModel.MyLinkedList;
import edu.escuelaing.arem.service.calculatorService;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

import static spark.Spark.*;

/**
 * This is the main class to execute the PSP0 Program
 *
 * @author  Andres Martin Cantor Urrego (andres.cantor-u@mail.escuelaing.edu.co)
 */
public class SparkControllerApp {

    public static void main( String[] args ) {
        final calculatorService service = new calculatorService();
        port(getPort());
        post("/result", (req, res) -> {
            JsonObject getObject = new JsonParser().parse(req.body()).getAsJsonObject();
            res.type("application/json");
            System.out.println("Received"+getObject);
            return service.getTheResult(getObject.get("list").getAsJsonArray());
        });
        get("/result", (req, res) -> {
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
