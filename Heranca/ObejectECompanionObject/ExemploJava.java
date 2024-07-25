package Heranca.ObejectECompanionObject;

public class ExemploJava {

    // Variaveis estaticas estao no escopo da classe
    public static int valor = 0;

    private int value = 0;

    public ExemploJava() {
        value++;
        valor++;
    }

    public static void main(String[] args) {
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();

        ExemploJava ex = new ExemploJava();
        System.out.println("Value: " + ex.value);
        System.out.println("Valor: " + ExemploJava.valor);
    }
}
