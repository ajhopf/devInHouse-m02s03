public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("André");

        Cliente andre = new Cliente(
                "André",
                86d,
                1.80,
                clinica);

        Cliente rachel = new Cliente(
                "Rachel",
                56d,
                1.60,
                clinica);


        clinica.tratamento(andre);
        clinica.tratamento(rachel);
        clinica.tratamento(andre, 2d);

        System.out.println(clinica.getClientesList());
    };
}