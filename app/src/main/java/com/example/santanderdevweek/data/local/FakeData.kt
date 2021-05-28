package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("Joao Victor")
        val cartao = Cartao("4111111111")

        return Conta(
            "Agencia: 445655-4",
            "Conta: 6552-4",
            "R$ 2.450,80",
            "R$ 4.120,00",
            cliente,
            cartao
        );
    }
}