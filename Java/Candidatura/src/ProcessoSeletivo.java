import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    static double salarioBase = 2000.00; 
    public static void main(String[] args) {
        String[] nomeCandidatos = {"Felipe", "Pedro", "Maria", "Saulo","Pablo"," Zé", "Gabriela"," João","Lucas","Cléber"};
        Candidato[] candidatos = new Candidato[nomeCandidatos.length];

        for(int i = 0; i< nomeCandidatos.length;i++){
            candidatos[i] = new Candidato();
            candidatos[i].nome = nomeCandidatos[i];
            candidatos[i].salarioPretendido = valorPretendido();
        }

        analisarCandidatos(candidatos);
    }
    static void analisarCandidatos(Candidato[] candidatos){

        for (Candidato candidato : candidatos) {

            if (salarioBase > candidato.salarioPretendido){
                System.out.println("Ligar para o candidato " + candidato.nome);
            }
            else if(salarioBase == candidato.salarioPretendido){
                System.out.println("Ligar para o candidato " + candidato.nome +" com contra proposta");
            }
            else{
                System.out.println("Aguardando resultado dos demais candidatos");
            }
        }
        
    }

    // método criado para gerar um salário aleatório
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
