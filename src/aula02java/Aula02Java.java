package aula02java;

public class Aula02Java {

    public static void main(String[] args) {
        String nome = "Joao Antonio";
        int dataNacimento = 2005;
        double altura = 1.68;
        boolean eProessor = true;
        char genero = 'M';

        System.out.println("oi" + nome + "você tem" + qualIdade(2005) + "anos de idade");
        
        if(qualIdade(dataNacimento) >= 18){
            System.out.println("você é maior de idade, pode ser preso!");
        }else{
            System.out.println("você ainda não é maior de idade");
        }
        
     //VETORES
           String[] frutas = new String[5];
        frutas[0] = "LARANJA";
        frutas[1] = "MAÇA"; 
        
        
        String[] frutaDois = {"LARANJA","MAÇA"};
        
            int[] numeros = {1,2,3,4,5,6,7,8};   
        int[] nemerosDois = new int[8];
        
        
        //ESTRUTURA DE REPETIÇÃO
        for (String fruta : frutas) {
            System.out.println(fruta);
        }    
        
         int i = 0;
        while(i < frutas.length){
            System.out.println(frutas[i]);
            i++;
            
        }
        
        
    }

    static int qualIdade(int dataNacimento) {
        return 2023 - dataNacimento;

    }
}
