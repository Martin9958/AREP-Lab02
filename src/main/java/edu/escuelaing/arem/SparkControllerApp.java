package edu.escuelaing.arem;

import edu.escuelaing.arem.model.linkedListModel.MyLinkedList;
import edu.escuelaing.arem.service.calculatorService;

import static spark.Spark.*;

/**
 * This is the main class to execute the PSP0 Program
 *
 * @author  Andres Martin Cantor Urrego (andres.cantor-u@mail.escuelaing.edu.co)
 */
public class SparkControllerApp {

    public static void main( String[] args ) {
        final MyLinkedList linkedList = new MyLinkedList();
        linkedList.addANode(160.0);
        linkedList.addANode(591.0);
        linkedList.addANode(114.0);
        linkedList.addANode(229.0);
        linkedList.addANode(230.0);
        linkedList.addANode(270.0);
        linkedList.addANode(128.0);
        linkedList.addANode(1657.0);
        linkedList.addANode(624.0);
        linkedList.addANode(1503.0);
        final calculatorService service = new calculatorService();
        port(getPort());
        get("/result", (req, res) -> service.getTheResult(linkedList));
    }

    private static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
