package br.com.letscode.Aulas._22_08;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 1 - Construir um método o qual recebe duas funções como parametro.
 * 1.1 Executar as funções no método de forma assincrona
 * 1.2 - Na execução das funções, logar o nome da threads que executam, dá
 * seguinte forma:
 * thread_name - [INFO] - log: dado_retornado
 * 1.3 Logar uma mensagem de boas-vindas
 * 1.4 - Ao final, logar o total de tempo gasto na operação.
 *
 * 2 - Construir um Logger contendo os métodos:
 * void info(String msg)
 * void warn (String msg)
 * void debug (String msg)
 * void error(String msg)
 */

public class ExercicioThread {

	private static ExecutorService taskManager = Executors.newFixedThreadPool(4);
	private static Logger logger = new Logger();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long comeco = System.currentTimeMillis();
		System.out.println("Bem vindo!");

		Callable<String> callableJay = new Callable<>() {
			@Override
			public String call() {
				logger.info("dado retornado: Jay");
				if (!"Jay".equals("Ocupado")) {
					logger.warn("manda o jay fazer alguma coisa");
				}
				return "Jay";
			}
		};
		Callable<String> callableRotta = new Callable<>() {
			@Override
			public String call() {
				logger.info("dado retornado: Rotta");
				if (!"Rotta".equals("na sala")) {
					logger.error("CADÊ O ROTTA??");
				}
				return "Rotta";
			}
		};
		List<Future<String>> rodaDoisERetorna = rodaDoisERetorna(callableJay, callableRotta);

		rodaDoisERetorna.get(0).get();
		rodaDoisERetorna.get(1).get();
		taskManager.shutdown();

		long fim = System.currentTimeMillis();
		System.out.printf("Demorou %d ms", fim - comeco);
	}

	private static <T> List<Future<T>> rodaDoisERetorna(Callable<T> task1, Callable<T> task2)
			throws InterruptedException {
		Future<T> f1 = taskManager.submit(task1);
		Future<T> f2 = taskManager.submit(task2);
		return Arrays.asList(f1, f2);
	}
}
