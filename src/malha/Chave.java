package malha;

import java.util.HashMap;

public class Chave extends Trecho {
	private String id;
	private String[] TrechoA;
	private String[] TrechoB;
	private Integer tempoMudanca;
	public Boolean emMudanca;
	public Integer tempoConclusao;
	
	public Float mudarEstado(String idTrechoA, String idTrechoB) {
		return null;
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

	public String[] getTrechoA() {
		return TrechoA;
	}

	public void setTrechoA(String[] trechoA) {
		TrechoA = trechoA;
	}

	public String[] getTrechoB() {
		return TrechoB;
	}

	public void setTrechoB(String[] trechoB) {
		TrechoB = trechoB;
	}

	public Integer getTempoMudanca() {
		return tempoMudanca;
	}

	public void setTempoMudanca(Integer tempoMudanca) {
		this.tempoMudanca = tempoMudanca;
	}

	public Boolean getEmMudanca() {
		return emMudanca;
	}

	public void setEmMudanca(Boolean emMudanca) {
		this.emMudanca = emMudanca;
	}

	public Integer getTempoConclusao() {
		return tempoConclusao;
	}

	public void setTempoConclusao(Integer tempoConclusao) {
		this.tempoConclusao = tempoConclusao;
	}
	
}
