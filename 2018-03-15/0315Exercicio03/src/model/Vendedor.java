/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Classe com as informações do Vendedor.
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class Vendedor {
    
    private String nome;
    private double salarioFixo;
    private double porcentagemComissao;
    private double valorVenda;
    private double salarioMesAtual;

    public Vendedor() {
        // Construtor para inicialização por reflexão.
    }

    public Vendedor(String nome, double salarioFixo, double porcentagemComissao,
            double valorVenda) {

        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.porcentagemComissao = porcentagemComissao;
        this.valorVenda = valorVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getSalarioMesAtual() {
        return salarioMesAtual;
    }

    public void setSalarioMesAtual(double salarioMesAtual) {
        this.salarioMesAtual = salarioMesAtual;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nome=" + nome
                + ", salarioFixo=" + salarioFixo
                + ", porcentagemComissao=" + porcentagemComissao
                + ", valorVenda=" + valorVenda
                + ", salarioMesAtual=" + salarioMesAtual
                + '}';
    }
    
    public void imprimirDados() {
        System.out.println("DADOS DO VENDEDOR:");
        System.out.println("Nome:\t\t\t\t" + nome);
        System.out.println("Salário fixo:\t\t\t" + salarioFixo);
        System.out.println("Porcentagem da comissão:\t"
                + porcentagemComissao);
        System.out.println("Valor das vendas:\t\t" + valorVenda);
        System.out.println("Salário a receber:\t\t" + salarioMesAtual);
    }
    
}
