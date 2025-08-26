package br.com.coti.agenda.entities;

import java.time.LocalDate;
import java.util.UUID;

import br.com.coti.agenda.enums.Prioridade;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Tarefa {

	private UUID id;
	private String nome;
	private LocalDate data;
	private Prioridade prioridade;
	private Boolean finalizado;
	private Categoria categoria;

}
