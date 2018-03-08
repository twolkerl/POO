package exercicio02;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.  Tabela de notas - Escreva um programa que produza a seguinte saída
 * na tela: 
 * ALUNO(A)     NOTA
 * =========    =====
 * ALINE        9.0
 * MÁRIO        DEZ
 * SÉRGIO       4.5
 * SHIRLEY      7.0
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class Main {

    /**
     * Método principal.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<>();
        
        popularLista(alunos);
        
        imprimirCabecalho();
        
        // Percorre a lista de alunos e imprime seu nome e nota em tela.
        alunos.forEach(aluno
                -> aluno.imprimirDadosFormatado(aluno));
        
    }

    /**
     * Método que popula a lista de alunos.
     * 
     * @param alunos Lista de alunos a ser populada.
     */
    private static void popularLista(List<Aluno> alunos) {
        alunos.add(new Aluno("ALINE", 9.0));
        alunos.add(new Aluno("MÁRIO", 10));
        alunos.add(new Aluno("SÉRGIO", 4.5));
        alunos.add(new Aluno("SHIRLEY", 7.0));
    }

    /**
     * Método que imprime o cabeçalho.
     */
    private static void imprimirCabecalho() {
        System.out.println("ALUNO(A)\tNOTA");
        System.out.println("=========\t=====");
    }
    
}
