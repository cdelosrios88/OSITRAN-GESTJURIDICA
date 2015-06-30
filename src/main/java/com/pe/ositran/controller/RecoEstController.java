package com.pe.ositran.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.pe.ositran.model.Distrito;
import com.pe.ositran.service.DistritoService;

@ManagedBean(name = "recoEstController")
@SessionScoped
public class RecoEstController implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date dtAnyDay;
	private Integer idEmpresa;
	private String idIncidencia;
	private List<Distrito> lstDistrito;
	
	@ManagedProperty("#{distritoService}")
	private DistritoService distritoService;
	
	@PostConstruct
    public void methodInvokeOncedOnPageLoad() {		
		//lstDistrito = distritoService.getListAll();
	}

	public void init() {
		if (!FacesContext.getCurrentInstance().isPostback()) {
			idEmpresa = null;
			idIncidencia = null;
			dtAnyDay = null;
		}		
	}
	
	public void search(){
		System.out.println();
		lstDistrito = distritoService.getListAll();
		System.out.println("size:" + lstDistrito.size());
	}

	public Date getDtAnyDay() {
		return dtAnyDay;
	}

	public void setDtAnyDay(Date dtAnyDay) {
		this.dtAnyDay = dtAnyDay;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getIdIncidencia() {
		return idIncidencia;
	}

	public void setIdIncidencia(String idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

	public List<Distrito> getLstDistrito() {
		return lstDistrito;
	}

	public void setLstDistrito(List<Distrito> lstDistrito) {
		this.lstDistrito = lstDistrito;
	}

	public DistritoService getDistritoService() {
		return distritoService;
	}

	public void setDistritoService(DistritoService distritoService) {
		this.distritoService = distritoService;
	}
}