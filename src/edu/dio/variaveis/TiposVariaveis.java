package edu.dio.variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos
        
        // byte: Armazena números inteiros de -128 a 127 (1 byte)
        byte idade = 25;
        
        // short: Armazena números inteiros de -32.768 a 32.767 (2 bytes)
        short populacaoPequenaCidade = 15000;
        
        // int: Armazena números inteiros de -2.147.483.648 a 2.147.483.647 (4 bytes)
        int populacaoGrandeCidade = 1200000;
        
        // long: Armazena números inteiros muito grandes, necessário usar "L" no final (8 bytes)
        long populacaoMundial = 7800000000L;
        
        // float: Armazena números decimais, necessário usar "F" no final (4 bytes)
        float altura = 1.75F;
        
        // double: Armazena números decimais com mais precisão (8 bytes)
        double peso = 70.5;
        
        // char: Armazena um único caractere (2 bytes)
        char letra = 'A';
        
        // boolean: Armazena valores verdadeiro (true) ou falso (false) (1 bit)
        boolean estaChovendo = false;
        
        // Tipos não primitivos (Referência)
        
        // String: Armazena textos (conjunto de caracteres)
        String nome = "João";
        
        // Array: Conjunto de valores do mesmo tipo
        int[] numeros = {1, 2, 3, 4, 5};
        
        // Exibir os valores
        System.out.println("Idade: " + idade);
        System.out.println("População Pequena Cidade: " + populacaoPequenaCidade);
        System.out.println("População Grande Cidade: " + populacaoGrandeCidade);
        System.out.println("População Mundial: " + populacaoMundial);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Letra: " + letra);
        System.out.println("Está chovendo? " + estaChovendo);
        System.out.println("Nome: " + nome);
        System.out.println("Primeiro número do array: " + numeros[0]);
    }
}
