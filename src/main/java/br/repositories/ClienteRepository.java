package br.repositories;
import br.models.ClienteModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ClienteRepository {
    private List<ClienteModel> clientes = new ArrayList<>();

    public List<ClienteModel> getClientes(){
        return clientes;
    }

    public void setClientes(ClienteModel cliente){
        clientes.add(cliente);
    }

    public void deletarCliente(long id){
        ClienteModel clienteModel = this.clientes.stream()
                .filter(cliente -> Objects.equals(cliente.getId(),id)).findFirst().get();

        this.clientes.remove(clienteModel);
    }

    public void editarCliente(ClienteModel clienteModel){
        clientes.replaceAll(cliente -> cliente.getId().equals(clienteModel.getId()) ? clienteModel : cliente);
    }

    public void criarCliente(ClienteModel clienteModel){
        this.clientes.add(clienteModel);
    }

    public List<ClienteModel> buscarClientePorIdade(int idade){
        return  this.clientes.stream()   //Usando o STREAM ( cria uma visão de fluxo da lista que é imutável )
                .filter(clienteModel -> clienteModel.getIdade() == idade) //modo filter ele nao altera a lista original
                .collect(Collectors.toList()); //retornando um novo Stream com o que o filtro pede.
    }

    public Optional<ClienteModel> buscarClientePorId(long id){
        return this.clientes.stream()
                .filter(clienteModel -> clienteModel.getId() == id)
                .findFirst();
    }


}
