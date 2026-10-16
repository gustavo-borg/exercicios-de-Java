package exSet.Festa;

import java.util.Objects;

public class Convidado {
    private String name;
    private Integer age;

    public Convidado(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o; //Downcast obj "o" passa a ser da classe Convidado
        return Objects.equals(name, convidado.name) && Objects.equals(age, convidado.age); //Comparando meu obj com o objeto que eu pedi | meuOBJ.equal(Obj que eu pedi) |
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Nome=" + getName() + " | Idade=" + getAge();
    }
}
