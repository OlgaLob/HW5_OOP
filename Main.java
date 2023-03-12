package Seminars.Sem5;

import Seminars.Sem5.Presenter.Presenter;
import Seminars.Sem5.View.View;
import Seminars.Sem5.model.ComplexCalc;

public class Main {
    public static void main(String[] args) {
        var m = new ComplexCalc();
        var v = new View();
        Presenter presenter = new Presenter(m, v);
        presenter.calculate();
    }
}
