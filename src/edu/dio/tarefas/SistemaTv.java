package edu.dio.tarefas;

public class SistemaTv {
    // MELLHORIAS = encapsular variaveis, private
    boolean estadoTv;
    int canal;
    int volume;

    // Adicionar gets e setters

    public SistemaTv(boolean estadoTv, int canal, int volume) {
        this.estadoTv = estadoTv;
        this.canal = canal;
        this.volume = volume;
    }

    public void estadoDaTvLigada(boolean novoEstado) {
        this.estadoTv = novoEstado;
        if (estadoTv) {
            System.out.println("tv ligada");
        }else {
            System.out.println("tv desligada");
        }
    }

    // Adicionar validação para nao passar de 100
    public void aumentarVolume() {
        volume +=1;
        System.out.println("aumentou volume: " + volume);
    }

    // Adicionar validação para nao passar de 0
    public void diminuirVolume() {
        volume -=1;
        System.out.println("diminuir volume: " + volume);
    }

    public int trocarCanal(int novoCanal) {
        this.canal = novoCanal;
        System.out.println("trocou canal para: " + this.canal);
        return this.canal;

    }

    public static void main(String[] args) {
        SistemaTv tv1 = new SistemaTv(true, 1,4);
        System.out.println(tv1.canal);
        tv1.estadoDaTvLigada(true);
        tv1.trocarCanal(3);
        tv1.aumentarVolume();
        tv1.diminuirVolume();
        tv1.diminuirVolume();
    }
}
