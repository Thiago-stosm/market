package testes;

import java.util.Scanner;


public class idGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[4];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        int[] vetor2 = vetor.clone();

        for(int i = 3; i>-1; i--){

            if (vetor2[i] < 9 ){
                vetor2[i] ++;
                break;
            }
            else{
                vetor2[i] = 0;
            }
        }
        for(int x: vetor2){
            System.out.println(x);
        }
    }
}
