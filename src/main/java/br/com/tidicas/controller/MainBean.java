package br.com.tidicas.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.tidicas.bean.Index;
import br.com.tidicas.bean.impl.IndexImpl;

/**
 * Classe controller principal
 * @author Evaldo Junior
 *
 */
@ManagedBean
@ViewScoped
public class MainBean {
	
	public final String pagina = "Página Inicial";
	
	public Index getIndex() {
		Index index = new IndexImpl();
		index.setMensagem(pagina);
		return index;
	}

}