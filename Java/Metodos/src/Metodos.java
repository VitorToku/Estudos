public class Metodos {
    /*  Métodos são as funções ou sub-rotinas dentro de uma classe 
        O nome de um método deve ser um verbo e deve ser em camelCase

        Precisamos especificar o tipo de dado da saída do método.
        Caso não retorne, deixamos como void
    */ 
    public static void main(String[] args) throws Exception {
    
    }

    public double somar(int num1, int num2){
        return num1 + num2;
    }

    public void imprimir(String palavra){
        System.err.println(palavra);
    }

    //throws Exception: indica que o método pode ter uma exceção

    private void metodoPrivado(){} //Esse método não pode ser visto por outras classes

}
