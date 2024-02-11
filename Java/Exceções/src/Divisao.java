public class Divisao {
    
    public static void main(String[] args) {
        int dominador, denominador;
        float resultado;
        dominador = 2;
        denominador = 0;
        try{
            resultado = dominador/denominador;

            System.out.println(resultado);
        }
        catch(ArithmeticException e){
            System.out.println("Não podemos ter uma divisão por zero");
        }

        for(int i=0; i<10; i++){
            
        }
    }
}
