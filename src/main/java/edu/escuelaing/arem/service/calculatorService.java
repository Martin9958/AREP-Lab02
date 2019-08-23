package edu.escuelaing.arem.service;

import edu.escuelaing.arem.model.calculatorModel.ResultObject;
import edu.escuelaing.arem.model.calculatorModel.calculatorKit;
import edu.escuelaing.arem.model.linkedListModel.MyLinkedList;

public class calculatorService {

    public static ResultObject getTheResult(MyLinkedList linkedList){
        calculatorKit calculatorKit = new calculatorKit(linkedList);
        ResultObject resultObject = new ResultObject(calculatorKit.calculateMean(),calculatorKit.calculateStdDeviation());
        return resultObject;
    }
}
