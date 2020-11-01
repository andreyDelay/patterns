package andrey.patterns.behavioral.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expr = context.evaluate("1-2+3");
        System.out.println(expr.interpret());
    }
}
