package br.com.pi.teresina.cine.modelo;

// Generated 26/05/2014 22:06:43 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Cinema generated by hbm2java
 */
@Entity
@Table(name = "cinema", catalog = "cine", uniqueConstraints = @UniqueConstraint(columnNames = "login"))
public class Cinema implements java.io.Serializable {

	private Integer id;
	private String login;
	private String senha;
	private Cadastrocinema cadastrocinema;
	private Set filmes = new HashSet(0);

	public Cinema() {
	}

	public Cinema(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Cinema(String login, String senha, Cadastrocinema cadastrocinema,
			Set filmes) {
		this.login = login;
		this.senha = senha;
		this.cadastrocinema = cadastrocinema;
		this.filmes = filmes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "login", unique = true, nullable = false, length = 45)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "senha", nullable = false)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Cadastrocinema getCadastrocinema() {
		return this.cadastrocinema;
	}

	public void setCadastrocinema(Cadastrocinema cadastrocinema) {
		this.cadastrocinema = cadastrocinema;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Set getFilmes() {
		return this.filmes;
	}

	public void setFilmes(Set filmes) {
		this.filmes = filmes;
	}

}
