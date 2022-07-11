package Diet;
public class Person {
    private int height;
    private double weight;
    private int age;
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double manKcal(){
        return (10*weight)+(6.26*height)-(5*age)+5;
    }
    public double womanKcal(){
        return (10*weight)+(6.26*height)-(5*age)-161;
    }
}
