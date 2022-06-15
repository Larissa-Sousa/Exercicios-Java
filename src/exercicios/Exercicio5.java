package exercicios;
import java.util.Scanner;

public class Exercicio5 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        String nome;
        int idade;

        System.out.println("Olá, qual é o seu nome?");
        nome = leitor.nextLine();
        System.out.println(nome + ", digite a sua idade:");
        idade = leitor.nextInt();

        if (idade<16){
            System.out.println(nome + ", você não é elegível para votar.");
        }else if (idade>=16 && idade<18){
            System.out.println(nome + ", você pode votar mas o seu voto não é obrigatório.");
        }else if (idade>=18 && idade<66){
            System.out.println(nome + ", seu voto é obrigatório!");
        }else if (idade>65){
            System.out.println(nome + ", você pode votar mas o seu voto não é obrigatório.");
        }
    }
}