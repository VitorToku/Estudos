public class Logicos {
    public static void main(String[] args) {
        // Podemos criar operações lógicas maiores
        // && é o operador lógico "E"
        // || é o operador lógico "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){System.err.println("Ambas verdadeiras");}
        if(condicao1 || condicao2){System.err.println("Pelo menos uma é verdadeiras");}
    }
}
