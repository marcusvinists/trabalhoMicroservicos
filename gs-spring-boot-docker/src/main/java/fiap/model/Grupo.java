package fiap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="TB_GRUPO")
public class Grupo {

	@Id
	@Column(name="RM")
	private Integer rm;
	
	@Column(name="NOME")
	private String nome;
	
	public Integer getRm() {
		return rm;
	}
	public void setRm(Integer rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
