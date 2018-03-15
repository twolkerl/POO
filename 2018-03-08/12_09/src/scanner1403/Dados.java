/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner1403;

import java.util.Scanner; //importar Scanner para leitura de dados
public class Dados {
    public static void main(String[] args) {
        //calcular a idade de 1 pessoa, recebendo seu ano nasc. e ano atual

        int anoAtual, anoNascimento, qtdeAnos;
        String nome;
        double peso, altura;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o ano atual:");
        anoAtual = ler.nextInt(); //receberá info do user

        System.out.println("Digite o ano de nascimento:");
        anoNascimento = ler.nextInt();

        System.out.println("Digite seu peso:");
        peso = ler.nextDouble();
        System.out.println("Digite sua altura:");
        altura = ler.nextDouble();
        System.out.println("Digite seu nome:");
        nome = ler.next(); //não utilize o nextLine, pois será na “próxima linha”

        qtdeAnos = anoAtual - anoNascimento; //cálculo
        System.out.println("Em " + anoAtual + " você faz (ou já fez) " + qtdeAnos + " anos!");
        System.out.println(nome);
    }
}

