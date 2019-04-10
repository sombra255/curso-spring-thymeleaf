package br.com.fabricio.thymeleaf.dao;

import org.springframework.stereotype.Repository;

import br.com.fabricio.thymeleaf.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
