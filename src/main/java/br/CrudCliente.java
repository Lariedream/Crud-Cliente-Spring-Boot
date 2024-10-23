package br;

import br.models.ClienteModel;
import br.repositories.ClienteRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudCliente {

    final
    ClienteRepository clienteRepository;

    public CrudCliente(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CrudCliente.class, args);
    }

    @PostConstruct
    void populandoLista() {
        clienteRepository.setClientes(new ClienteModel("Larie", 27, "Programadora"));

        clienteRepository.setClientes(new ClienteModel("Diego", 27, "Tester de cabos"));

        clienteRepository.setClientes(new ClienteModel("João", 26, "Almoxarife"));

        clienteRepository.setClientes(new ClienteModel("Andrew", 24, "Tatuador"));
    }

}
