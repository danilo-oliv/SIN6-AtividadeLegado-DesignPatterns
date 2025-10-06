package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.strategy.INotificacaoStrategy;


import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    private INotificacaoStrategy strategy;

    public void enviarNotificacoes(Pedido pedido) {
        this.strategy.notificar(pedido);
    }

    public void setStrategy(INotificacaoStrategy strategy){
        this.strategy = strategy;
    }


}
