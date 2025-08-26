package br.com.coti.agenda.repositories.interfaces;

import java.util.List;
import java.util.UUID;

public interface CrudRepository<T extends Object> {

	void post(T t);

	List<T> getAll();

	Object getById();

	boolean delete(UUID id);

	boolean update(T t);

}
