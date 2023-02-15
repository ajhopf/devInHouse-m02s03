public class Cliente {
    //exercício 3
    private String nome;
    private Double peso;
    private Double altura;
    private Integer idade;
    private Clinica clinica;
    private Integer id;

    public Cliente(
            String nome,
            Double peso,
            Double altura,
            Integer idade,
            Clinica clinica) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.clinica = clinica;
        this.id = clinica.makeClientId();

        clinica.adicionarCliente(this);
    }

    public Cliente(
            String nome,
            Double peso,
            Double altura,
            Clinica clinica) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.clinica = clinica;
        this.id = clinica.makeClientId();

        clinica.adicionarCliente(this);
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso(){
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getId() {
        return id;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", idade=" + idade +
                ", id=" + id +
                '}';
    }
}
