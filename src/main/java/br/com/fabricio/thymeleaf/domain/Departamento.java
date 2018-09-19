package br.com.fabricio.thymeleaf.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "departamentos")
public class Departamento extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> lsCargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getLsCargos() {
		return lsCargos;
	}

	public void setLsCargos(List<Cargo> lsCargos) {
		this.lsCargos = lsCargos;
	}

}
