package exercicios;
import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        int prato, sobremesa, bebida, calculo;

        System.out.println("Digite o número que corresponde ao prato: ");
        System.out.println("1 - Vegetariano;");
        System.out.println("2 - Peixe;");
        System.out.println("3 - Frango;");
        System.out.println("4 - Carne.");
        prato = leitor.nextInt();

        System.out.println("Digite o número que corresponde a sobremesa: ");
        System.out.println("1 - Abacaxi;");
        System.out.println("2 - Sorvete Diet;");
        System.out.println("3 - Mousse Diet");
        System.out.println("4 - Mousse de Chocolate");
        sobremesa = leitor.nextInt();

        System.out.println("Digite o número que corresponde a bebida: ");
        System.out.println("1 - Chá");
        System.out.println("2 - Suco de laranja");
        System.out.println("3 - Suco de melão");
        System.out.println("4 - Refrigerante Diet");
        bebida = leitor.nextInt();

        switch (prato){
            case 1:  prato = 180;
                break;
            case 2:  prato = 230;
                break;
            case 3:  prato = 250;
                break;
            case 4:  prato = 350;
                break;
        }

        switch (sobremesa){
            case 1:  sobremesa = 75;
                break;
            case 2:  sobremesa = 110;
                break;
            case 3:  sobremesa = 170;
                break;
            case 4:  sobremesa = 200;
                break;
        }

        switch (bebida){
            case 1:  bebida = 20;
                break;
            case 2:  bebida = 70;
                break;
            case 3:  bebida = 100;
                break;
            case 4:  bebida = 65;
                break;
        }

        calculo = prato + sobremesa + bebida;
        System.out.println("A quantidade total de calorias presente na sua refeição é de: " + calculo);

        leitor.close();
    }
}
