package br.com.diego.lacoserepeticao.examplefor;

public class ForExample {

    public static void main(String[] args) {

        /*variavel de controle;condição;ação*/
        System.out.println("icremento");
        for(int i = 0; i <= 10; ++i){
            System.out.println("valor de i= " +  i );


        }

        System.out.println("decremento");
        for(int i = 10; i >= 0; --i){
            System.out.println("valor de i= " +  i );

        }

        System.out.println("for encadeado");
        for(int i = 1; i <= 3; i++) {
            //loop de j
            for(int j = 1; j <=3; j++) {
                System.out.println("i:" + i + " j:" + j);
            } // fim de j
        } // fim de i

        System.out.println("descendo e subindo");
        for(int sobe=1, desce=10 ; sobe<=10 && desce>=1; sobe++, desce--){
            System.out.printf("%d \t %d \n", sobe, desce);
        }

    }
}

