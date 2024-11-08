import pack.Simple;



public class demo {
    public static void main(String args[]){
        Bird x = new Bird(100);
        Bird y = new Bird(10);
        x.get_info();
        y.get_info();

        System.out.println("Overloading demo");
        OverloadingDemo x1 = new OverloadingDemo();
        System.out.println(x1.mul(1,2));
        System.out.println(x1.mul(2));
        System.out.println(x1.mul(1,2, 3));

        Simple x2 = new Simple();
        x2.test();
        Bike x4 = new Bike();
        x4.feature();
        
    }
}


interface Motor{
    public void feature();
}


class Bike implements Motor{
    public void feature(){
        System.out.println("Have 2 wheels");
    }
}

class Bird{
    int weight;
    public Bird(int x){
        this.weight = x;
    }

    public void get_info(){
        System.out.println("Weight of the bird is"+ this.weight);
    }
}


class OverloadingDemo{
    public int mul(int x, int y){
        return x*y;
    }
    public int mul(int x){
        return x*x;
    }
    public double mul(int x, int y, int z){
        return x*y*z;
    }
}