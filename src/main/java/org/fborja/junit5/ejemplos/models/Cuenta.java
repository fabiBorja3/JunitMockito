package org.fborja.junit5.ejemplos.models;

import java.math.BigDecimal;

public class Cuenta {

    private String persona;

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    private BigDecimal saldo;


}
