package br.com.k19.banco.contas;

/**
 * 
 * Documentação da classe conta
 *
 *
 *@author Lucifers Heritage
 *
 *@version 0001
 * 
 * 
 * */
public class conta {

	/**
	 * documentação do atributo numero
	 * */
	private int numero;
	
	/**
	 * 
	 * Documentação do construtor
	 * 
	 * @param numero
	 * documentação desa caceta
	 * 
	 * @throws IllegalArgumentException
	 * documentação da situação que gera a exception
	 * */
	public conta (int numero){
		if (numero < 0){
			throw new IllegalArgumentException("Numero negativo");
		}
		this.numero =  numero;
	}
	
	/**
	 * Documentação do metodo getNumero
	 * 
	 * @return valor de retorno
	 * */
	public int getNumero(){
		return numero;
	}
}
