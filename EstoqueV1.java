package aula;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Projeto {
    static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Sistema de controle de estoque");
        String produto = "";
        Double valor = 0.00;
        Integer estoque = 0;
        Integer listaCodigo = 0;
        Integer opcaoEscolhida = 0;
        ArrayList<String> produtoEstoque = new ArrayList<>();
        ArrayList<Double> valorEstoque = new ArrayList<>();
        ArrayList<Integer> qtdEstoque = new ArrayList<>();
        ArrayList<Integer> sequencia = new ArrayList<>();
        int codigo = 0;
        do {
            opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Cadastrar novo produto\n" +
                    "2. Listar todos os produtos\n" +
                    "3. Buscar produto por nome\n" +
                    "4. Registrar entrada de estoque (Compra)\n" +
                    "5. Registrar saída de estoque (Venda)\n" +
                    "6. Excluir produto do sistema\n" +
                    "7. Listar produtos com estoque zerado\n" +
                    "8. Calcular valor total do estoque\n" +
                    "9. Sair"));

            if (opcaoEscolhida == 1) {
                produto = JOptionPane.showInputDialog(null, "Insira o nome do produto");
                produtoEstoque.add(produto);
                qtdEstoque.add(estoque);
                sequencia.add(listaCodigo++);
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));
                valorEstoque.add(valor);

            }

            else if (opcaoEscolhida == 2) {
                String listaCompleta = "";
                for (int i = 0; i < produtoEstoque.size(); i++) {
                listaCompleta += (sequencia.get(i) + " - " + produtoEstoque.get(i) + " por R$ " + valorEstoque.get(i) + " há " + qtdEstoque.get(i) + " em estoque\n");

            }
                JOptionPane.showMessageDialog(null, listaCompleta);
        }
            else if(opcaoEscolhida == 3) {

            }
            else if(opcaoEscolhida == 4) {

            }
            else if(opcaoEscolhida == 5) {

            }
            else if(opcaoEscolhida == 6) {

            }
            else if(opcaoEscolhida == 7) {

            }
            else if(opcaoEscolhida == 8) {

            }
            else {

            }
        } while (opcaoEscolhida != 9);

    }
}
