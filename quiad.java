import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarPrinter {
    
    public static void solution(int year, int month) {
        // Validate the month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
            return;
        }
        
        // Get the YearMonth object for the given year and month
        YearMonth yearMonth = YearMonth.of(year, month);
        
        // Get the number of days in the month
        int daysInMonth = yearMonth.lengthOfMonth();
        
        // Print the month and year
        String monthName = yearMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        // Get the day of the week for the first day of the month
        int firstDayOfWeek = yearMonth.atDay(1).getDayOfWeek().getValue();
        
        // Adjust the value of firstDayOfWeek to match the calendar starting with Sunday
        firstDayOfWeek = (firstDayOfWeek % 7) + 1;
        
        // Print initial spaces
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }
        
        // Print the calendar days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            
            // Move to the next line after Saturday (7th day of the week)
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        
        System.out.println(); // Final new line for clean output
    }

    public static void main(String[] args) {
        // Example usage
        solution(2024, 6);
    }
}
