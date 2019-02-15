package Exercicio03;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor do salário bruto");
        Double salario = sc.nextDouble();
        System.out.println("Digite o valor da prestação");
        Double prestacao = sc.nextDouble();
        Double porcentagem = (salario * 0.3;

        if (prestacao > porcentagem){
            System.out.println("Emprestimo não liberado");
        }else{
            System.out.println("Emprestimo liberado");
        }

    }
}