import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao processo seletivo!");

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "MARIANA", "DANIELA", "JOAO", "PEDRO", "LAURA"};

        selecionarCandidatos(candidatos);

    }

    public static void selecionarCandidatos(String [] candidatos){
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        String [] candidatosFinais = {"","","","",""};

        System.out.println("\nSelecionando candidatos...");
        while(candidatosSelecionados<5 && candidatoAtual < (candidatos.length - 1)){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidadto "+ candidato + " solicitou o seguinte salário: "+ salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+ " foi selecionado para a vaga.");
                candidatosFinais[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            else{
                System.out.println("O candidato "+ candidato + " NÃO foi selecionado para a vaga");
            }
            candidatoAtual++;
        }

        System.out.println("\nEntrando em contato com os candidatos selecionados...");
        for (String candidato : candidatosFinais){
            entrarEmContato(candidato);
        }

        System.out.println("\nImprimindo a lista de candidatos selecionados...");
        imprimirSelecionados(candidatosFinais);
    }

    public static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
        } while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Contato com "+ candidato + " feito com sucesso na tentativa " + tentativasRealizadas );
        else
            System.out.println("Não foi possível entrar em contato com " + candidato + " número máximo de tentativas.");

    }

    public static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    public static void imprimirSelecionados(String [] candidatos){
       for(String candidato : candidatos){
           System.out.println("O candidato selecionado foi : "+ candidato);
       }
    }

    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("Ligar para o candidato!");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        }
        else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}