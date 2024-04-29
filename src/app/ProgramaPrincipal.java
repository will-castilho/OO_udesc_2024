package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();

        fulano.nome = "Fulano da Silva";
        fulano.endereco = "Rua dos programadores, 42";
        fulano.nascimento = LocalDate.of(1990, 10, 13);
        fulano.salario = new BigDecimal("1000.99");

       System.out.println("Nome.....: " + fulano.nome);
       System.out.println("Endereco.....: " + fulano.endereco);
       System.out.println("Nascimento.....: " + fulano.nascimento);
       System.out.println("Salario.....: " + fulano.salario);
    }
}
