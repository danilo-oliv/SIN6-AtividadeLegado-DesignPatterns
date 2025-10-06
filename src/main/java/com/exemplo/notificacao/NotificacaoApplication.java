package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exemplo.notificacao.facade.NotificacaoFacade;
import com.exemplo.notificacao.model.Pedido;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Sistema de Notificação de Pedidos ===");

        List<Pedido> pedidos = Arrays.asList(
            new Pedido("João", 150.0),
            new Pedido("Maria", 320.0),
            new Pedido("Carlos", 80.0)
        );
        
        NotificacaoFacade notificacaoFacade = new NotificacaoFacade(pedidos);
        notificacaoFacade.enviarTodos();

        // notificacaoFacade.enviarEmails();
        // notificacaoFacade.enviarPush();
        // notificacaoFacade.enviarSms();

        System.out.println("=== Fim da execução ===");
    }
}
