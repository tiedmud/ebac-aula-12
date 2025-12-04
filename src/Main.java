import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de objetos até 50: ");
        int quantidade = scanner.nextInt();

        scanner.nextLine();

        Carro[] carros = new Carro[quantidade];

        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Carro();

            System.out.print("Digite a cor: ");
            String cor = scanner.nextLine();

            carros[i].cor = cor;

            System.out.print("Digite o modelo: ");
            String modelo = scanner.nextLine();

            carros[i].modelo = modelo;

            System.out.print("Digite o ano: ");
            String ano = scanner.nextLine();

            carros[i].ano = ano;

            System.out.print("Digite o preço: ");
            float preco = scanner.nextFloat();

            scanner.nextLine();

            carros[i].preco = (preco);
        }

        for (int i = 0; i < carros.length; i++) {
            System.out.print(carros[i].toString() + " ");
        }

        float total = 0;

        for (int i = 0; i < carros.length; i++) {
            total = total + carros[i].preco;
        }

        System.out.print("Total: " + total);

        scanner.close();
    }
}