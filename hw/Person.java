package hw;

public class Person {
    private String name;
    private Integer age;
    private String favoriteSport;
    private String occupation;
    private Float salary;

    public Person(){

    }
    public Person(String name, Integer age, String favoriteSport, String occupation, Float salary){
        this.name = name;
        this.age = age;
        this.favoriteSport = favoriteSport;
        this.occupation = occupation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFavoriteSport() {
        return favoriteSport;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
    public void printMethod(){
        System.out.println("My name is " + name + " and I am " + age + " years old. My favorite sport is " + favoriteSport + " and by this time next year my occupation will be " + occupation + " meaning I could be making up to " + salary + " yearly!");
    }

}
