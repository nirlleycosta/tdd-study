import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDeSalarioTest {

    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarrioAbaixoDoLimite() {
        CalculadoraDeSalario calculadora =
                new CalculadoraDeSalario();
        Funcionario dev = new Funcionario
                ("Mauricio", 2500, Cargo.DESENVOLVEDOR);

        double salario = calculadora.calculaSalario(dev);

        assertEquals(2500.0 * 0.9, salario, 0.00001);
    }

    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
        CalculadoraDeSalario calculadora =
                new CalculadoraDeSalario();
        Funcionario dev = new Funcionario
                ("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.calculaSalario(dev);

        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

    @Test
    public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
        CalculadoraDeSalario calculadora =
                new CalculadoraDeSalario();
        Funcionario dba = new Funcionario
                ("Mauricio", 500.0, Cargo.TESTADOR);

        double salario = calculadora.calculaSalario(dba);

        assertEquals(500.0 * 0.85, salario, 0.00001);
    }
}

