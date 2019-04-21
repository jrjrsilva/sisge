package br.gov.ba.pm.ge.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tmatricula")
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CodMatricula")
    private Integer codMatricula;
    @Column(name = "Ano")
    private Integer ano;
    @Column(name = "CodSerie")
    private String codSerie;
    @Column(name = "Situacao")
    private String situacao;
    @JoinColumn(name = "CodAluno", referencedColumnName = "CodAluno")
    @ManyToOne(optional = false)
    private Aluno codAluno;

    public Matricula() {
    }

	public Integer getCodMatricula() {
		return codMatricula;
	}

	public void setCodMatricula(Integer codMatricula) {
		this.codMatricula = codMatricula;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCodSerie() {
		return codSerie;
	}

	public void setCodSerie(String codSerie) {
		this.codSerie = codSerie;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Aluno getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(Aluno codAluno) {
		this.codAluno = codAluno;
	}


}
