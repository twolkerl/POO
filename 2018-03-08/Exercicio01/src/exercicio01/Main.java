package exercicio01;

/**
 * 1.Etiqueta - Elabore um programa que escreva seu nome completo na primeira
 * linha, seu endereço na segunda, e o CEP e telefone na terceira.
 * Utilize variáveis.
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Tiago Wolker Leite",
                "Rua XYZ, 111", 91111111, "(51)98888-8888");
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("CEP: " + pessoa.getCep()
                + " Telefone: " + pessoa.getTelefone());
        
    }
    
}
