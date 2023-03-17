package com.duoctor.duoctor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Esse campo é obrigatório")
	@Size(min = 3, max = 155, message = "maximo 155 caracteres")
	private String nome;

	@NotBlank(message = "Esse campo é obrigatório")
	private double preco;

	@NotBlank(message = "Esse campo é obrigatório")
	private int quantidade;

	@NotBlank(message = "Esse campo é obrigatório")
	@Size(min = 10, max = 1000, message = "Minimo 10 caracteres e máximo de 1000 caracteres")
	private String descricao;
	
	@ManyToOne
	@JsonIgnoreProperties("Produtos")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("Produtos")
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
