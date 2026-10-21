package cat;

public class Main {
    static void main() {
        Cat blackCat = new Cat();
        Cat orangeCat = new Cat();

        Mat purpleMat = new Mat("Purple", 1.0, 0.5);


        blackCat.sit();
        orangeCat.sit();

        System.out.println(purpleMat);

    }
}
