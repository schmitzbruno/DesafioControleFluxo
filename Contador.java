import java.util.Scanner;

public class Contador {

    static int um;
    static int dois;

    public static void main(String[] args) throws ParametrosInvalidosException {

        try {
            // chamando o método contendo a lógica de contagem
            contar(digitarUm(), digitarDois());

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            System.out.println(" ");
            contar(digitarUm(), digitarDois());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        System.out.println("Imprimir os " + contagem + " numeros do intervalo.");
        for (int x = 1; x < contagem; x++) {
            System.out.print(parametroUm + x + " ");
        }
    }

    static int digitarUm() {

        Scanner terminalUm = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        try {
            um = terminalUm.nextInt();
        } catch (Exception e) {
            System.out.println("O parâmetro precisa ser um numero.");
            System.out.println(" ");
            digitarUm();
        }

        return um;
    }

    static int digitarDois() {

        Scanner terminalDois = new Scanner(System.in);
        System.out.println("Digite o segundo parâmetro:");
        try {
            dois = terminalDois.nextInt();
        } catch (Exception e) {
            System.out.println("O parâmetro precisa ser um numero.");
            System.out.println(" ");
            digitarDois();
        }

        return dois;
    }
}