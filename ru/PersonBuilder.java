package netology.ru;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Здесь должно быть имя!");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Здесь должна быть фамилия!");
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
        if (name == null) {
            throw new IllegalStateException("Не указано имя");
        }
        if (surname == null) {
            throw new IllegalStateException("Не указана фамилия");
        }
        return new Person(name, surname, age, address);
    }
}



