package br.com.pi.teresina.cine.modelo;
// default package
// Generated 25/05/2014 19:02:09 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuario", catalog = "cine", uniqueConstraints = @UniqueConstraint(columnNames = "usuario_login"))

@NamedQueries(value = { @NamedQuery(name = "Usuario.recuperarPorLoginSenha", 
	query = "select * from usuario u where u.usuario_login = :login"
			+ "and u.usuario_senha = :senha") })
public class Usuario implements java.io.Serializable {

	private Integer idusuario;
	private Cadastro cadastro;
	private String usuarioLogin;
	private String usuarioSenha;
	private Set<ControleAcesso> controleAcessos = new HashSet<ControleAcesso>(0);
	private Extras extras;
	private Set<Bilhete> bilhetes = new HashSet<Bilhete>(0);

	public Usuario() {
	}

	public Usuario(Cadastro cadastro, String usuarioLogin, String usuarioSenha) {
		this.cadastro = cadastro;
		this.usuarioLogin = usuarioLogin;
		this.usuarioSenha = usuarioSenha;
	}

	public Usuario(Cadastro cadastro, String usuarioLogin, String usuarioSenha,
			Set<ControleAcesso> controleAcessos, Extras extras,
			Set<Bilhete> bilhetes) {
		this.cadastro = cadastro;
		this.usuarioLogin = usuarioLogin;
		this.usuarioSenha = usuarioSenha;
		this.controleAcessos = controleAcessos;
		this.extras = extras;
		this.bilhetes = bilhetes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idusuario", unique = true, nullable = false)
	public Integer getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcadastro", nullable = false)
	public Cadastro getCadastro() {
		return this.cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	@Column(name = "usuario_login", unique = true, nullable = false, length = 45)
	public String getUsuarioLogin() {
		return this.usuarioLogin;
	}

	public void setUsuarioLogin(String usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}

	@Column(name = "usuario_senha", nullable = false)
	public String getUsuarioSenha() {
		return this.usuarioSenha;
	}

	public void setUsuarioSenha(String usuarioSenha) {
		this.usuarioSenha = usuarioSenha;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<ControleAcesso> getControleAcessos() {
		return this.controleAcessos;
	}

	public void setControleAcessos(Set<ControleAcesso> controleAcessos) {
		this.controleAcessos = controleAcessos;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Extras getExtras() {
		return this.extras;
	}

	public void setExtras(Extras extras) {
		this.extras = extras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Bilhete> getBilhetes() {
		return this.bilhetes;
	}

	public void setBilhetes(Set<Bilhete> bilhetes) {
		this.bilhetes = bilhetes;
	}

}
