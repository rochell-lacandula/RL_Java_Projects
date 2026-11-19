import java.util.Scanner;
 
public class Average {
    public static void main(String[] args) {
 
Scanner sc = new Scanner(System.in);
 
        // Declare 3D array
        int[][][] ThreeD = new int[2][3][3];
 
        String[] subs = {"Java", "Database", "Networking"};
 
        // Input student grades
        for (int sec = 0; sec < 2; sec++) {
            System.out.println("\nSECTION " + (sec + 1));
 
            for (int stu = 0; stu < 3; stu++) {
                System.out.println("\nStudent " + (stu + 1));
 
                for (int sub = 0; sub < 3; sub++) {
                    System.out.print(subs[sub] + ": ");
                    ThreeD[sec][stu][sub] = sc.nextInt();
                }
            }
        }
 
        // Display grades and calculate averages
        for (int sec1 = 0; sec1 < 2; sec1++) {
 
            System.out.println("\nSECTION " + (sec1 + 1));
            System.out.println("------------------------------");
 
            double secTotal = 0;
 
            for (int stu1 = 0; stu1 < 3; stu1++) {
 
                int stuTotal = 0;
 
                System.out.println("\nStudent" + (stu1 + 1));
 
                for (int sub1 = 0; sub1 < 3; sub1++) {
 
                    System.out.println(subs[sub1] + ": "
                            + ThreeD[sec1][stu1][sub1]);
 
                    stuTotal += ThreeD[sec1][stu1][sub1];
                }
 
                // Calculate and Display student average
                double stuAverage = stuTotal / 3.0;
                System.out.printf("Student Average: %.2f%n",
                        stuAverage);
 
                // Add student average to section total
                secTotal += stuAverage;
            }
 
            // Calculate and Display section average
            System.out.println();
            double secAverage = secTotal / 3.0;
            System.out.printf("Section Average: %.2f%n",
                    secAverage);
        }
 
        sc.close();
    }
}