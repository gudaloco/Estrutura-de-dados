
package AC1;

import java.util.ArrayList;
import java.util.List;

public class FilaPacientes {

    ArrayList<Paciente> fila = new ArrayList<Paciente>();

    public void adicionar(Paciente item) {
        // pega a informação de prioridade do paciente
        int prioidade = item.getPrioridade();

        // criando um int para o paciente
        int paciente = 0;

        // criando um while para encontrar a posição do paciente na fila
        while (paciente < fila.size() && fila.get(paciente).getPrioridade() <= prioidade) {
            paciente++;

        }
        // adiciona o paciente na posição de prioridade correta da fila
        fila.add(paciente, item);
    }

    public Paciente remover() {
        // Remove do inicio da Lista.....
        return fila.remove(0);
    }

    public Paciente exibirInicio() {
        // Lê a primeira posição sem remover
        return fila.get(0);
    }

    public int tamanho() {
        // retorna o tamanho da lista.
        return fila.size();
    }

    public ArrayList<Paciente> getFila() {
        // Retorna a Lista completa
        return fila;
    }
}
