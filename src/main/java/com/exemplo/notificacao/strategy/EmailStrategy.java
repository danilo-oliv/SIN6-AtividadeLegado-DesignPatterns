package com.exemplo.notificacao.strategy;

import com.exemplo.notificacao.model.Pedido;

public class EmailStrategy implements INotificacaoStrategy {

    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Enviando e-mail para " + pedido.getCliente());        
    }
    
}
