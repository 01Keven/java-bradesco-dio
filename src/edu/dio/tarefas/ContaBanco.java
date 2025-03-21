package edu.dio.tarefas;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Numero do cliente: ");
        int numero = scanner.nextInt();

        String agenciaValida = validarAgencia(scanner);
        System.out.print("Agencia confirmada: " + agenciaValida);


        System.out.print("\nSaldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Agencia: " + agenciaValida);
        System.out.println("Saldo: " + saldo);

        scanner.close();

    }

    public static String validarAgencia(Scanner scanner) {
        String agencia;
        String regex = "^\\d{3}-\\d$";

        while (true) {
            System.out.print("Agencia do cliente: ");
            agencia = scanner.nextLine();

            if (agencia.matches(regex)) {
                System.out.println("numero da agencia valido: " + agencia);
                return agencia;
            } else {
                System.out.println("Formato invalido!");
            }
        }
        
    }
}
