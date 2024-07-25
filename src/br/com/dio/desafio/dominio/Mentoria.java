package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.data = LocalDate.now();
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + getData() + "]";
    }


}
