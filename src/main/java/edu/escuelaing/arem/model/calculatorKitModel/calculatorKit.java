package edu.escuelaing.arem.model.calculatorKitModel;

import edu.escuelaing.arem.model.linkedListModel.MyLinkedList;
import edu.escuelaing.arem.model.linkedListModel.exception.MyLinkedListException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *  The calculator kit that read a set of elements of a file and calculate mean and std deviation
 * @author Martin Cantor (andres.cantor-u@mail.escuelaing.edu.co)
 */
public class calculatorKit {

    /**
     * The linked list that content the elements of a file
     */
    private MyLinkedList linkedList;

    /**
     * Calculator kit constructor with params
     */
    public calculatorKit(String path){
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader(path));
            this.linkedList = new MyLinkedList();
            String line ;
            while(!(line = bufferedReader.readLine()).equals("")){
                line = line.trim();
                this.linkedList .addANode(Double.parseDouble(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Calculate the mean given a set of n real numbers
     * @return the mean
     */
    public Double calculateMean(){
        Double summatory = 0.0;
        for(int i =0; i<this.linkedList.getMyLinkedListSize();i++){
            try {
                summatory += (Double) this.linkedList.getNodeByIndex(i).getInformation();
            } catch (MyLinkedListException e) {
                e.printStackTrace();
            }
        }
        Double mean = summatory/this.linkedList.getMyLinkedListSize();
        return mean;
    }

    /**
     * Calculate the standard Deviation given a set of n real numbers
     * @return the standard deviation
     */
    public Double calculateStdDeviation(){
        Double summatory = 0.0;
        for(int i =0; i<this.linkedList.getMyLinkedListSize();i++){
            try {
                summatory +=  Math.pow((Double)this.linkedList.getNodeByIndex(i).getInformation() - calculateMean(), 2);
            } catch (MyLinkedListException e) {
                e.printStackTrace();
            }
        }
        Double desviation = Math.sqrt(summatory/(this.linkedList.getMyLinkedListSize()-1));
        return desviation;
    }

    /**
     * Get the linked list that content the elements of a file
     * @return the linked list
     */
    public MyLinkedList getLinkedList(){
        return this.linkedList;
    }

}
