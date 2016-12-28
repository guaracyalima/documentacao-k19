package br.com.k19.banco.contas;

/**
 * 
 * Documenta��o da classe conta
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
	 * documenta��o do atributo numero
	 * */
	private int numero;
	
	/**
	 * 
	 * Documenta��o do construtor
	 * 
	 * @param numero
	 * documenta��o desa caceta
	 * 
	 * @throws IllegalArgumentException
	 * documenta��o da situa��o que gera a exception
	 * */
	public conta (int numero){
		if (numero < 0){
			throw new IllegalArgumentException("Numero negativo");
		}
		this.numero =  numero;
	}
	
	/**
	 * Documenta��o do metodo getNumero
	 * 
	 * @return valor de retorno
	 * */
	public int getNumero(){
		return numero;
	}
}
