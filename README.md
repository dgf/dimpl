# dimpl - simple Java class context and factory

This [DI](https://en.wikipedia.org/wiki/Dependency_injection) approach is only useful for dependency injection of concrete implementations.

There are no plans to support interfaces or annotations at all.

# Example usage

a simple component

```java
public class Component {
    public String toString() {
        return "dependency";
    }
}
```

the example the needs a component injection

```java
public class Example {
    private Component component;

    public Example(Component component) {
        this.component = component;
    }

    public String toString() {
        return "example " + component;
    }
}
```

build context and retrieve the example dependency

```java
import org.aplatanao.dimpl.Context;

public class Main {

    public static void main(String[] args) {
        Example example = new Context().get(Example.class);
        System.out.println(example); // outputs: "example dependency"
    }
}
```
