package br.com.douglaspac.androidnivelamento;

/**
 * Created by pacdouglas on 17/03/16.
 */
public class Pessoa {

    private String nome;
    private double altura;
    private double peso;


    public Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static Pessoa maisAlta(Pessoa p1, Pessoa p2){
        if(p1.getAltura()>p2.getAltura())
            return p1;
        else
            return p2;
    }

    public static Pessoa maisPesada(Pessoa p1, Pessoa p2){
        if(p1.getPeso()>p2.getPeso())
            return p1;
        else
            return p2;
    }
}
