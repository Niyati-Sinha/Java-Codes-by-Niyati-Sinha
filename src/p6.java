import java.util.Scanner;

//Control Flow
/* 90 and above -> grade = O
   80 to 89 -> grade = E
   70 to 79 -> grade = A
   60 to 69 -> grade = B
   59 and below -> print "Better Luck next time!"
 */
public class p6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number : ");
        int marks = sc.nextInt();
        int flag = 0;
        char grade=' ';
        if (marks >= 90)
            grade = 'O';
        else if (marks >= 80)
            grade = 'E';
        else if (marks >= 70)
            grade = 'A';
        else if (marks >= 60)
            grade = 'B';
        else {
            flag = -1;
            System.out.println("Better luck next time!");
        }
        if (flag != -1)
            System.out.println("I am have got " + grade + " grade in Mathematics");
    }
}
