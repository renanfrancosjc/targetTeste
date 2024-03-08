package LogicaFibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
       Scanner quantidade = new Scanner(System.in);
       System.out.println("Digite uma quantidade para sequencia de fibonacci");

       int fiboSoma = quantidade.nextInt();
       int[] fiboInit = new int[fiboSoma];

       fiboInit[0] = 0;
       fiboInit[1] = 1;

       for (int i = 2; i < fiboSoma; i++){
           fiboInit[i] = fiboInit[i - 1] + fiboInit[i - 2];
          }

       System.out.println("Sequecia de fibonacci de " + fiboSoma);
       for(int i = 0; i < fiboSoma; i++){
           System.out.println(fiboInit[i] + "  ");
         }
    }
}
