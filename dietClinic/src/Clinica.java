import java.util.ArrayList;
import java.util.List;

public class Clinica {
    //exercicio 1
    String dono;
    String nomeDaClinica;
    String cnpj;
    String endereco;
    Integer codigo;
    //exercicio 3
    private final List<Cliente> clientesList = new ArrayList<>();

    //exercicio 2
    public Double calcularIMC (Double peso, Double altura) {
        return (peso/altura * altura);
    };

    public void adicionarCliente(Cliente cliente) {
        this.clientesList.add(cliente);
        System.out.println(clientesList);
    }

}
