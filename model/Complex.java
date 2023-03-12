package Seminars.Sem5.model;

import Seminars.Sem5.Logger;

public class Complex  {
    protected double x;
    protected double y;
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
        Logger.logData("Комплексное число " + x + " , " + y +"i создано");
    }
    @Override
    public String toString(){ return (x + " " + y + "i"); }
}
