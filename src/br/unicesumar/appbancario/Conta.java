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
public abstract class Conta {
    private int numeroConta;
    private int agencia;
    private Cliente cliente;
    protected double saldo;

    //Construtor
    public Conta(int numeroConta, int agencia, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = 0;
    }  
    //Método abstrato
    public abstract void sacar(double valor); 
    
    //Métodos
    public void depositar(double valor){
        this.saldo = valor;
    };

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        if(numeroConta <= 0){
            System.out.println("Numero da conta deve ser maior que zero!");
            return;
        }
        this.numeroConta = numeroConta;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Numero da agência deve ser maior que zero!");
            return;
        }
        this.agencia = agencia;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }
}
