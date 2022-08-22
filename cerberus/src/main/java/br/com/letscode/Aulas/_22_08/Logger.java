package br.com.letscode.Aulas._22_08;

class Logger {
	void info(String msg) {
		System.out.println(Thread.currentThread().getName() + " - [INFO] - " + msg);
	}

	void warn(String msg) {
		System.out.println(Thread.currentThread().getName() + " - [WARN] - " + msg);
	}

	void debug(String msg) {
		System.out.println(Thread.currentThread().getName() + " - [DEBUG] - " + msg);
	}

	void error(String msg) {
		System.out.println(Thread.currentThread().getName() + " - [ERROR] - " + msg);
	}
}