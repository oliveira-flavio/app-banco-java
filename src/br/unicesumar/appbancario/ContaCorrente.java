/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.appbancario;

/**
 *
 * @author Flavio
 */
public class ContaCorrente extends Conta{

    public ContaCorrente(int numeroConta, int agencia, Cliente cliente) {
        super(numeroConta, agencia, cliente);
    }

    @Override
    public void sacar(double valor) {
        valor += 0.10;
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente!");
            return;
        }
            this.saldo-= valor;
    }
}
