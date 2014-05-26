package br.com.pi.teresina.cine.mb;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

@SuppressWarnings("serial")
@ManagedBean(name="loginMB")
@ViewScoped
public class LoginMB implements Serializable {
	
	private String usuario;
	private String senha;
	
	public String redireciona(){
		return "/templates/completo";
		
	}
	
	public void logar(){
		 RequestContext context = RequestContext.getCurrentInstance();
	        FacesMessage message = null;
	        boolean loggedIn = false;
	         
	        if(usuario != null && usuario.equals("admin") && senha != null && senha.equals("admin")) {
	        	loggedIn = true;
	            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bemvindo", usuario);
	        } else {
	        	loggedIn = false;
	            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro de login", "Credenciais inválidas");
	        }
	         
	        FacesContext.getCurrentInstance().addMessage(null, message);
	        context.addCallbackParam("loggedIn", loggedIn);
	    } 
	
//Getters e Setters	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
