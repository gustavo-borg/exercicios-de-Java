package hashCodeAndEquals;

import java.util.Objects;

public class Person {
    private String name;
    private String cpf;

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person other = (Person) obj;
        return Objects.equals(getCpf(), other.getCpf());
    }
}
