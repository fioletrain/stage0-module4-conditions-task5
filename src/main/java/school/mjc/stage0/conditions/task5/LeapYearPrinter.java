package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int a;
        if((year % 4) == 0){
            a = 1;
            if (year % 100 == 0){
                if (year % 400 != 0){
                    a = 2;
                }
            }
        } else {
            a = 2;
        }

        switch (a){
            case (1):
                System.out.println("leap");
                break;
            case (2):
                System.out.println("not leap");
                break;
        }
    }
}
