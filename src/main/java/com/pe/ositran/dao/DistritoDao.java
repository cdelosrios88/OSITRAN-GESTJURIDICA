package com.pe.ositran.dao;

import java.util.List;

import com.pe.ositran.model.Distrito;

public interface DistritoDao {
	
	public void save(Distrito p);
    
    public List<Distrito> list();

}
