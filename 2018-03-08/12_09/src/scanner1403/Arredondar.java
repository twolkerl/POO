
package scanner1403;
 
//OBS: para fins de arredondamento, você poderá utilizar, dentre várias opções oferecidas pela linguagem,uma bem simples, que é o método de saída printf, com definição de casas decimais. Veja:

 import java.util.Scanner;//importar Scanner para leitura de dados

public class Arredondar {

   
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
  Scanner ler = new Scanner(System.in);
	
        System.out.println("Entre com a primeira nota:");
        nota1 = ler.nextDouble();
        System.out.println("Entre com a segunda nota:");
        nota2 = ler.nextDouble();
        System.out.println("Entre com a terceira nota:");
        nota3 = ler.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.printf("%.1f", media);
        } else if (media >= 5) {
            System.out.printf("Recuperação com média %.1f ",media);
        } else {
            System.out.printf("Reprovado com média %.1f", media);
           
        }
    }
}

