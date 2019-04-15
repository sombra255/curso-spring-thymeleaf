package br.com.fabricio.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fabricio.thymeleaf.dao.CargoDao;
import br.com.fabricio.thymeleaf.domain.Cargo;

@Service
@Transactional(readOnly = true)
public class CargoServiceImpl implements CargoService {
	
	@Autowired
	private CargoDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Cargo buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Cargo> buscarTodos() {
		return dao.findAll();
	}

}
