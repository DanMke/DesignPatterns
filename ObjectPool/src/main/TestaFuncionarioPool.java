package main;

import concretePool.FuncionarioPool;
import pool.Pool;
import product.Funcionario;

public class TestaFuncionarioPool {

	public static void main(String[] args) {
		Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		
		Funcionario funcionario = funcionarioPool.acquire();
		
		while (funcionario != null) {
			System.out.println(funcionario.getNome());
			funcionario = funcionarioPool.acquire();
		}
		Funcionario funcionario1 = new Funcionario("Daniel");
		
		funcionarioPool.release(funcionario1);
		funcionario = funcionarioPool.acquire();
		System.out.println(funcionario.getNome());
	}
}
