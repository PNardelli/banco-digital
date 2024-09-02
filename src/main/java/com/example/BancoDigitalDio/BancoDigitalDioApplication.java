package com.example.BancoDigitalDio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BancoDigitalDioApplication {

	public static void main(String[] args){
		SpringApplication.run(BancoDigitalDioApplication.class, args);

		Cliente cliente = new Cliente();
		cliente.setNome("Nardelli");
		cliente.setCpf("12345678900");

		Conta cc = new ContaCorrente(cliente);

		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(250);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
