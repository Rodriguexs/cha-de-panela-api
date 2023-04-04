package br.com.chadepanelaapi.chadepanelaapi.entity;

import javax.persistence.*;

@Entity
public class Convidado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column
    String nome;

    @Column
    Boolean confirmado;

    @Column
    int qtdAcompanhantes;

    @OneToOne
    @JoinColumn(name = "presente_id")
    private Presente presente;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    public int getQtdAcompanhantes() {
        return qtdAcompanhantes;
    }

    public void setQtdAcompanhantes(int qtdAcompanhantes) {
        this.qtdAcompanhantes = qtdAcompanhantes;
    }

    public Presente getPresente() {
        return presente;
    }

    public void setPresente(Presente presente) {
        this.presente = presente;
    }
}
