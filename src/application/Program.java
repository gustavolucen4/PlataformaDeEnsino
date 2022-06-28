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
			System.out.print("Conte�do ou tarefa (c/t)? ");
			char typeClass = keyBoard.next().charAt(0);
			System.out.print("T�tulo: ");
			keyBoard.nextLine();
			String title = keyBoard.nextLine();
			if(typeClass == 'c') {
				System.out.print("URL do v�deo: ");
				String urlVideo = keyBoard.next();
				System.out.print("Dura��o em segundos: ");
				int duration = keyBoard.nextInt();
				lessonList.add(new Video(title, urlVideo, duration));
			}else {
				System.out.print("Descri��o: ");
				String description = keyBoard.nextLine();
				System.out.print("Quantidade de quest�es: ");
				int questionCount = keyBoard.nextInt();
				lessonList.add(new Task(title, description, questionCount));
			}
		}
		
		int sumSeconds = 0;
		
		for (Lesson lesson : lessonList) {
			sumSeconds += lesson.duration();
		}
		
		System.out.println("DURA��O TOTAL DO CURSO = " + sumSeconds + " segundos");
	}
}
