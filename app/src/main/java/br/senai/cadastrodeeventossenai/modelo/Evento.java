package br.senai.cadastrodeeventossenai.modelo;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento implements Serializable {

    private int id;
    private String nome;
    private LocalDate data;
    private String local;


    public Evento(int id, String nome, LocalDate data, String local) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(String data) {
        String format = "dd/MM/yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        this.data = LocalDate.parse(data, formatter);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(LocalDate date) {
        this.data = data;
    }

    @NonNull
    @Override
    public String toString() {
        return nome + "\n" +
                "Data: " + data +
                " / Local : " + local;
    }
}

