package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    @Test
    void getTitularDevuelveElNombreDelTitular() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 1000);
        assertEquals("Ana", cuenta.getTitular());
    }

    @Test
    void getSaldoDevuelveElSaldoInicial() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 1000);
        assertEquals(1000, cuenta.getSaldo());
    }

    @Test
    void depositarAumentaElSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 1000);
        cuenta.depositar(500);
        assertEquals(1500, cuenta.getSaldo());
    }

    @Test
    void depositarConCantidadNoPositivaNoModificaElSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 1000);
        cuenta.depositar(-500);
        assertEquals(1000, cuenta.getSaldo());
    }

    @Test
    void retirarConSaldoSuficienteActualizaSaldoYRegresaTrue() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 1500);
        boolean resultado = cuenta.retirar(500);
        assertTrue(resultado);
        assertEquals(1000, cuenta.getSaldo());
    }

    @Test
    void retirarSinSaldoSuficienteNoModificaSaldoYRegresaFalse() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 1000);
        boolean resultado = cuenta.retirar(1500);
        assertFalse(resultado);
        assertEquals(1000, cuenta.getSaldo());
    }
}
