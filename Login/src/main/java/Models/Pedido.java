package Models;



public class Pedido {

    private Long idpedido;

    private Producto producto;

    private Cliente cliente;

    private String notacliente;

    private Tipo tipo;
    
    

	public Pedido(Long idpedido, Producto producto, Cliente cliente, Tipo tipo) {
		super();
		this.idpedido = idpedido;
		this.producto = producto;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public Long getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(Long idpedido) {
		this.idpedido = idpedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNotacliente() {
		return notacliente;
	}

	public void setNotacliente(String notacliente) {
		this.notacliente = notacliente;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

    
}

enum Tipo {
    RECOGER, DOMICILIO, SALA
}
