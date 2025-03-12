package com.mycompany.estudospoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        /*
        double cotacao, dolares, total, palpite;
        
        System.out.println("Informe quando vale 1$ em reais: ");
        cotacao = teclado.nextDouble();
        
        System.out.println("Quantos dólares você quer converter? ");
        dolares = teclado.nextDouble();
        
        total = dolares*cotacao;
        
        System.out.println("O total em reais é: " + total);
        
        for(int contador = 1; contador <= total; contador++){
            if(contador == 1){
                System.out.println("Ganhei " + contador + " real");
            }
            else{
                System.out.println("Ganhei " + contador + " reais");
            }
        }
        
        do{
            System.out.println("A partir de quantos reais a pessoa eh rica?");
            palpite = teclado.nextDouble();
        }while(palpite < 50000);
        */
        
        ArrayList<Double> salarios = new ArrayList<>();
        //double salarios[] = new double[5];
        
        for(int contador = 0; ; contador++){
            System.out.println("Digite o salario " + (contador + 1));
            //salarios[contador] = teclado.nextDouble();
            double valor = teclado.nextDouble();
            if(valor > 0)
                salarios.add(valor);
            else
                break;
        }
        
        double soma = 0;
        
        for(int contador = 0; contador < salarios.size(); contador++){
            //soma = soma + salarios[contador];
            soma = soma + salarios.get(contador);
        }
        
        System.out.println("A média salarial é: " + soma/salarios.size());
    }
}
