package br.com.desafio.fibonacci;

public class Main {

    public static void main(String[] args) {
        Fibonacci fi = new Fibonacci();
        System.out.println("Fibonacci sequence:");
        for(int item: fi.fibonacci(350)){
            System.out.print(item +" , ");
        }
        System.out.println("");
        System.out.println("isFibonacci 13 = "+fi.isFibonacci(13));
        System.out.println("isFibonacci 33 = "+fi.isFibonacci(33));
        System.out.println("isFibonacci 89 = "+fi.isFibonacci(89));
        System.out.println("isFibonacci 700 = "+fi.isFibonacci(700));
    }
}
