public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Pedro");
        Professor professor2 = new Professor("Samuel");

        Professor[] professores = {professor1, professor2};


        Escola escola = new Escola("OTILIA", professores);


        escola.imprime();


    }
}