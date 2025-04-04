package application;
import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {

            contar(parametroUm, parametroDois);
        
        } 
        catch (ParametrosInvalidosException e) {

            System.out.println("TESTE");            
            
        }

        sc.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        else {
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++ ){
                System.out.println("Imprimindo o número " + i);
            }

        }
    }
    
}

