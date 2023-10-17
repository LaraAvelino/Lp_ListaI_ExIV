import java.util.Scanner;

public class CalculoSalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFuncionarios = 2;
        int[] numeros = new int[numFuncionarios];
        double[] horasTrabalhadas = new double[numFuncionarios];
        double[] valorPorHora = new double[numFuncionarios];

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Digite o número do funcionário " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            System.out.print("Digite o número de horas trabalhadas pelo funcionário " + (i + 1) + ": ");
            horasTrabalhadas[i] = scanner.nextDouble();
            System.out.print("Digite o valor recebido por hora pelo funcionário " + (i + 1) + ": ");
            valorPorHora[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numFuncionarios; i++) {
            double salario = horasTrabalhadas[i] * valorPorHora[i];
            System.out.printf("Funcionário %d: Salário = %.2f%n", numeros[i], salario);
        }

        scanner.close();
    }
}
