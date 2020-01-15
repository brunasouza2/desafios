package br.com.desafio.criptografia;

import java.util.ArrayList;
import java.util.List;

public class Criptografia {
    private List<String> alfabeto = new ArrayList<>(List.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));

    public String criptografar(String text){
        String[] textNoEncript = text.toLowerCase().split("");
        String encript = "";

        for(int i=0;i<textNoEncript.length;i++){
            String letra = textNoEncript[i];
            if(isNumber(letra)){
                encript+=letra;
            }else{
                if(alfabeto.contains(letra)){
                    int index = alfabeto.indexOf(letra);

                }
            }
        }
        return encript;
    }

    private boolean isNumber(String value){
        try{
            Integer.valueOf(value);
            return true;
        }catch (Exception e){
            return false;
        }
    }

//    private String proxElemento(int index){
//        int newIndex = 0;
//        if(index>23){
//            int o = 26-index;
//            int x = 3-o;
//            xyzabc
//        }
//    }
}
