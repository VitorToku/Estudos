public class Relacionais {
    public static void main(String[] args) {
        //Compara dois valores.
        int num1,num2;
        num1 = 1;
        num2 = 2;
        if(num1 == num2){System.err.println("Iguais");} // O operador == retorna verdadeiro caso os dois valores seja iguais
        if(num1 > num2){System.err.println("Iguais");} // O operador > retorna verdadeiro caso o primeiro valor é maior que o segundo
        if(num1 >= num2){System.err.println("Iguais");} // O operador >= retorna verdadeiro caso o primeiro valor é maior ou igual ao segundo

        /* Caso tenhamos um objeto, será um caso diferente */

        String nomeUm = "Vitor";
        String nomeDois = new String("Vitor");

        System.err.println(nomeUm == nomeDois); //Vai retornar false, pois estamos comparando com um objeto
        System.err.println(nomeUm.equals(nomeDois)); //Vai retornar true, pois agora estamos comparando com o conteúdo do objeto
    }
}
