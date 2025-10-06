package com.exemplo.notificacao.strategy;

import com.exemplo.notificacao.model.Pedido;

public interface INotificacaoStrategy {
    public void notificar(Pedido pedido);
}
