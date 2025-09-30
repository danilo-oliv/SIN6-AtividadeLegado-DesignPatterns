package com.exemplo.notificacao.strategy;

import com.exemplo.notificacao.model.Pedido;

public class SmsStrategy implements INotificacaoStrategy {

    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Enviando SMS para " + pedido.getCliente());
    }
    
}
