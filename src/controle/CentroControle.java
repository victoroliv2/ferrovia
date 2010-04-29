package controle;

import java.util.HashMap;

import malha.*;
import interfacesFerrovia.ControleFerrovia;
import interfacesFerrovia.DefsGlobais;

public class CentroControle implements DefsGlobais {
	private Malha malha;
	private TratadorDeEventos tratadorEventos;
	private ControleFerrovia controleFerrovia;
	private Integer tic;
	
	
	// Composicao
	public Boolean mudarVelocidadeComposicao(String idComposicao, Float velocidade, Boolean modo) {
		return null;
	}

	public Boolean consultarEstadoAtualComposicao(String idComposicao) {
		return null;
	}
	
	public String[] consultarItinerarioComposicao(String idComposicao) {
		return null;
	}
	
	public Float posicaoPrevistaComposicao(String idComposicao) {
		return null;
	}

	public void removerComposicaoMalha(String idComposicao) {
		
	}
	
	
	// Trecho
	public HashMap consultarEstadoAtualTrecho(String idTrecho){
		return null;
	}
	
	public void mudarSentidoTrecho(String idTrecho, Boolean sentido) {
		
	}
	
	public Composicao[] consultarComposicoesTrecho(String idTrecho) {
		return null;
	}
	
	
	// Chave
	public Float mudarEstadoChave(String idChave, String idTrechoA, String idTrchoB) {
		return null;
	}

	public HashMap consultarEstadoAtualChave(String idChave) {
		return null;
	}
	
	public Integer consultarTempoMudancaChave(String idChave) {
		return null;
	}
	
	// 
	public void verificarEstadoGlobalMalha() {
		
	}

	// get e set
	public Malha getMalha() {
		return malha;
	}

	public void setMalha(Malha malha) {
		this.malha = malha;
	}

	public TratadorDeEventos getTratadorEventos() {
		return tratadorEventos;
	}

	public void setTratadorEventos(TratadorDeEventos tratadorEventos) {
		this.tratadorEventos = tratadorEventos;
	}

	public ControleFerrovia getControleFerrovia() {
		return controleFerrovia;
	}

	public void setControleFerrovia(ControleFerrovia controleFerrovia) {
		this.controleFerrovia = controleFerrovia;
	}

	public Integer getTic() {
		return tic;
	}

	public void setTic(Integer tic) {
		this.tic = tic;
	}
	
}
