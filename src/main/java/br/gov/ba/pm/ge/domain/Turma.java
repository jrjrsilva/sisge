package br.gov.ba.pm.ge.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tturma")
public class Turma implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "CodTurma")
	private String codTurma;
	@Column(name = "CodSerie")
	private String codSerie;
	@Column(name = "TurmaD")
	private String turmaD;
	@Column(name = "Descricao")
	private String descricao;
	@Column(name = "Turma")
	private String turma;
	@Column(name = "Ano")
	private Integer ano;
	@Column(name = "Pel")
	private String pel;
	@JsonIgnore
	@OneToMany(mappedBy = "codTurma")
	private List<Nota> notaList;

	public Turma() {
	}

	public String getCodTurma() {
		return codTurma;
	}

	public void setCodTurma(String codTurma) {
		this.codTurma = codTurma;
	}

	public String getCodSerie() {
		return codSerie;
	}

	public void setCodSerie(String codSerie) {
		this.codSerie = codSerie;
	}

	public String getTurmaD() {
		return turmaD;
	}

	public void setTurmaD(String turmaD) {
		this.turmaD = turmaD;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getPel() {
		return pel;
	}

	public void setPel(String pel) {
		this.pel = pel;
	}

	public List<Nota> getNotaList() {
		return notaList;
	}

	public void setNotaList(List<Nota> notaList) {
		this.notaList = notaList;
	}

	
}
