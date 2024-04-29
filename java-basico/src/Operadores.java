public class Operadores {
    public static void main(String[] args){
            int a , b;
            a = 6;
            b = 6; 
            //String resultado = a == b ? "verdadeiro" : "falso";
                                          //(true: false)
            //System.out.println(resultado);
        String nomeUm = "Paulo César";
        String nomeDois = new String("Paulo César");
                            // new- nobo objeto
        System.out.println(nomeDois.equals(nomeUm ));
                                    // método equals é utilizado para comparar strings, levando em consideração seu conteúdo.
        int numero1 = 1;
        int numero2= 2; 

        boolean simNao = numero1 == numero2;
        if(numero1<numero2){
            System.out.println("Essa condição é verdadeira");
        }


        System.out.println("numero1 é diferente de numero2? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? "+ simNao);
        simNao = numero1 < numero2;
        System.out.println("numero1 é maior que o numero2? "+ simNao);

        boolean condição1 = true;
        boolean condição2 = false;

        if(condição1 && condição2){
            System.out.println("As duas condições são verdadeiras.");
        }   
        if(condição1 || condição2){
              System.out.println("Uma das condições é verdadeira.");
    }   
        if(condição1 && (7>4)){
             System.out.println("As duas condições são verdadeiras.");
}   
    
       
        





    }
}
