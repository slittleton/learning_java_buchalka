public class Main {
    public static void main(String[] args) {
       boolean wake = BarkingDog.shouldWakeUp(true, -1);
        System.out.println("wake up? " + wake);

        wake = BarkingDog.shouldWakeUp(true, 6);
        System.out.println("wake up? " + wake);

        wake = BarkingDog.shouldWakeUp(false, 22);
        System.out.println("wake up? " + wake);
    }
}
