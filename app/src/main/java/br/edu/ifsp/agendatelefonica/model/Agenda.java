package br.edu.ifsp.agendatelefonica.model;

public class Agenda {
   private String nome;
   private String telefone;

   public Agenda (String nome, String telefone){
       this.nome = nome;
       this.telefone = telefone;
   }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

}
