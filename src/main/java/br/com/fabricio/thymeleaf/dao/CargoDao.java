package br.com.fabricio.thymeleaf.dao;

import java.util.List;

import br.com.fabricio.thymeleaf.domain.Cargo;

public interface CargoDao {
	
	public void save(Cargo cargo);
	
	public void update(Cargo cargo);
	
	public void delete(Long id);
	
	public Cargo findById(Long id);
	
	public List<Cargo> findAll();

}
