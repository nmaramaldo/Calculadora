import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os números ao usuário
        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicitar a operação desejada
        System.out.println("Escolha a operação: ");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int opcao = scanner.nextInt();

        // Realizar a operação
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                } else {
                    System.out.println("Erro: a divisão não pode ser realizada com 0");
                }

            default:
                System.out.println("Operação inválida.");
                break;
        }
        scanner.close();

    }
}