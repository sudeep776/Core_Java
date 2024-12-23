package OOPS;

interface Car{
    public void applyBreak();
}

class Student implements Car{
    int age;
    String address;

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){

    }
    public Student (int age,String address){
        this.age=age;
        this.address=address;
    }

    @Override
    public void applyBreak() {
        System.out.println("applying break");
    }
}
public class Objects {

}
