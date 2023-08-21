package main;

public class Principal {

    // Função recursiva para converter um número decimal para binário
    private static String convertToBinary(int decimal) {
        // Condição de parada: quando o número decimal é 0
        if (decimal == 0) {
            return "0";
        }

        // Relação de chamada dos passos: calcular o resto da divisão por 2 (bit menos significativo)
        // e chamar a função recursiva com o quociente da divisão inteira
        int remainder = decimal % 2;
        int quotient = decimal / 2;

        return convertToBinary(quotient) + remainder;
    }
}

