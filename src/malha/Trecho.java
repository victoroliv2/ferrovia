package malha;

import java.util.HashMap;

public class Trecho {
	private String id;
	private Float distanciaExtremidades;
	protected String idChaveA;
	protected String idChaveB;
	public Integer numeroComposicoes;
	
	public void mudarSentido(Boolean sentido){
		
	}

	public HashMap consultarEstadoAtual() {
		return null;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Float getDistanciaExtremidades() {
		return distanciaExtremidades;
	}

	public void setDistanciaExtremidades(Float distanciaExtremidades) {
		this.distanciaExtremidades = distanciaExtremidades;
	}

	public String getIdChaveA() {
		return idChaveA;
	}

	public void setIdChaveA(String idChaveA) {
		this.idChaveA = idChaveA;
	}

	public String getIdChaveB() {
		return idChaveB;
	}

	public void setIdChaveB(String idChaveB) {
		this.idChaveB = idChaveB;
	}

	public Integer getNumeroComposicoes() {
		return numeroComposicoes;
	}

	public void setNumeroComposicoes(Integer numeroComposicoes) {
		this.numeroComposicoes = numeroComposicoes;
	}
	
	
}
