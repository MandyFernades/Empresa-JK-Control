package br.com.fiap.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private Long cpf;
	private Long rg;
	private String nomeDoDigito;
	private LocalDate dataDeCadastro = LocalDate.now();
	private String caminhoImagem;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getNomeDoDigito() {
		return nomeDoDigito;
	}

	public void setNomeDoDigito(String nomeDoDigito) {
		this.nomeDoDigito = nomeDoDigito;
	}

	public LocalDate getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(LocalDate dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}

	@Override
	public String toString() {
		return "Visitante [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
				+ ", rg=" + rg + ", nomeDoDigito=" + nomeDoDigito + ", dataDeCadastro=" + dataDeCadastro
				+ ", caminhoImagem=" + caminhoImagem + "]";
	}

	



	

}
