package br.com.desafio.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> listFibonacci = null;

    public List<Integer> fibonacci(int point){
        listFibonacci = new ArrayList<>();
        listFibonacci.add(0);
        listFibonacci.add(1);

        for(int value=0; value<=point; value = listFibonacci.get(listFibonacci.size()-2) + listFibonacci.get(listFibonacci.size()-1)){
            listFibonacci.add(value);
        }
        return listFibonacci;
    }

    public Boolean isFibonacci(int value){
        return listFibonacci.contains(value);
    }
}
