package controller;

import br.org.Kay_Almeida.pilhastring.*;

public class HistoricoController {

    public void inserirEndereco(Pilha historico, String endereco) throws IllegalArgumentException {
        if (endereco.startsWith("http://") && endereco.matches("http://www\\..+\\..+")) {
            historico.push(endereco);
        } else {
            throw new IllegalArgumentException("Endereço inválido.");
        }
    }

    public String consultarUltimoEndereco(Pilha historico) throws Exception {
        if (historico.isEmpty()) {
            throw new Exception("Histórico vazio.");
        }
        return historico.top();
    }

    public void removerUltimoEndereco(Pilha historico) throws Exception {
        if (historico.isEmpty()) {
            throw new Exception("Histórico vazio.");
        }
        historico.pop();
    }
}
