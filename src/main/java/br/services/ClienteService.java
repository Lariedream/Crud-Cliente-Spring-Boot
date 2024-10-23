package br.services;
import br.models.ClienteModel;
import br.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteModel> clienteModels(){
        return clienteRepository.getClientes();
    }

    public void deletarCliente(long id){
        clienteRepository.deletarCliente(id);
    }

    public void editarCliente(ClienteModel clienteModel){
        clienteRepository.editarCliente(clienteModel);
    }

    public void criarCliente(ClienteModel clienteModel){
        clienteRepository.criarCliente(clienteModel);
    }

   public List<ClienteModel> buscaClientePorIdade(int idade){
        return clienteRepository.buscarClientePorIdade(idade);
   }

   public Optional<ClienteModel> buscaClientePorId(long id){
        return clienteRepository.buscarClientePorId(id);
   }
}
