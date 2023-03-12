package Seminars.Sem5.View;

import Seminars.Sem5.model.Complex;
import java.util.Scanner;

public class View {
       public Double getInpDouble(String inp) {
        Scanner sc = new Scanner(System.in);
        double inputString;
        while (true) {
            System.out.println(inp);
            try {
                inputString = Double.parseDouble(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Введите рациональное число!");
            }
        }
        return inputString;
    }

    public Integer getInpInt(String inp) {
        Scanner sc = new Scanner(System.in);
        int inputString;
        while (true) {
            System.out.println(inp);
            try {
                inputString = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Введите целое число!");
            }
        }
        return inputString;
    }

    public void printRatio(String str, double data) {
        System.out.println(str + data);
    }
    public void printComplex(String str, Complex data){
        System.out.println(str + data);
    }

}
