package org.example;

public class Pontuacao {
    private int pontuacao;

    public Pontuacao() {
        this.pontuacao = 0; 
    }

    public int getPontuacao() {
        return pontuacao;
    }


    public void adicionarPontos(int pontos) {
        if(pontos > 0)
            this.pontuacao = pontuacao + pontos;
            /* this.pontuacao += pontos*/
    }

    public void removerPontos(int pontos) {
        if(pontos > 0 && this.pontuacao >= pontos){
            this.pontuacao = pontuacao - pontos;
            /* this.pontuacao -= pontos*/
        }
    }
}