package br.com.aula.poo;

import javax.swing.JOptionPane;

public class FabricaDeAutomoveis {

	public static void main(String[] args) {

		int qtdCarros = Integer.parseInt(JOptionPane.showInputDialog("Quantos Carros deseja cadastrar?"));

		Automovel[] carros = new Automovel[qtdCarros];

		for (int i = 0; i < carros.length; i++) {
			Automovel c1 = new Automovel();
			int qtdPortas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de portas do carro"));
			c1.setQtdPortas(qtdPortas);
			String cor = JOptionPane.showInputDialog("Informe a cor do carro");
			c1.setCor(cor);

			Motor m1 = new Motor();
			double cilindrada = Double.parseDouble(JOptionPane.showInputDialog("Informe a cilindrada do motor"));
			m1.setCilindrada(cilindrada);
			int potencia = Integer.parseInt(JOptionPane.showInputDialog("Informe a potência do motor"));
			m1.setPotencia(potencia);
			int qtdCilindros = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtd de cilindros do motor"));
			m1.setQtdCilindros(qtdCilindros);
			String tipoCombustivel = JOptionPane.showInputDialog("Informe o tipo de combustível do motor");
			m1.setTipoCombustivel(tipoCombustivel);
			double torque = Double.parseDouble(JOptionPane.showInputDialog("Informe o torque do motor"));
			m1.setTorque(torque);
			int qtdValvulas = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtd de válvulas do motor"));
			m1.setQtdValvulas(qtdValvulas);

			c1.setMotor(m1);

			Pneu p1 = new Pneu();
			String marca = JOptionPane.showInputDialog("Informe a marca do pneu");
			p1.setMarca(marca);
			double largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do pneu"));
			p1.setLargura(largura);
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do pneu"));
			p1.setAltura(altura);
			String perfil = JOptionPane.showInputDialog("Informe o perfil do pneu");
			p1.setPerfil(perfil);
			int numeroAro = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do aro do pneu"));
			p1.setNumeroAro(numeroAro);
			String tipo = JOptionPane.showInputDialog("Informe o tipo do pneu");
			p1.setTipo(tipo);

			c1.setPneu(p1);
			
			carros[i] = c1;
		}

	}
}