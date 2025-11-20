public class TstCat {
public static void main(String []args) {
    cat cat1 = new cat();
    cat cat2 = new cat(5, 45, " lucy ");

    cat1.move();
    cat2.move2(20);
    cat1.status();
    cat2.status();
}
}
