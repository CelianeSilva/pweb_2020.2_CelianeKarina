package br.com.agroPopShopCeliane.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_clientes")

public class Cliente {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	
	private String codigo;
	private String nome;
	private String genero;
	private String endereço;
	private String email;
	private String cep;
	private String salariobruto1968051082;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getSalariobruto1968051082() {
		return salariobruto1968051082;
	}
	public void setSalariobruto1968051082(String salariobruto1968051082) {
		this.salariobruto1968051082 = salariobruto1968051082;
	}
	
	
}
