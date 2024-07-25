package c2Objects.dependencyInjection.hardWired;

class GreetingRepository{
    public String getGreeting(){
        return "Hello, World!!";
    }
}

// Greeting Service is dependent on Greeting Repository.
// But I can't inject any new class in it. Its hard wired.
class GreetingService{
    private GreetingRepository greetingRepository = new GreetingRepository();

    public String greet(){
        return greetingRepository.getGreeting();
    }
}

public class Main {
    public static void main(String[] args) {
        GreetingService greetingService = new GreetingService();
        System.out.println(greetingService.greet());
    }
}
