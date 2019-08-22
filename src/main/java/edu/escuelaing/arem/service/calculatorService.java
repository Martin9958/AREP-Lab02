package edu.escuelaing.arem.service;

import edu.escuelaing.arem.model.calculatorKit;

public class calculatorService {

    public calculatorKit getTheResult(String path){
        calculatorKit calculatorKit = new calculatorKit(path);
        calculatorKit.calculateMean();
        calculatorKit.calculateStdDeviation();
        return calculatorKit;
    }
}
