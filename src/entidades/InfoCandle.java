package entidades;

import java.io.Serializable;
import java.time.LocalDate;

import grafico.Candle;

public class InfoCandle implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nomeDoPapel;


	private LocalDate data;

	private Double abertura;

	
	private Double fechamento;

	
	private Double maxima;


	private Double minima;


	private Double volume;

	private Double precoMedia8;

	private Double precoMedia20;


	private Double precoMedia200;

	private Double volumeMedia20;

	public InfoCandle() {

	}
	public InfoCandle(Candle candle, Double precoMedia8, Double precoMedia20, Double precoMedia200,
			Double volumeMedia20) {

		this.precoMedia8 = precoMedia8;
		this.precoMedia20 = precoMedia20;
		this.precoMedia200 = precoMedia200;
		this.volumeMedia20 = volumeMedia20;
		this.nomeDoPapel = candle.getPapel();
//		this.abertura = candle.;
//		this.fechamento = candle.fechamento;
//		this.maxima = candle.maxima;
//		this.minima = candle.minima;
//		this.volume = candle.volume;
//		this.data = candle.data;
	}

	/*
	 * public void setInfoCandlePK(InfoCandlePK infoCandlePK) { this.infoCandlePK =
	 * infoCandlePK; }
	 * 
	 * public InfoCandlePK getInfoCandlePK() { return infoCandlePK; }
	 */

	public void setPrecoMedia8(Double precoMedia8) {
		this.precoMedia8 = precoMedia8;
	}

	public void setPrecoMedia20(Double precoMedia20) {
		this.precoMedia20 = precoMedia20;
	}

	public void setPrecoMedia200(Double precoMedia200) {
		this.precoMedia200 = precoMedia200;
	}

	public void setVolumeMedia20(Double volumeMedia20) {
		this.volumeMedia20 = volumeMedia20;
	}

	public Double getPrecoMedia8() {
		return precoMedia8;
	}

	public Double getPrecoMedia20() {
		return precoMedia20;
	}

	public Double getPrecoMedia200() {
		return precoMedia200;
	}

	public Double getVolumeMedia20() {
		return volumeMedia20;
	}

	public String getNomeDoPapel() {
		return nomeDoPapel;
	}

	public LocalDate getData() {
		return data;
	}

	public Double getAbertura() {
		return abertura;
	}

	public Double getFechamento() {
		return fechamento;
	}

	public Double getMaxima() {
		return maxima;
	}

	public Double getMinima() {
		return minima;
	}

	public Double getVolume() {
		return volume;
	}

}