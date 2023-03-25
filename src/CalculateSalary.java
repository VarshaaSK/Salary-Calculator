import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] weekdays = new int[7];

        double totalSalary = 0;
        double sundayBonus = 0;
        double saturdayBonus = 0;
        int remainingDays = 0;
        int totalHours = 0;

        System.out.println("Enter the Hours : ");
        for(int iterator = 0 ; iterator < weekdays.length; iterator++){
            weekdays[iterator] = scan.nextInt();
            totalHours += weekdays[iterator];
        }


        if(weekdays[0] != 0){
            sundayBonus = (weekdays[0]*100)*0.50;
            totalSalary = totalSalary + sundayBonus + (weekdays[0]*100);
        }
        if(weekdays[6] != 0){
            saturdayBonus = (weekdays[6]*100)*0.25;
            totalSalary = totalSalary + saturdayBonus + (weekdays[6]*100);
        }

        for(int weekIterator = 1 ; weekIterator < weekdays.length-1 ; weekIterator++){

                if(totalHours > 40){
                    totalSalary += 25;
                }
                if(weekdays[weekIterator] > 8){
                    remainingDays = weekdays[weekIterator] - 8;
                    totalSalary = totalSalary + 800 + (remainingDays * 115);
                }
                if(weekdays[weekIterator] <= 8){
                    totalSalary += weekdays[weekIterator]*100;
                }

        }
        System.out.println("Total Salary : " + totalSalary);
    }
}