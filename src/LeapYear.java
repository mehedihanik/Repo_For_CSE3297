public class LeapYear {

    static boolean checkLeapYear(int year) {
        boolean isItleapyear = false;
        if (year % 400 == 0 || year % 100 == 0 || year % 4 == 0) {
            isItleapyear = true;
            return isItleapyear;
        } else {
            return isItleapyear;
        }

    }
}
