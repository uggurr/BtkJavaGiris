package polymorphism;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] baseLoggers = {new DatabaseLogger(),new FileLogger(), new EmailLogger(),new ConsoleLogger()};
		
		for(BaseLogger baseLogger:baseLoggers) {
			baseLogger.log("Log Mesajý");
		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}

}
