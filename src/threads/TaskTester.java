package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTester {
	public static void main(String[] args) {
		PrintTask task1 = new PrintTask("Tarefa1");
		PrintTask task2 = new PrintTask("Tarefa2");
		PrintTask task3 = new PrintTask("Tarefa3");
		
		ExecutorService threadExecutor = Executors.newFixedThreadPool( 3 );
		threadExecutor.execute(task1);
		threadExecutor.execute(task2);
		threadExecutor.execute(task3);				
		
		threadExecutor.shutdown();
		
		System.out.println("Terminando o método main!");
	}
}
