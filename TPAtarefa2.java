//Olá, eu sou Luís e esse é a minha tarefa de TPA, vamos dar uma olhada.
package com.mycompany.tpatarefa2;
import java.util.Scanner;

public class TPAtarefa2 {

    //Primeira tarefa
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);     
    
   System.out.print("Digite o primeiro número: ");
   double n1 = scanner.nextDouble();
   
   System.out.print("Digite o segundo número: ");
   double n2 = scanner.nextDouble();
   
   double soma = n1 + n2;
   double subtracao = n1 - n2;
   double multiplicacao = n1 * n2;
   double divisao = n1 / n2;
   
   System.out.println("Soma: " + soma);
   System.out.println("Subtração: " + subtracao);
   System.out.println("Multiplicaçao: " + multiplicacao);
   System.out.println("Divisão: " + divisao);           
 
   //Término da primeira tarefa
   
   
   //Segunda tarefa
  System.out.print("Digite os graus celsius: ");
   double celsius = scanner.nextDouble();
   
   double  fahrenheit = celsius * 1.8 + 32;
   double kelvin = celsius + 237.15;
   System.out.println("O número em  fahrenheit é: " +  fahrenheit);
   System.out.println("O número em kelvin é: " + kelvin);
  
   //Término da segunda tarefa
   
   
   //Terceira tarefa
   System.out.print("Digite um número inteiro: ");
   int numero = scanner.nextInt();
   
   boolean eprimo = true;
   
   if (numero <= 1) {
            eprimo = false; // Números que sejam menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    eprimo = false; // Se houver um divisor, não é primo
                    break;     
        
        
                }
            }
   }
   
   if (eprimo) {
       System.out.println("O número "+ numero +" é primo");
   } else {
       System.out.println("O número "+ numero +" não é primo");
   }
        
   //Término da terceira tarefa
   
   
        //Quarta tarefa
            double nota1, nota2, nota3, nota4, media;
            // Lendo as 4 notas
            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();
            System.out.print("Digite a terceira nota: ");
            nota3 = scanner.nextDouble();
            System.out.print("Digite a quarta nota: ");
            nota4 = scanner.nextDouble();
            // Calculando a média
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            // Mostrando o resultado
            System.out.println("A média é: " + media);
            
            //Término da quarta tarefa
            
            
            //Quinta tarefa
            System.out.print("Digite um número: ");
        int Numero = scanner.nextInt();

        System.out.println("Tabuada de " + Numero + ":");
        System.out.println(Numero + " x 1 = " + (Numero * 1));
        System.out.println(Numero + " x 2 = " + (Numero * 2));
        System.out.println(Numero + " x 3 = " + (Numero * 3));
        System.out.println(Numero + " x 4 = " + (Numero * 4));
        System.out.println(Numero + " x 5 = " + (Numero * 5));
        System.out.println(Numero + " x 6 = " + (Numero * 6));
        System.out.println(Numero + " x 7 = " + (Numero * 7));
        System.out.println(Numero + " x 8 = " + (Numero * 8));
        System.out.println(Numero + " x 9 = " + (Numero * 9));
        System.out.println(Numero + " x 10 = " + (Numero * 10));
        
        //Término da quinta tarefa
        
        //Sexta tarefa
        // Lendo os dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        String var = scanner.nextLine();

        System.out.print("Digite sua data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite o nome do seu curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite sua série: ");
        String serie = scanner.nextLine();

        System.out.print("Digite sua altura : ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie + " ano");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");

        scanner.close();

        }
    
    }

   