import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinica {
    //exercicio 1
    private String dono;
    private String nomeDaClinica;
    private String cnpj;
    private String endereco;
    private Integer codigo;
    //exercicio 3
    private List<Cliente> clientesList = new ArrayList<>();

    //exercicio 5
    public Clinica(String dono) {
        this.dono = dono;
    }

    public Clinica(String dono, List<Cliente> clientsList) {
        this.dono = dono;
        this.clientesList = clientsList;
    }

    //exercicio 8
    public List<Cliente> getClientesList() {
        for (Cliente cliente : clientesList) {
            System.out.println("Nome: " + cliente.getNome());
        }

        return clientesList;
    }

    //exercicio 2
    public Double calcularIMC (Double peso, Double altura) {
        return (peso/altura * altura);
    };


    //exercicio 4
    public void adicionarCliente(Cliente cliente) {
        this.clientesList.add(cliente);
        System.out.println("Cliente adicionado com sucesso! Novo Cliente: ");
        System.out.println(cliente);
        System.out.println();
    }

    //exercicio 6

    public Integer makeClientId() {
        return clientesList.size() + 1;
    }

    public Double tratamento(Cliente clienteTratado) {
        Boolean clienteIdentificado = false;

        for (Cliente cliente : clientesList) {
            if (cliente.getId() == clienteTratado.getId()) {
                clienteTratado.setPeso(clienteTratado.getPeso() - 5);
                clienteIdentificado = true;
            }
        }

        if (clienteIdentificado) {
            System.out.printf("Peso do cliente atualizado. Nome: %s, Id: %d, peso atualizado: %f", clienteTratado.getNome(), clienteTratado.getId(), clienteTratado.getPeso());
            System.out.println();
            return clienteTratado.getPeso();
        } else {
            System.out.println("Cliente não identificado!");
            return 0d;
        }
    }

    //exercício 7

    public Double tratamento(Cliente clienteTratado, Double peso) {
        Boolean clienteIdentificado = false;

        for (Cliente cliente : clientesList) {
            if (cliente.getId() == clienteTratado.getId()) {
                clienteTratado.setPeso(clienteTratado.getPeso() - peso);
                clienteIdentificado = true;
            }
        }

        if (clienteIdentificado) {
            System.out.printf("Peso do cliente atualizado. Nome: %s, Id: %d, peso atualizado: %f", clienteTratado.getNome(), clienteTratado.getId(), clienteTratado.getPeso());
            System.out.println();
            return clienteTratado.getPeso();
        } else {
            System.out.println("Cliente não identificado!");
            return 0d;
        }
    }

}
