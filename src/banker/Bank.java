package banker;

public class Bank {
	//DEFINICAO DE NUMEROcONTA, NAME, SENHA SAO STRING;
	private String numeroConta;
	private String name;
	private String senha;
	private double saldo;
	
	//CONSTRUCTOR PADRAO COM PASSAGEM DE PARAMETROS;
	public Bank (String numeroConta, String nome, String senha, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.name = nome;
		this.senha = senha;
		depositar(saldoInicial);
	}
	
	public Bank() {
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public String getNome() {
		return name;
	}
	
	//FUNCAO QUE VERIFICA SENHA SE FOR CERTA RETORNA BOOELAN VERDADEIRO OU FALSO;
	public boolean verificarSenha(String senhaDigitada) {
		return this.senha.equals(senhaDigitada);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//DEPOSITAR;
	public void depositar(double valor) {
		this.saldo += valor;
	}
	//SACAR COM UMA TAXA DE 5.00;
	public void sacar(double valor) {
		this.saldo -= valor + 5;
	}
}
