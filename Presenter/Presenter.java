package Seminars.Sem5.Presenter;

import Seminars.Sem5.model.Complex;
import Seminars.Sem5.model.ComplexCalc;
import Seminars.Sem5.model.RatioCalc;
import Seminars.Sem5.View.View;

public class Presenter {
    View view;
    ComplexCalc cmplx;

    public Presenter(ComplexCalc cmplx, View view ) {
        this.cmplx = cmplx;
        this.view = view;
    }

    public void calculate() {
        int action = view.getInpInt("Выберите тип чисел: " +
                "\n\t1. Рациональные" +
                "\n\t2. Комплексные");
        switch (action){
            case 1:
                actionRatio();
                break;
            case 2:
                actionComplex();
                break;
            default:
                System.out.println(" ");
        }
    }


    public void actionComplex() {
        cmplx.setX(view.getInpDouble("Введите вещественную часть числа x: "));
        cmplx.setA(view.getInpDouble("Введите мнимую часть числа x: "));
        cmplx.setY(view.getInpDouble("Введите вещественную часть числа y: "));
        cmplx.setB(view.getInpDouble("Введите мнимую часть числа y: "));
        switch (signSelect()) {
            case 1:
                view.printComplex("Сумма: ", cmplx.sum());
                break;
            case 2:
                view.printComplex("Разность: ", cmplx.diff());
                break;
            case 3:
                view.printComplex("Произведение: ", cmplx.mult());
                break;
            case 4:
                view.printComplex("Частное: ", cmplx.divide());
                break;
            default:
                System.out.println(" ");
        }
    }

    public void actionRatio() {
        RatioCalc rc = new RatioCalc();
        rc.setX(view.getInpDouble("Введите число х: "));
        rc.setY(view.getInpDouble("Введите число y: "));
        switch (signSelect()) {
            case 1:
                view.printRatio("Сумма: ", rc.sum());
                break;
            case 2:
                view.printRatio("Разность: ", rc.diff());
                break;
            case 3:
                view.printRatio("Произведение: ", rc.mult());
                break;
            case 4:
                view.printRatio("Частное: ", rc.divide());
                break;
            default:
                System.out.println(" ");
        }
    }
    public int signSelect(){
        int sign = view.getInpInt("Выберите действие:" +
                "\n\t1. Сложение" +
                "\n\t2. Вычитание" +
                "\n\t3. Умножение" +
                "\n\t4. Деление");
        return sign;
    }
}
