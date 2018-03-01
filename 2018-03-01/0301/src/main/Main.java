package main;

import model.Aluno;

/**
 * Classe principal.
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
        
        Aluno aluno = new Aluno("Tiago Wolker", "ADS", 201710885);
        
        System.out.println("Olá " + aluno.getNome() + ","
                + "\nCurso: " + aluno.getCurso()
                + "\nMatrícula: " + aluno.getMatricula());
        
    }
    
}
