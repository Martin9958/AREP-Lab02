package edu.escuelaing.arem.model.calculatorModel;

public class ResultObject {

    public Double mean;
    public Double std_Deviation;

    public ResultObject(Double mean, Double std_Deviation) {
        this.mean = mean;
        this.std_Deviation = std_Deviation;
    }

    public Double getMean() {
        return mean;
    }

    public Double getStd_Deviation() {
        return std_Deviation;
    }

    @Override
    public String toString() {
        return "Result = {" +
                "mean=" + mean +
                ", std_Deviation=" + std_Deviation +
                '}';
    }
}
