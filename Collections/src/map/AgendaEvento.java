package map;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEvento(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEventos(LocalDate data, String nome, String atracao){
        //Evento evento =  new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEventos = new AgendaEvento();

        agendaEventos.adicionarEventos(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEventos(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEventos(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.SEPTEMBER, 19), "Evento 4", "Atração 4");
        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.SEPTEMBER, 21), "Evento 5", "Atração 5");
        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.OCTOBER, 14), "Evento 6", "Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento(); 
    }
}
