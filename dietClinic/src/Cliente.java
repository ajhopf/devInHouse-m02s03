public class Cliente {
    //exercício 3
    Double peso;
    Double altura;
    Integer idade;
    Clinica clinica;

    public Cliente(
            Double peso,
            Double altura,
            Integer idade,
            Clinica clinica) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.clinica = clinica;

        //exercício 4
        clinica.adicionarCliente(this);
    }
}
