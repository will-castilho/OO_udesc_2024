package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa {
    public String nome;
    public String endereco;
    public LocalDate nascimento;
    public BigDecimal salario;

    public void apresentarse() {
        System.out.println("Nome.....: " + this.nome);
        System.out.println("Endereco.....: " + this.endereco);
        System.out.println("Nascimento.....: " + this.nascimento);
        System.out.println("Salario.....: " + this.salario);
    }

}
