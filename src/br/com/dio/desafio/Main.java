package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("CURSO JAVA");
		curso1.setDescricao("CURSO BACK-END");
		curso1.setCargaHoraria(8);
		
				
		
		Curso curso2 = new Curso();
		curso2.setTitulo("CURSO DE JS");
		curso2.setDescricao("CURSO JS-WEB");
		curso2.setCargaHoraria(4);
		
				
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("MENTORIA DE JAVA");
		mentoria.setDescricao("DESCRICAO: CRIANDO APIS");
		mentoria.setData(LocalDate.now()); //DATA DE CRIAÇÃO
	    
	
	
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp: Java Developer");
		bootcamp.setDescricao("Descricao: Java Back-End");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev devGabriel = new Dev();
		devGabriel.setNome("GABRIEL SALLES");
		devGabriel.inscreverBootcamp(bootcamp);
		System.out.println(devGabriel.getConteudosInscritos());

		Dev devCamila = new Dev();
		devCamila.setNome("CAMILLA CAVALCANTI");
	    System.out.println(devCamila.getConteudosInscritos());
	    
	}

}
