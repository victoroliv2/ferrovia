package malha;

import java.util.HashMap;

public class Composicao {
	private String id;
	private Integer comprimento;
	private Float aceleracaoMax;
	private Float frenagemMax;
	private Float velocidadeMax;
	private String[] intinerario;
	private Integer instantePartida;
	public String idTrechoAtual;
	public Float posicaoAtual;
	public Float velocidadeAtual;
	public Float aceleracaoAtual;
	public Float frenagemAtual;
	public Boolean emMovimento;
	public Boolean sentidoAtual;
	public Integer tempoPrevistoExecucao;
	
	public void mudarVelocidade(Float velocidade, String modo) {
	
	}
	
	public HashMap consultarEstadoAtual() {
		return null;
	}
	
	public String[] consultarItinerario() {
		return null;
	}	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getComprimento() {
		return comprimento;
	}
	public void setComprimento(Integer comprimento) {
		this.comprimento = comprimento;
	}
	public Float getAceleracaoMax() {
		return aceleracaoMax;
	}
	public void setAceleracaoMax(Float aceleracaoMax) {
		this.aceleracaoMax = aceleracaoMax;
	}
	public Float getFrenagemMax() {
		return frenagemMax;
	}
	public void setFrenagemMax(Float frenagemMax) {
		this.frenagemMax = frenagemMax;
	}
	public Float getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(Float velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public String[] getIntinerario() {
		return intinerario;
	}
	public void setIntinerario(String[] intinerario) {
		this.intinerario = intinerario;
	}
	public Integer getInstantePartida() {
		return instantePartida;
	}
	public void setInstantePartida(Integer instantePartida) {
		this.instantePartida = instantePartida;
	}
	public String getIdTrechoAtual() {
		return idTrechoAtual;
	}
	public void setIdTrechoAtual(String idTrechoAtual) {
		this.idTrechoAtual = idTrechoAtual;
	}
	public Float getPosicaoAtual() {
		return posicaoAtual;
	}
	public void setPosicaoAtual(Float posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}
	public Float getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(Float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public Float getAceleracaoAtual() {
		return aceleracaoAtual;
	}
	public void setAceleracaoAtual(Float aceleracaoAtual) {
		this.aceleracaoAtual = aceleracaoAtual;
	}
	public Float getFrenagemAtual() {
		return frenagemAtual;
	}
	public void setFrenagemAtual(Float frenagemAtual) {
		this.frenagemAtual = frenagemAtual;
	}
	public Boolean getEmMovimento() {
		return emMovimento;
	}
	public void setEmMovimento(Boolean emMovimento) {
		this.emMovimento = emMovimento;
	}
	public Boolean getSentidoAtual() {
		return sentidoAtual;
	}
	public void setSentidoAtual(Boolean sentidoAtual) {
		this.sentidoAtual = sentidoAtual;
	}
	public Integer getTempoPrevistoExecucao() {
		return tempoPrevistoExecucao;
	}
	public void setTempoPrevistoExecucao(Integer tempoPrevistoExecucao) {
		this.tempoPrevistoExecucao = tempoPrevistoExecucao;
	}
	
	
}
