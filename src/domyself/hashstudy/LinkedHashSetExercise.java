package domyself.hashstudy;

@SuppressWarnings({ "all" })
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSetExercise linkedHashSet = new LinkedHashSetExercise();
    }
    class Car {
        private String name;
        private double price;
        
        public Car (String name,double price) {
            this.name = name;
            this.price = price;
        }
        
    }
}

/**
 * Car类(属性: name，price),如果name和price-样，
 * 则认为是相同元素，就不能添加。
 * 5min
 */
