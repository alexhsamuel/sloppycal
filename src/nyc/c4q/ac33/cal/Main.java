package nyc.c4q.ac33.cal;

import java.util.Calendar;
import java.util.GregorianCalendar;

// https://www.redcort.com/us-federal-bank-holidays/

public class Main {
    public static void main(String[] args) {
        final int month = Integer.valueOf(args[0]);
        int year = Integer.valueOf(args[1]);
        System.out.println(Calendar.SATURDAY);
        final Calendar c = new GregorianCalendar(year, month - 1, 1);
        System.out.print(c.get(Calendar.YEAR));
        // System.out.println(c.get(Calendar.MONTH));
        // System.out.println(c.get(Calendar.DAY_OF_MONTH));
        if (c.get(Calendar.MONTH) == 0)System.out.println("January");
        else if (c.get(Calendar.MONTH)==1)System.out.println("Febuary");
        else if (c.get(Calendar.MONTH)==2)System.out.println("March");
        else if (c.get(Calendar.MONTH)==3)System.out.println("April");
        else if (c.get(Calendar.MONTH)==4)System.out.println("May");
        else if (c.get(Calendar.MONTH)==5)System.out.println("June");
        else if (c.get(Calendar.MONTH)==6)System.out.println("July");
        else if (c.get(Calendar.MONTH)==7)System.out.println("August");
        else if (c.get(Calendar.MONTH)==7)System.out.println("September");
        else if (c.get(Calendar.MONTH)==9)System.out.println("October");
        else if (c.get(Calendar.MONTH)==10)System.out.println("November");
        else if (c.get(Calendar.MONTH)==11)System.out.println("December");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        while (c.get(Calendar.DAY_OF_WEEK) != 1) c.add(Calendar.DAY_OF_MONTH, -1);
        while (c.get(Calendar.MONTH) <= month - 1) {
            if (c.get(Calendar.MONTH) == month - 1) {
                System.out.format("%2d", c.get(Calendar.DAY_OF_MONTH));
int a = c.get(Calendar.YEAR)% 19;
int b = c.get(Calendar.YEAR)/ 100;
int cc = c.get(Calendar.YEAR) % 100;
int d = b/4;
int e = b%4;
int f = (b+8)/25;
int g = (b-f+1) /3;
int h = (19*a +b-d-g + 15)%30;
int i = cc/4;
int k = cc%4;
int l = (32+2*e+2*i-h-k)%7;
int m = (a+ 11 * h + 22 * l) / 451;
int n = (h+l-7*m+114) / 31;
int p = (h+l- 7*m+114)%31;
                if (c.get(Calendar.MONTH) == 0 && c.get(Calendar.DAY_OF_MONTH) == 1) System.out.print("N ");
                if (c.get(Calendar.MONTH) == 0 &&
                        c.get(Calendar.DAY_OF_WEEK) == 2
                        && c.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 3) System.out.print("M ");
                else if (c.get(Calendar.MONTH) == 1 && c.get(Calendar.DAY_OF_WEEK) == 2 && c.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 3) { System.out.print("P "); }
                else
                    if (c.get(Calendar.MONTH) == n - 1 && c.get(Calendar.DAY_OF_MONTH) == p + 1) System.out.print("E");
                else if (c.get(Calendar.MONTH) == 4
                && c.get(Calendar.DAY_OF_WEEK) == 2)
                    System.out.print("M ");
                else if (c.get(Calendar.MONTH) == 6 && c.get(Calendar.DAY_OF_MONTH) == 4) {
                    System.out.print("I ");
                } else if (c.get(Calendar.MONTH) == 8 && c.get(Calendar.DAY_OF_WEEK) == 2 && c.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 1) {
                 System.out.print("L ");
                } else if (c.get(Calendar.MONTH) == 9 && c.get(Calendar.DAY_OF_WEEK) == 2 && c.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 2)
                    System.out.print("C ");
                else
                if (c.get(Calendar.MONTH) == 10 && c.get(Calendar.DAY_OF_MONTH) == 11) {
                    System.out.print("V "); } else
                if (c.get(Calendar.MONTH) == 10 && c.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY && c.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 4)
                    System.out.print('T');
                else if (c.get(Calendar.MONTH) == 11 && c.get(Calendar.DAY_OF_MONTH) == 25) {
                    System.out.print("X "); } else
                System.out.print("  ");
                if (c.get(Calendar.DAY_OF_WEEK) == 7) { System.out.println(); } c.add(Calendar.DAY_OF_MONTH, 1);
            }
            else { c.add(Calendar.DAY_OF_MONTH, 1);
            if (c.get(Calendar.DAY_OF_WEEK) == 7) { System.out.println(); }
            System.out.print("    ");
            }
            // System.out.println();
        }
        System.out.println(); }

}
