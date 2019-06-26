package main;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import concretePrototype.Campanha;

public class TestaPrototype {

	public static void main(String[] args) {
		String nome = " K19 ";
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add(" curso ");
		hashSet.add(" java ");
		hashSet.add(" k19 ");
		
		Campanha campanha = new Campanha(nome, vencimento, hashSet);
		System.out.println(campanha);
		
		Campanha clone = campanha.clone();
		System.out.println(clone);

	}

}
