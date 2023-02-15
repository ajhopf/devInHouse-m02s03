import java.util.ArrayList;
import java.util.List;

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

    //exercicio 2
    public Double calcularIMC (Double peso, Double altura) {
        return (peso/altura * altura);
    };

    //exercicio 4
    public void adicionarCliente(Cliente cliente) {
        this.clientesList.add(cliente);
        System.out.println(clientesList);
    }

}
