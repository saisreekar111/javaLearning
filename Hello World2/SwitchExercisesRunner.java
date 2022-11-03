public class SwitchExercisesRunner {
    public static void main(String[] args) {
        System.out.println(determineNameOfDay(3));
    }
        public static String determineNameOfDay(int dayNumber) {
            //if we don't want to use break
            switch (dayNumber) {
                case 0:  return "Sunday";
                case 1: return "Monday";
                case 2: return "Tuesday";
                case 3: return "Wednesday";
                case 4: return "Thursday";
                case 5: return "Friday";
                case 6: return "Saturday";
            }
            return "default";
        //String result = "";
        //switch (dayNumber) {
            //case 0:  result = "Sunday";
           // break;
            //case 1: result = "Monday";
            //break;
            //case 2: result = "Tuesday";
            //break;
            //case 3: result = "Wednesday";
            //break;
            //case 4: result = "Thursday";
            //break;
            //case 5: result = "Friday";
            //break;
            //case 6: result = "Saturday";
           // break;
            //default: result = "default";
        //}
            //return result;
        }

}
