public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking == true) {

            if (hourOfDay >= 0 && hourOfDay < 8) {
                return true;
            } else if (hourOfDay >= 23 && hourOfDay <= 24) {
                return true;
            }
        return false;
        }
        return false;
    }
}
