package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyBoard = new Scanner(System.in);
		
		List<Lesson> lessonList = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int numberClass = keyBoard.nextInt();
		
		for(int i = 1; i <= numberClass; i++) {
			System.out.println("Dados da "+ i +"a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char typeClass = keyBoard.next().charAt(0);
			System.out.print("Título: ");
			keyBoard.nextLine();
			String title = keyBoard.nextLine();
			if(typeClass == 'c') {
				System.out.print("URL do vídeo: ");
				String urlVideo = keyBoard.next();
				System.out.print("Duração em segundos: ");
				int duration = keyBoard.nextInt();
				lessonList.add(new Video(title, urlVideo, duration));
			}else {
				System.out.print("Descrição: ");
				String description = keyBoard.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = keyBoard.nextInt();
				lessonList.add(new Task(title, description, questionCount));
			}
		}
		
		int sumSeconds = 0;
		
		for (Lesson lesson : lessonList) {
			sumSeconds += lesson.duration();
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + sumSeconds + " segundos");
	}
}
