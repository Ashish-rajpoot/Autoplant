package demo.q14;

public class Honda extends Bike{
    int speedlimit=120; 
    public static void main(String[] args) {
    Bike b =  new Honda();
    System.out.println(b.speedlimit);
    }

}
class Bike{
int speedlimit=90;
}

// output : 90