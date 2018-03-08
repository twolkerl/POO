package exercicio02;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.  Tabela de notas - Escreva um programa que produza a seguinte saída
 * na tela: 
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Aline", 9.0));
        alunos.add(new Aluno("Mário", 10));
        alunos.add(new Aluno("Sérgio", 4.5));
        alunos.add(new Aluno("Shirley", 7.0));
        
        alunos.forEach(aluno
                -> System.out.println(aluno.imprimirDadosFormatado(aluno)));
        
    }
    
}
