package view;

import controller.HistoricoController;
import br.org.Kay_Almeida.pilhastring.*;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        HistoricoController historicoController = new HistoricoController();
        Pilha historico = new Pilha();

        boolean continuar = true;

        while (continuar) {
            String opcao = JOptionPane.showInputDialog("Escolha uma opção:\n"
                    + "1. Inserir novo endereço\n"
                    + "2. Consultar último endereço\n"
                    + "3. Remover último endereço\n"
                    + "4. Sair");

            try {
                switch (opcao) {
                    case "1":
                        String endereco = JOptionPane.showInputDialog("Digite o novo endereço:");
                        historicoController.inserirEndereco(historico, endereco);
                        break;
                    case "2":
                        String ultimoEndereco = historicoController.consultarUltimoEndereco(historico);
                        JOptionPane.showMessageDialog(null, "Último endereço visitado: " + ultimoEndereco);
                        break;
                    case "3":
                        historicoController.removerUltimoEndereco(historico);
                        JOptionPane.showMessageDialog(null, "Último endereço removido com sucesso.");
                        break;
                    case "4":
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
    }
}
