package domyself.hashstudy;

import java.util.LinkedHashSet;
import java.util.Objects;

@SuppressWarnings({ "all" })
public class LinkedHashSetExercise {
    public static void main(String[] args) {

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Car("奥拓", 1000));// ok
        linkedHashSet.add(new Car("奥迪", 300000));// ok
        linkedHashSet.add(new Car("法拉利", 10000000));// ok
        linkedHashSet.add(new Car("奥迪", 300000));// 不 ok
        linkedHashSet.add(new Car("保时捷", 70000000));// ok
        linkedHashSet.add(new Car("奥迪", 300000));// 不 ok

        System.out.println("linkedHashSet=" + linkedHashSet);
    }
}

class Car {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }
    // 重写 equals 方法 和 hashCode
    // 当 name 和 price 相同时，就返回相同的 hashCode 值，equals 返回 t

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name) && price == car.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }


}

/**
 * Car类(属性: name，price),如果name和price-样，
 * 则认为是相同元素，就不能添加。
 * 5min
 */
