package spring.model;
public class User {
    private String name;
    private String surname;
    private int age;

    public User(){
        
    }

    public User(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
}
