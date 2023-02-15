public class Cliente {
    //exercício 3
    private Double peso;
    private Double altura;
    private Integer idade;

    public Cliente(
            Double peso,
            Double altura,
            Integer idade) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;

    }

    public Cliente(
            Double peso,
            Double altura) {
        this.peso = peso;
        this.altura = altura;
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
}
