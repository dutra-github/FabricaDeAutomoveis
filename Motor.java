package br.com.aula.poo;

public class Motor {

	private double cilindrada;
	private int potencia;
	private int qtdCilindros;
	private String tipoCombustivel;
	private double torque;
	private int qtdValvulas;

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getQtdCilindros() {
		return qtdCilindros;
	}

	public void setQtdCilindros(int qtdCilindros) {
		this.qtdCilindros = qtdCilindros;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getTorque() {
		return torque;
	}

	public void setTorque(double torque) {
		this.torque = torque;
	}

	public int getQtdValvulas() {
		return qtdValvulas;
	}

	public void setQtdValvulas(int qtdValvulas) {
		this.qtdValvulas = qtdValvulas;
	}

}
