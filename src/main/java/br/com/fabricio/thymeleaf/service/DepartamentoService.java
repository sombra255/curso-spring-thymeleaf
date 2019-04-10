package br.com.fabricio.thymeleaf.service;

import java.util.List;

import br.com.fabricio.thymeleaf.domain.Departamento;

public interface DepartamentoService {

	public void salvar(Departamento departamento);

	public void editar(Departamento departamento);

	public void excluir(Long id);

	public Departamento buscarPorId(Long id);

	public List<Departamento> buscarTodos();

}
