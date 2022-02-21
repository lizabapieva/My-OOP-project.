package Users;

public class User {
    int id , age ;
    String name_user;
    char gender;

    public User(){

    }
    public User(int id , String name_user , char gender , int age){
        setId(id);
        setName_user(name_user);
        setGender(gender);
        setAge(age);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
