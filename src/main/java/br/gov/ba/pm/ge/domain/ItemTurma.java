package br.gov.ba.pm.ge.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "titemturma")
public class ItemTurma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CodItemturma")
    private Integer codItemturma;
   
    @Column(name = "CodTurma")
    private String codTurma;
    
    @Column(name = "Turma1")
    private String turma1;
    
    @Column(name = "Disciplina1")
    private String disciplina1;
    
    @Column(name = "Abreviatura")
    private String abreviatura;
    @Column(name = "CodSerie")
    private String codSerie;
    @Column(name = "Ano")
    private Integer ano;
    @Column(name = "Diversificada")
    private String diversificada;
    @Column(name = "ImpAta")
    private String impAta;
    @Column(name = "Semestre")
    private String semestre;
    @Column(name = "Peso")
    private String peso;
    
    
    @JoinColumn(name = "CodDisciplina", referencedColumnName = "CodDisciplina")
    @ManyToOne
    private Disciplina codDisciplina;

	public ItemTurma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCodItemturma() {
		return codItemturma;
	}

	public void setCodItemturma(Integer codItemturma) {
		this.codItemturma = codItemturma;
	}

	public String getCodTurma() {
		return codTurma;
	}

	public void setCodTurma(String codTurma) {
		this.codTurma = codTurma;
	}

	public String getTurma1() {
		return turma1;
	}

	public void setTurma1(String turma1) {
		this.turma1 = turma1;
	}

	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getCodSerie() {
		return codSerie;
	}

	public void setCodSerie(String codSerie) {
		this.codSerie = codSerie;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getDiversificada() {
		return diversificada;
	}

	public void setDiversificada(String diversificada) {
		this.diversificada = diversificada;
	}

	public String getImpAta() {
		return impAta;
	}

	public void setImpAta(String impAta) {
		this.impAta = impAta;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public Disciplina getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(Disciplina codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
    
	
    

}
