package classes;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private int salario;
    private String dept;
    private List<Funcionario> subordinados;

    public Funcionario(String nome, String dept, int salario) {
        this.nome = nome;
        this.dept = dept;
        this.salario = salario;
        subordinados = new ArrayList<Funcionario>();
    }

    public void add(Funcionario e) {
        subordinados.add(e);
    }

    public void remove(Funcionario e) {
        subordinados.remove(e);
    }

    public List<Funcionario> getSubordinados() {
        return subordinados;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + ", dept=" + dept +"]";
    }

    
}