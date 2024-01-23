package comparator;

public class Product {

        public static void main(String[] args) {
            Product1 p1 =  new Product1(1, 20.0, 31.7);
            Product1 p2 = new Product1(2, 20, 32);
            if(p1.compareTo(p2)==1)
                System.out.println("Object p1 price greater ");
            else if(p1.compareTo(p2)==-1)
                System.out.println("Object p2 price is high");
            else
                System.out.println("Both prices are same ");
        }
    }

    class Product1 implements Comparable<Product1>{
        private int id;
        private double weight,price;
        public Product1(int id, double weight, double price) {
            this.id = id;
            this.weight = weight;
            this.price = price;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public double getWeight() {
            return weight;
        }
        public void setWeight(float weight) {
            this.weight = weight;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(float price) {
            this.price = price;
        }

        @Override
        public int compareTo(Product1 p1) {
            if(this.getPrice()>p1.getPrice()) return 1;
            else if(this.getPrice()<p1.getPrice()) return -1;
            else return 0;
        }
    }

