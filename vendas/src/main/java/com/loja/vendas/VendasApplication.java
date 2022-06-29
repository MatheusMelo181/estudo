package com.loja.vendas;

import com.loja.vendas.domain.dao.ClienteDAO;
import com.loja.vendas.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

	@Bean
	public CommandLineRunner init(@Autowired ClienteDAO clienteDAO){
		return args -> {
			clienteDAO.salvar(new Cliente("Matheus"));
			clienteDAO.salvar(new Cliente("Gabriel"));

			List<Cliente> todosClientes = clienteDAO.obterTodos();
			todosClientes.forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
