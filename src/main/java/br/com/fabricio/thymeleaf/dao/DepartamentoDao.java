package br.com.fabricio.thymeleaf.dao;

import java.util.List;

import br.com.fabricio.thymeleaf.domain.Departamento;

public interface DepartamentoDao {

	public void save(Departamento departamento);

	public void update(Departamento departamento);

	public void delete(Long id);

	public Departamento findById(Long id);

	public List<Departamento> findAll();

}
