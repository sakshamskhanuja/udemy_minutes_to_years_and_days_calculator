public class Main {
    public static void main(String[] args) {
        // Calculates 525600 minutes to years and days.
        printYearsAndDays(525600);

        // Calculates 1051200 minutes to years and days.
        printYearsAndDays(1051200);

        // Calculates 561600 minutes to years and days.
        printYearsAndDays(561600);
    }

    /**
     * Calculates years and days from minutes.
     */
    public static void printYearsAndDays(long minutes) {
        // Checks for invalid value.
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Calculates years
        long years = minutes / (60 * 24 * 365);
        System.out.println(minutes + " min = " + years + " y and " + ((minutes / (60 * 24)) - (years * 365)) + " d");
    }
}