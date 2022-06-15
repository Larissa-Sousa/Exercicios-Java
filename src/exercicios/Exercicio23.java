package exercicios;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num, cont=0, cont2=0, cont3=0;

        for (int i = 1; i < 21; i++) {
            System.out.println("Insira o " + i + "° número:");
            num = leitor.nextInt();

            if(num>=0 && num<=100){
                cont ++;
            }else if(num>=101 && num<=200) {
                cont2++;
            }else if(num>200) {
                cont3++;
            }
        }
        if(cont>=1) {
            System.out.println("Dos 20 números inseridos, " + cont + " estão entre 0 e 100, "
                    + cont2 + " estão entre 101 e 200 e " + cont3 + " são maiores que 200.-");
        }else{
            System.out.println("Nenhum número inserido está entre 0 e 100, 101 e 200 ou são maiores que 200.");
        }
    }
}
