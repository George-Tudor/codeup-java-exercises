public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
            System.out.println("Time to wake up!");
            return true;
        } else {
            System.out.println("Sleep tight little buddy.");
            return false;
        }

    }
}

//public class BarkingDog {
//    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//        boolean wakeUp;
//        if(hourOfDay < 0 || hourOfDay > 23) {
//            wakeUp = false;
//        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
//            System.out.println("Time to wake up!");
//            wakeUp = true;
//        } else {
//            System.out.println("Sleep tight little buddy.");
//            wakeUp = false;
//        }
//        return wakeUp;
//    }
//}