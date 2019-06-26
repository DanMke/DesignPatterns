package component;

public class Pedido {
	private String produto;
	private String cliente;
	private String enderecoDeEntrega;

	public Pedido(String produto, String cliente, String enderecoDeEntrega) {
		this.produto = produto;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public String getProduto() {
		return produto;
	}

	public String getCliente() {
		return cliente;
	}

	public String getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}
}
