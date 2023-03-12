package Seminars.Sem5.model;

import Seminars.Sem5.Logger;

public class RatioCalc extends SetDigit implements Model<Double> {
    @Override
    public Double sum() {
        Logger.logData("Сумма чисел: " + (x + y));
        return (x + y);
    }

    @Override
    public Double mult() {
        Logger.logData("Произведение чисел: " + x * y);
        return (x * y);
    }

    @Override
    public Double divide() {
        Logger.logData("Частное чисел: " + x / y);
        return (x / y);
    }

    @Override
    public Double diff() {
        Logger.logData("Разность чисел: " + (x - y));
        return (x - y);
    }
}
