package edu.dio.sintaxe;

public class ConcatenarString {
    public static void main(String[] args) {
        String primeiroNome = "keven";
        String segundoNome = "christian";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
