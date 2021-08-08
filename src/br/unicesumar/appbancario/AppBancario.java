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
public class AppBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Flávio", "123.456.789-10");
        Cliente cliente2 = new Cliente("Roberto", "234.567.890-11");
        Conta contaCorrente = new ContaCorrente(123, 456, cliente1);
        Conta contaPoupanca = new ContaPoupanca(234, 456, cliente2);

        contaCorrente.depositar(5000);
        contaPoupanca.depositar(6000);
        contaPoupanca.sacar(1000);
        contaCorrente.sacar(6000);
        

        exibirResultados(contaCorrente, contaPoupanca);
    }

    private static void exibirResultados(Conta contaCorrente, Conta contaPoupanca) {
        System.out.println("Conta Corrente: \n" + 
                "Nome: " + contaCorrente.getCliente().getNomeCliente() + "\n" +
                "CPF: " + contaCorrente.getCliente().getCpf() + "\n" +
                "Numero da Conta: " + contaCorrente.getNumeroConta() + "\n" +
                "Agencia: " + contaCorrente.getAgencia() + "\n" + 
                "Saldo: " + contaCorrente.getSaldo() + "\n"
                );
        System.out.println("Conta Poupança: \n" + 
                "Nome: " + contaPoupanca.getCliente().getNomeCliente() + "\n" +
                "CPF: " + contaPoupanca.getCliente().getCpf() + "\n" + 
                "Numero da Conta: " + contaPoupanca.getNumeroConta() + "\n" +
                "Agencia: " + contaPoupanca.getAgencia() + "\n" +
                "Saldo: " + contaPoupanca.getSaldo() + "\n");
    }    
}
