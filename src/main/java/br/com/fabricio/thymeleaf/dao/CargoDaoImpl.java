package br.com.fabricio.thymeleaf.dao;

import org.springframework.stereotype.Repository;

import br.com.fabricio.thymeleaf.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
