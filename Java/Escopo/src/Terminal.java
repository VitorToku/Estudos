public class Terminal {
    public static void main(String[] args) throws Exception {
        //Escopo é o ambiente onde uma variável é declarada

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.err.println("Nome: " + nome);
        System.err.println("Sobrenome: " + sobrenome);
        System.err.println("Idade: " + idade);
        System.err.println("Altura: " + altura + "m");
    }
}
