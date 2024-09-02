package com.example.BancoDigitalDio;

import org.apache.logging.log4j.message.Message;

public class ErroSaldoException extends Exception{

    public String verificarSaldo(){
        String mensagem = "Saldo insuficiente, favor verificar e tentar novamente";

        return mensagem;
    }

}
