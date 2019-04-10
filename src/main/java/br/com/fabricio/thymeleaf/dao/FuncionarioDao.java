package br.com.fabricio.thymeleaf.dao;

import java.util.List;

import br.com.fabricio.thymeleaf.domain.Funcionario;

public interface FuncionarioDao {

	public void save(Funcionario funcionario);
	
	public void update(Funcionario funcionario);
	
	public void delete(Long id);
	
	public Funcionario findById(Long id);
	
	public List<Funcionario> findAll();
}
