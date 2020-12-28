package br.com.aula.poo;

public class Automovel {

	private int qtdPortas;
	private String cor;
	private Motor motor;
	private Pneu pneu;

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public int getQtdPortas() {
		return this.qtdPortas;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Motor getMotor() {
		return motor;
	}

	public Pneu getPneu() {
		return pneu;
	}

	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}
}