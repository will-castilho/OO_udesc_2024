package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();

        fulano.setNome("Fulano da Silva");
        fulano.setEndereco("Rua dos programadores, 42");
        fulano.setNascimento(LocalDate.of(1990, 10, 13));
        fulano.setSalario(new BigDecimal("1000.99"));

       fulano.apresentarse();
    }
}
