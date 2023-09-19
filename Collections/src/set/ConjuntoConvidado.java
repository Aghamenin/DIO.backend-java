package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int condigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvidado() == condigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem "+ conjuntoConvidado.contarConvidado() + "convidados dentro do set Convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1 ", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2 ", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3 ", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 4 ", 1236);

        System.out.println("Existem "+ conjuntoConvidado.contarConvidado() + "convidados dentro do set Convidados" );

        conjuntoConvidado.removerConvidadoPorCodigo(1234);
        System.out.println("Existem "+ conjuntoConvidado.contarConvidado() + "convidados dentro do set Convidados" );

        conjuntoConvidado.exibirConvidados();
    }
}
