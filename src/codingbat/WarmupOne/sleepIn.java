package codingbat.WarmupOne;

public class sleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        } else if (weekday == true && vacation == false) {
            return false;
        } else {
            return true;
        }
    }
}

//Website Solution
//    public boolean sleepIn(boolean weekday, boolean vacation) {
//        if (!weekday || vacation) {
//            return true;
//        }
//
//        return false;
//}
// Solution notes: better to write "vacation" than "vacation == true"
// though they mean exactly the same thing.
// Likewise "!weekday" is better than "weekday == false".
// This all can be shortened to: return (!weekday || vacation);
// Here we just put the return-false last, or could use an if/else.
