package projeto;



public class ItemUnidade extends Item {

	private int unidade;

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public ItemUnidade(int id, String nome, String categoria, int unidade, String mercado, double preco) {
		super(id,nome,categoria,mercado,preco);

		if (unidade < 0) {
			throw new IllegalArgumentException(
					"Erro no cadastro do item: valor de unidade nao pode ser menor que zero.");
		}

		this.unidade = unidade;
		this.mapaDePrecos.put(mercado, preco);
	}

	@Override
	public String toString() {
		return this.id + ". " + this.nome + " ," + this.categoria + ", Preco: " + "<" + super.precos() + ">";
	}

}
