package util;

import java.util.Scanner;

public class Validador {

    public static String lerCPF(Scanner leitor) {
        while (true) {
            String cpf = leitor.nextLine().trim();
            cpf = cpf.replaceAll("[^0-9]", ""); // aqui eu chamei o metodo "replace" para que ele delete tudo que não for numeros de 0 a 9
                                            

            if (cpf.length() == 11) {
                return cpf;

            } else {
                System.out.println("Erro: O CPF deve conter exatamente 11 números! Tente novamente.");
            }

        }
    }

    public static String lerTelefone(Scanner leitor) {
        while (true) {

            String telefone = leitor.nextLine().trim();
            telefone = telefone.replaceAll("[^0-9]", "");

            if (telefone.length() == 11) {
                return telefone;

            } else {
                System.out.println("Erro: O telefone deve conter 11 números (xx)xxx...! Tente novamente.");

            }

        }
    }


    public static int lerNumeroInteiro(Scanner leitor, String mensagemErro) {
    while (true) {
        try {
            int numero = leitor.nextInt();
            leitor.nextLine(); 
            return numero;
        } catch (java.util.InputMismatchException e) {
            System.out.println(mensagemErro);
            leitor.nextLine(); 
        }
    }
}
}
