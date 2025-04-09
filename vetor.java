import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário quantos nomes e idades deseja adicionar
        System.out.println("Quantos nomes e idades você quer adicionar? ");
        int tamanho = scanner.nextInt();

        // Cria dois vetores: um para os nomes e outro para as idades
        String[] nomes = new String[tamanho];
        int[] idades = new int[tamanho];

        // Limpa o buffer após o nextInt()
        scanner.nextLine();

        // Pergunta para o usuário os nomes e idades
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();  // Lê o nome

            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = scanner.nextInt();  // Lê a idade

            // Limpa o buffer após o nextInt()
            scanner.nextLine();
        }

        // Exibe os nomes e idades
        System.out.println("\nDados cadastrados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("-----------------------------------------------");
        }
    }
}
