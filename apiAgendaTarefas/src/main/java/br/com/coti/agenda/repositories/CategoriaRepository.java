package br.com.coti.agenda.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.coti.agenda.entities.Categoria;
import br.com.coti.agenda.repositories.interfaces.CrudRepository;

public class CategoriaRepository implements CrudRepository<Categoria> {

	@Override
	public void post(Categoria categoria) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Categoria> getAll() {
		// TODO Implementar a consulta de categorias no banco de dados
		return new ArrayList<Categoria>();
	}

	@Override
	public Categoria getById() {
		// TODO Implementar a buscar de uma Categoria pelo id
		return new Categoria();
	}

	@Override
	public boolean delete(UUID id) {
		// TODO Implementar a exclusão de uma categoria do banco de dados
		return true;
	}

	@Override
	public boolean update(Categoria categoria) {
		// TODO Implementar a atualização de uma categoria no banco de dados
		return true;
	}

}
