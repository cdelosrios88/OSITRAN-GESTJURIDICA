package com.pe.ositran.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pe.ositran.dao.DistritoDao;
import com.pe.ositran.model.Distrito;
import com.pe.ositran.service.DistritoService;

@Service("distritoService")
@Transactional(propagation = Propagation.SUPPORTS)
public class DistritoServiceImpl implements DistritoService {
	
	@Autowired
	DistritoDao distritoDao;
	
	public List<Distrito> getListAll() {
		return distritoDao.list();
	}

}
