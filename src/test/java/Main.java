import org.aplatanao.dimpl.Context;

public class Main {

    public static void main(String[] args) {
        Example example = new Context().get(Example.class);
        System.out.println(example); // outputs: "example dependency"
    }
}