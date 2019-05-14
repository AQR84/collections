package a.kaskov.myself.phoneBook;

public class People {
    String name;

    public People(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        return this.name.equals(obj);
    }

    @Override
    public String toString() {
        return name;
    }
}
