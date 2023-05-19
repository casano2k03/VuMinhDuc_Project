
package Bai3_Lab4;
public class Person {
    private String name;
    private int age;
    private char gender;
    public Person(String name,int age,char gender){
        this.age=age;
        this.gender=gender;
        this.name=name;        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString(){
        return " name: "+ name+"\t age: "+age+"\t gender: "+gender;
    }
}
