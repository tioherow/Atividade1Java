package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean  concluir;


    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.concluir= false;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }


    public void concluirTarefa() {
      this.concluir= true;

    }

    public boolean isConcluida() {
        return  concluir;
    }


    public void alterarPrazo(String date) {
        this.prazo = ("2024-09-10");
    }
}
