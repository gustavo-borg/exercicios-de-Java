package classes.ex008;

public class OperacoesSalario {
    public static void aumentoSalarial(Funcionarios f, double x) {
        f.setSalario(f.getSalario() *  (x / 100 + 1));
    }

    public static void reduzirSalario(Funcionarios f, double x) {
        f.setSalario(f.getSalario() * ( 1 - x / 100 ));
    }
}
