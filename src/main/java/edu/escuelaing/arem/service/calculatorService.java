package edu.escuelaing.arem.service;

import com.google.gson.JsonArray;
import edu.escuelaing.arem.model.calculatorModel.ResultObject;
import edu.escuelaing.arem.model.calculatorModel.calculatorKit;
import edu.escuelaing.arem.model.linkedListModel.MyLinkedList;

public class calculatorService {

    public ResultObject getTheResult(JsonArray list){
        MyLinkedList linkedList = new MyLinkedList();
        for(int i=0; i<list.size();i++){
            linkedList.addANode(list.get(i).getAsDouble());
        }
        calculatorKit calculatorKit = new calculatorKit(linkedList);
        ResultObject resultObject = new ResultObject(calculatorKit.calculateMean(),calculatorKit.calculateStdDeviation());
        return resultObject;
    }
}
