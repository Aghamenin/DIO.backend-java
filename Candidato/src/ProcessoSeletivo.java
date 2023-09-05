import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"FELIPE", "MARIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato : candidatos){
            entradoEmContato(candidato);
        }
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
       // analisarCandidato(2000.0);
       //selecaoCandidatos();
       //imprimirSelecionados();
       
    }
    static void entradoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }    
        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu) 
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato + " NA " +tentativasRealizadas+ " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato+ ", NUMERO MAXIMO DE TENTATIVAS FOI "+tentativasRealizadas);
           
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento ");

        for(int indice = 0; indice < candidatos.length;indice++){
            System.out.println("O Candidato de n° "+(indice+1)+" é "+candidatos[indice]);
        }
        System.out.println(" FORMA ABREVIADA DE INTERAÇÃO for each ");
        for(String candidato:candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }

    }
    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARIA", "JULIA", "PAULO", "AUGUSTO", "MONICA","FABRICIO", "MIRELLA", "GABRIELLA", "JORGE"};
        int candidatosAtual = 0;
        int canditadosSelecionados = 0;
        double salarioBase = 2000.0;

        while(canditadosSelecionados < 5 && candidatosAtual < candidatos.length){
            String canditado = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ canditado + " solicitou este valor de salário "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+canditado+" foi selecionado para a vaga ");
                canditadosSelecionados++;
            }
            candidatosAtual++; 
        }
    }
    static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
