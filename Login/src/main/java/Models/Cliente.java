package Models;

import java.util.List;


public class Cliente {

	
	private long idcliente;

	
	private String nombre;
	private String apellidos;
	private String direccion;
	private String correo;


	private long telefono;
	
    private List<Pedido> pedidos;
	
	
	public Cliente(long idcliente, String nombre, long telefono) {
		super();
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public long getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(long idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
}
