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
                String pesquisa = "";
                boolean resultado;
                String produtoPesquisado = "";
                pesquisa = (JOptionPane.showInputDialog(null, "Digite qual produto você procura"));
                produtoPesquisado = String.valueOf(produtoEstoque.indexOf(pesquisa));
                resultado = produtoEstoque.contains(pesquisa);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "Existem " + qtdEstoque.get(Integer.parseInt(produtoPesquisado)) + " " + pesquisa);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Não existe "+ pesquisa);

                }

            }
            else if(opcaoEscolhida == 4) {
                Integer pesquisa = 0;
                boolean resultado;
                Integer botarEstoque = 0;
                pesquisa = Integer.valueOf((JOptionPane.showInputDialog(null, "Digite o código do produto que você procura")));
                resultado = sequencia.contains(pesquisa);
                Integer estoqueAntigo = qtdEstoque.get(pesquisa);
                if (resultado == true) {
                    botarEstoque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos você quer adicionar ao estoque: "));
                    Integer somaEstoque = (estoqueAntigo + botarEstoque);
                    qtdEstoque.set(pesquisa, somaEstoque);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Não existe "+ produtoEstoque.get(pesquisa));

                }
                }

            else if(opcaoEscolhida == 5) {
                Integer pesquisa = 0;
                boolean resultado;
                Integer botarEstoque = 0;
                pesquisa = Integer.valueOf((JOptionPane.showInputDialog(null, "Digite o código do produto que você procura")));
                resultado = sequencia.contains(pesquisa);
                Integer estoqueAntigo = qtdEstoque.get(pesquisa);
                if (resultado == true) {
                    botarEstoque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos você vendeu: "));
                    Integer somaEstoque = (estoqueAntigo - botarEstoque);
                    qtdEstoque.set(pesquisa, somaEstoque);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Não existe "+ produtoEstoque.get(pesquisa));

                }
            }
            else if(opcaoEscolhida == 6) {
                int excluirCodigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto a excluir:"));
                for (int i = 0; i < sequencia.size(); i++) {
                    if (sequencia.get(i) == excluirCodigo) {
                        produtoEstoque.remove(i);
                        valorEstoque.remove(i);
                        sequencia.remove(i);
                        qtdEstoque.remove(i);
                        JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
                        break;
                    }
                }
            }
            else if(opcaoEscolhida == 7) {

            }
            else if(opcaoEscolhida == 8)
            {
                double totalEstoque = 0;
                for (int i = 0; i < valorEstoque.size(); i++) {
                    totalEstoque += valorEstoque.get(i) * qtdEstoque.get(i);
                }
                JOptionPane.showMessageDialog(null, "Valor total do estoque: R$" + totalEstoque);
}

            else {

            }
        } while (opcaoEscolhida != 9);

    }
}
