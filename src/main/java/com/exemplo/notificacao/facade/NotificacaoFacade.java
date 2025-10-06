package com.exemplo.notificacao.facade;

import java.util.List;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.service.NotificacaoService;

import com.exemplo.notificacao.strategy.*;


public class NotificacaoFacade {

    private final NotificacaoService notificacaoService;

    private List<Pedido> pedidos;

    public NotificacaoFacade() {
        this.notificacaoService = new NotificacaoService();
    }

    public NotificacaoFacade(List<Pedido> pedidos) {
        this.notificacaoService = new NotificacaoService();
        this.pedidos = pedidos;
    }

    public void setPedidos(List<Pedido> pedidos){
        this.pedidos = pedidos;
    }

    public void enviarTodos(){
        this.enviarEmails();
        this.enviarPush();
        this.enviarSms();
    }

    public void enviarEmails() {
        notificacaoService.setStrategy(new EmailStrategy());
        System.out.println("=== Enviando emails ===");
        enviarParaTodos();
    }

    public void enviarPush() {
        notificacaoService.setStrategy(new PushStrategy());
        System.out.println("== Enviando push ===");
        enviarParaTodos();
    }

    public void enviarSms() {
        notificacaoService.setStrategy(new SmsStrategy());
        System.out.println("== Enviando Sms ===");
        enviarParaTodos();
    }

    private void enviarParaTodos() {
        for (Pedido pedido : this.pedidos) {
            notificacaoService.enviarNotificacoes(pedido);
        }
    }
}
