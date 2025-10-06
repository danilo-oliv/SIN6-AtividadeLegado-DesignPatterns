package com.exemplo.notificacao.strategy;

import com.exemplo.notificacao.model.Pedido;

public class PushStrategy implements INotificacaoStrategy {

    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Enviando push notification para " + pedido.getCliente());
    }
    
}
