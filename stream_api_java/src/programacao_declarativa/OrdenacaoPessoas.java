package programacao_declarativa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class OrdenacaoPessoas {

	private List<Pessoa> pessoaList;

	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}

	/*
	 * public List<Pessoa> ordenarPorAltura() { List<Pessoa> pessoasPorAltura = new
	 * ArrayList<>(pessoaList); if (!pessoaList.isEmpty()) {
	 * Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); return
	 * pessoasPorAltura; } else { throw new RuntimeException("A lista está vazia!");
	 * } }
	 */
	/*
	 * public int compare(Pessoa p1, Pessoa p2) { return
	 * Double.compare(p1.getAltura(), p2.getAltura()); }
	 */
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		if (!pessoaList.isEmpty()) {
			//pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
			//usando method reference
			pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
			return pessoasPorAltura;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Estou na Ordenacao de pessoas!");
		// Criando uma instância da classe OrdenacaoPessoas
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

		// Adicionando pessoas à lista
		ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
		ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
		ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
		ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

		System.out.println(ordenacaoPessoas.ordenarPorAltura());
	}
}
