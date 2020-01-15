package br.com.exemplo;

public class Main {
    public static void main(String[] args) {
        Cao cao = new Cao();
        cao.nome = "Bob";
        cao.peso = 12;
        cao.idade = 18;

        cao.latir();

        if(cao.idade > 18){
            System.out.println("Ele é maior de idade");
        }else if(cao.idade>=12 && cao.idade<=18){
            System.out.println("Ele é um adolecente");
        }else{
            System.out.println("ele é uma criança");
        }

        //System.out.println(cao.toString());


    }
}
