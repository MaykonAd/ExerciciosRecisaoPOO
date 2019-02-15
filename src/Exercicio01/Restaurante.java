package Exercicio01;

import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor total");
        Double valor = sc.nextDouble();
        Double gorjeta = (valor * 10)/100;
        System.out.println("Total a pagar: "+(valor+gorjeta));


    }

}