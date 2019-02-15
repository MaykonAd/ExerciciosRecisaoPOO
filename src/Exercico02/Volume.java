package Exercico02;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a altura");
        Double altura = sc.nextDouble();
        System.out.println("Entre com o raio");
        Double raio = sc.nextDouble();
        Double volume = (3.141559 * Math.pow(raio,2) * altura);
        System.out.println("Volume :"+ volume);
    }
}
