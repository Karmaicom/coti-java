package br.com.coti.agenda.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.coti.agenda.entities.Tarefa;
import br.com.coti.agenda.repositories.interfaces.CrudRepository;

public class TarefaRepository implements CrudRepository<Tarefa> {

	@Override
	public void post(Tarefa tarefa) {
		// TODO Implementar o cadastro de uma tarefa no banco de dados
	}

	@Override
	public List<Tarefa> getAll() {
		// TODO Implementar a consulta de tarefas no banco de dados
		return new ArrayList<Tarefa>();
	}

	@Override
	public Tarefa getById() {
		// TODO Implementar a buscar de uma tarefa pelo id
		return new Tarefa();
	}

	@Override
	public boolean delete(UUID id) {
		// TODO Implementar a exclusão de uma tarefa do banco de dados
		return true;
	}

	@Override
	public boolean update(Tarefa terefa) {
		// TODO Implementar a atualização de uma tarefa no banco de dados
		return true;
	}

}
