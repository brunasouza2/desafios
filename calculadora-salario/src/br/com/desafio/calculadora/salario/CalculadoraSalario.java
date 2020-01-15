package br.com.desafio.calculadora.salario;

public class CalculadoraSalario {

    private double calcularDescontoINSS(double salarioBruto){
        if(salarioBruto<=1500){
            salarioBruto = salarioBruto - (salarioBruto*0.08);
        }else if(salarioBruto>=1500.01 && salarioBruto<=4000){
            salarioBruto = salarioBruto - (salarioBruto*0.09);
        }else if(salarioBruto>4000){
            salarioBruto = salarioBruto - (salarioBruto*0.11);
        }
        return salarioBruto;
    }

    private double calcularDescontoIRRF(double salarioBruto){
        if(salarioBruto<=3000){
            salarioBruto = salarioBruto - (salarioBruto*0);
        }else if(salarioBruto>=3000.01 && salarioBruto<=6000){
            salarioBruto = salarioBruto - (salarioBruto*0.075);
        }else if(salarioBruto>6000){
            salarioBruto = salarioBruto - (salarioBruto*0.15);
        }
        return salarioBruto;
    }

    public int calcularSalarioLiquido(double salarioBruto){
        if(salarioBruto<1039.0){
            return 0;
        }
        double salarioComDescontoINSS = calcularDescontoINSS(salarioBruto);
        double salarioComDescontoIRRF = calcularDescontoIRRF(salarioComDescontoINSS);
        long salarioLiquido = Math.round(salarioComDescontoIRRF);
        return (int) salarioLiquido;
    }
}
