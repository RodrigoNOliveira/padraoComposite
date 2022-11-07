import classes.Funcionario;

public class App {
    public static void main(String[] args) {

        Funcionario CEO = new Funcionario("Joao", "CEO", 30000);
        Funcionario gerente = new Funcionario("Rodrigo", "gerente", 20000);
        Funcionario administrador = new Funcionario("Roberto", "administrador", 20000);
        Funcionario vendedor1 = new Funcionario("Mariana", "vendedor", 10000);
        Funcionario vendedor2 = new Funcionario("Sueli", "vendedor", 10000);

        CEO.add(gerente);

        CEO.add(administrador);

        gerente.add(vendedor1);

        gerente.add(vendedor2);

        System.out.println(CEO);
        
        for (Funcionario funcionariosAltos : CEO.getSubordinados()) {
            System.out.println(funcionariosAltos);
            for (Funcionario funcionarios : funcionariosAltos.getSubordinados())
                System.out.println(funcionarios);
        }
    }
}
