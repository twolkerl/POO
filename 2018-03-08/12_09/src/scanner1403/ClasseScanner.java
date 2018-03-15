
package scanner1403;

/**
 * classe Scanner: facilita leitura de dados no console 
 * O objeto System.in é o que faz a leitura do que se escreve no teclado
 *
 */

import java.util.Scanner; //import java.util.*;

public class ClasseScanner {

    //Métodos invocados da classe Scanner

   Scanner ler = new Scanner(System.in); 
//instancio o Scanner para utilizar com os tipos de dados digitados. A variável “ler” //representará a instância do objeto ( que será int, float, double etc)

   float numFlutante = ler.nextFloat(); //numeros “decimais”
   int numInteiro = ler.nextInt(); //números inteiros
   byte byte1 = ler.nextByte(); //bytes
   long longo = ler.nextLong(); //int longo
   boolean booleano = ler.nextBoolean(); //true ou false
   double numFlutante2 = ler.nextDouble(); // valores double
   String nome = ler.next();//receber strings
}



