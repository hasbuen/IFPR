import java.util.Scanner;

class Main {

    // Método para receber as notas do usuário
    public static double[] receberNotas() {
        double[] listaDeNotas = new double[4]; // Cria um array para armazenar as notas

        Scanner scanner = new Scanner(System.in);

        // Loop para solicitar ao usuário que insira as quatro notas
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
             String input = scanner.next();
            input = input.replace(",", "."); // Substitui vírgula por ponto, se houver
            listaDeNotas[i] = Double.parseDouble(input); // Converte para double
        }

        return listaDeNotas; // Retorna o array de notas preenchido
    }

    // Método para calcular a média e verificar se o aluno foi aprovado
    public static boolean calculaMedia(double[] notas) {
        double soma = 0.0;

        // Loop para somar todas as notas
        for(double nota : notas) {
            soma += nota;
        }

        // Calcula a média e compara com o valor de corte para aprovação
        return ((soma / notas.length) >= 6.0);
    }

    // Método principal do programa
    public static void main(String args[]) {
        // Chama o método para receber as notas do usuário
        double[] notasBimestrais = receberNotas();

        // Chama o método para calcular a média e determinar se o aluno foi aprovado
        boolean aprovado = calculaMedia(notasBimestrais);

        // Imprime o resultado com base na decisão de aprovação
        String resultado = (aprovado) ? "aprovado(a)" : "reprovado(a)";
        System.out.println("Dicente " + resultado + "!");
    }
}