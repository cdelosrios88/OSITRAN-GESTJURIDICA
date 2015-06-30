package com.pe.ositran.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="menuController")
@SessionScoped
public class MenuController implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public String irReporteEstado(){
		return "reporteEstado";
	}
	
	public String irReporteFecha(){
		return "reporteFecha";
	}
	
	public String irReporteFechaImplementada(){
		return "reporteFechaImplementada";
	}
	
	public String irReporteAreaInvoclucrada(){
		return "reporteAreaInvoclucrada";
	}
	
	public String irReportGerenciaAnioSitu(){
		return "reportGerenciaAnioSitu";
	}
	
	public String irReportGerenciaAnio(){
		return "reportSupervisorAnio";
	}
	
	public String irReportRecoDetalle(){
		return "reportRecoDetalle";
	}

}
