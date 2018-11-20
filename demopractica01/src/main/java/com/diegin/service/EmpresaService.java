package com.diegin.service;

import java.util.List;
import java.util.Optional;

import com.diegin.modell.Empresa;

public interface EmpresaService {
	
	Empresa findById(long id);
	
	Optional<Empresa> findByRazon_social(String razon_social);
	
	void saveEmp(Empresa emp);
	
	void updateEmp(Empresa emp);
	
	void deleteEmpById(long id);
	
	List<Empresa> findAllEmps();
	
	void deleteAllEmps();
	
	public boolean isEmpExist(Empresa emp);

}