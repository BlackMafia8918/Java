import java.util.*;
public class EnumerationDay {
    enum Day{
        MON, TUE, WED, THURS, FRI, SAT, SUN;
    }    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (Day day : Day.values()){
            System.out.println(day);
        }
        System.out.println("Enter Input: ");
        String ss = s.nextLine();
        Day m = Day.valueOf(ss);
        System.out.println(m.ordinal());
        switch (m) {
            case MON:
                System.out.println("Today is Monday");
                break;
            case TUE:
                System.out.println("Today is Tuesday");
                break;
            case WED:
                System.out.println("Today is Wednesday");
                break;
            case THURS:
                System.out.println("Today is Thursday");
                break;
            case FRI:
                System.out.println("Today is Friday");
                break;
            case SAT:
                System.out.println("Today is Saturday");
                break;
            case SUN:
                System.out.println("Today is Sunday");
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
