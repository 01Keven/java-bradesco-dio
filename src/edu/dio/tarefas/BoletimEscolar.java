package edu.dio.tarefas;
public class BoletimEscolar {
    public static void main(String[] args) {
        double media = 7.0;
        double notaAluno = notaMedia(7.0, 7.0);
        if (notaAluno < media) {
            System.out.println("Aluno Reprovou!");
        } else {
            System.out.println("Aluno passou! nota: " + notaAluno);
        }
    }

    public static double notaMedia(double primeiraNota, double segundaNota) {
        return (primeiraNota + segundaNota) / 2;
    }
}
