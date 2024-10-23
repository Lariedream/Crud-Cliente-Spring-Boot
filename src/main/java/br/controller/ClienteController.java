package br.controller;

import br.models.ClienteModel;
import br.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    final
    ClienteService service;
    private final ClienteService clienteService;

    public ClienteController(ClienteService service, ClienteService clienteService) {
        this.service = service;
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<ClienteModel> getCliente() {
        return service.clienteModels();
    }

    @GetMapping(params = "idade")
    public List<ClienteModel> getCliente(@RequestParam("idade") Integer idade) {
        return clienteService.buscaClientePorIdade(idade);
    }

    @GetMapping("/{id}")
    public Optional<ClienteModel> getClientePorId(@PathVariable Long id) {
        return clienteService.buscaClientePorId(id);

    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable long id) {
        service.deletarCliente(id);
    }

    @PutMapping("/{id}")
    public void updateCliente(@PathVariable long id, @RequestBody ClienteModel clienteModel) {
        clienteModel.setId(id);
        clienteService.editarCliente(clienteModel);
    }

    @PostMapping
    public ClienteModel criarCliente(@RequestBody ClienteModel clienteModel) {
        service.criarCliente(clienteModel);
        return clienteModel;
    }



}
