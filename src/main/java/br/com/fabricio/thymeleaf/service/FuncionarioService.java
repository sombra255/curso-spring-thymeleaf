package br.com.fabricio.thymeleaf.service;

import java.util.List;

import br.com.fabricio.thymeleaf.domain.Funcionario;

public interface FuncionarioService {
	
	public void salvar(Funcionario departamento);

	public void editar(Funcionario departamento);

	public void excluir(Long id);

	public Funcionario buscarPorId(Long id);

	public List<Funcionario> buscarTodos();

}
