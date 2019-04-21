package br.gov.ba.pm.ge.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tmatricula1")
public class MatriculaNova implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "CodMatricula1")
	private Integer codMatricula1;
	@Column(name = "CodTurma")
	private String codTurma;
	@Column(name = "DataMatricula")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataMatricula;
	@Column(name = "Ano")
	private Integer ano;
	@Column(name = "Turno")
	private Character turno;
	@Column(name = "MotivoCancelamento")
	private String motivoCancelamento;
	@Column(name = "TransferenciaData")
	@Temporal(TemporalType.TIMESTAMP)
	private Date transferenciaData;
	@Column(name = "CodSerie")
	private String codSerie;
	@Column(name = "DescSerie")
	private String descSerie;
	@Column(name = "Situacao")
	private String situacao;
	@Column(name = "Quant")
	private Integer quant;
	@Column(name = "Numero")
	private Integer numero;
	@JoinColumn(name = "CodAluno", referencedColumnName = "CodAluno")
	@ManyToOne
	private Aluno codAluno;
	public MatriculaNova() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCodMatricula1() {
		return codMatricula1;
	}
	public void setCodMatricula1(Integer codMatricula1) {
		this.codMatricula1 = codMatricula1;
	}
	public String getCodTurma() {
		return codTurma;
	}
	public void setCodTurma(String codTurma) {
		this.codTurma = codTurma;
	}
	public Date getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Character getTurno() {
		return turno;
	}
	public void setTurno(Character turno) {
		this.turno = turno;
	}
	public String getMotivoCancelamento() {
		return motivoCancelamento;
	}
	public void setMotivoCancelamento(String motivoCancelamento) {
		this.motivoCancelamento = motivoCancelamento;
	}
	public Date getTransferenciaData() {
		return transferenciaData;
	}
	public void setTransferenciaData(Date transferenciaData) {
		this.transferenciaData = transferenciaData;
	}
	public String getCodSerie() {
		return codSerie;
	}
	public void setCodSerie(String codSerie) {
		this.codSerie = codSerie;
	}
	public String getDescSerie() {
		return descSerie;
	}
	public void setDescSerie(String descSerie) {
		this.descSerie = descSerie;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Integer getQuant() {
		return quant;
	}
	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Aluno getCodAluno() {
		return codAluno;
	}
	public void setCodAluno(Aluno codAluno) {
		this.codAluno = codAluno;
	}
	
	
}
