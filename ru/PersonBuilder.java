package netology.ru;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Здесь не должно быть пусто!");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Здесь не должно быть пусто!");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Неправильный возраст!");
        }
        this.age = age;
        return this;

    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Нужно заполнить имя!");
        }
        if (surname.isEmpty()){
            throw new IllegalArgumentException("Нужно заполнить фамилию!");
        }
        return new Person(name, surname, age, address);
    }
}

