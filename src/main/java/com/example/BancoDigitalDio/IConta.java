package com.example.BancoDigitalDio;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino) throws ErroSaldoException;

    void imprimirExtrato();
}
