package crazywu.demo.pojo;

public class User {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        // 怎么说呢，这玩意还是挺好玩的，但是总归还是没有IDEA智能，对于大型项目，可能还是
        return age + "--" + name;
    }
}