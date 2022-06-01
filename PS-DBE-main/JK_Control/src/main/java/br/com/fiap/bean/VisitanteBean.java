package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.file.UploadedFile;

import br.com.fiap.dao.VisitanteDao;
import br.com.fiap.model.Visitante;
import br.com.fiap.service.UploadService;

@Named
@RequestScoped
public class VisitanteBean {
	
	private Visitante visitante = new Visitante();
	
	private VisitanteDao dao = new VisitanteDao();
	
	private UploadedFile imagem;
	
	public String save() {
		System.out.println(this.visitante);
		visitante.setCaminhoImagem( UploadService.write(imagem, "visitantes"));
		dao.create(visitante);
		
		
		FacesContext
			.getCurrentInstance()
			.addMessage(null, new FacesMessage("visitante cadastrado com sucesso"));
		
		return "visitantes";
	}
	
	
	public List<Visitante> getAll(){
		return dao.listAll();
	}
	
	
	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}
	
	public UploadedFile getImagem() {
		return imagem;
	}

	public void setImagem(UploadedFile imagem) {
		this.imagem = imagem;
	}


}
