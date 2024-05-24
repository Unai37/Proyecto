package Models;

import java.util.List;

public class Producto {

   
    private Long idproducto;

    private String nombre;

    private List<Pedido> pedidos;

	public Producto(Long idproducto, String nombre, List<Pedido> pedidos) {
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.pedidos = pedidos;
	}

	public Long getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Long idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}