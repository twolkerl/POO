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
        Aluno aluno2 = new Aluno();
        aluno2.setCurso("ADS");
        aluno2.setMatricula(111111);
        
        System.out.println("Olá " + aluno.getNome() + ","
                + "\nCurso: " + aluno.getCurso()
                + "\nMatrícula: " + aluno.getMatricula());
        
    }
    
}
