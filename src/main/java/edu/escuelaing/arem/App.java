package edu.escuelaing.arem;

import edu.escuelaing.arem.model.calculatorKitModel.calculatorKit;

/**
 * This is the main class to execute the PSP0 Program
 *
 * @author  Andres Martin Cantor Urrego (andres.cantor-u@mail.escuelaing.edu.co)
 */
public class App {

    public static void main( String[] args ) {

        calculatorKit calculatorKitA = new calculatorKit("./src/main/resources/columna1.txt");
        calculatorKit calculatorKitB = new calculatorKit("./src/main/resources/columna2.txt");
        System.out.println("Welcome user !!\n" +
                "This is the calculator kit\n" +
                "In this version you can use this for calculate the mean and the standard deviation \n" +
                "of a set of a n real numbers that are in the files that are in the project resources \n" +
                "in the first file named 'columna1.txt' are the column data 'Estimate Proxy Size' and \n" +
                "in the second file named 'columna2.txt' are the column data 'Development Hours'. \n" +
                "Using the linked list implementation the results are: \n" +
                "Result 1: column Estimate Proxy Size \n" +  calculatorKitA.getLinkedList() +"\n" +
                "Mean: " + String.format("%.2f", calculatorKitA.calculateMean()) +"\n" + "Standard deviation: " +  String.format("%.2f",calculatorKitA.calculateStdDeviation()) +
                "\n" + "Result 2: column Development Hours \n" + calculatorKitB.getLinkedList() +"\n" +
                "Mean: " +  String.format("%.2f",calculatorKitB.calculateMean()) +"\n" + "Standard deviation: " +  String.format("%.2f",calculatorKitB.calculateStdDeviation()));

    }

}
