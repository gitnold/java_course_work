import java.util.Scanner;

public class StudentScoreSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Student 1 variables
        String regNo1, fullName1;
        int mark1_1, mark1_2, mark1_3, mark1_4, mark1_5, mark1_6, mark1_7;
        int total1;
        double average1;

        // Student 2 variables
        String regNo2, fullName2;
        int mark2_1, mark2_2, mark2_3, mark2_4, mark2_5, mark2_6, mark2_7;
        int total2;
        double average2;

        // Student 3 variables
        String regNo3, fullName3;
        int mark3_1, mark3_2, mark3_3, mark3_4, mark3_5, mark3_6, mark3_7;
        int total3;
        double average3;

        // Student 4 variables
        String regNo4, fullName4;
        int mark4_1, mark4_2, mark4_3, mark4_4, mark4_5, mark4_6, mark4_7;
        int total4;
        double average4;

        // Student 5 variables
        String regNo5, fullName5;
        int mark5_1, mark5_2, mark5_3, mark5_4, mark5_5, mark5_6, mark5_7;
        int total5;
        double average5;

        // Input for Student 1
        System.out.println("Enter details for Student 1:");
        System.out.print("Registration Number: ");
        regNo1 = scanner.nextLine();
        System.out.print("Full Name: ");
        fullName1 = scanner.nextLine();
        System.out.print("Mark 1: ");
        mark1_1 = scanner.nextInt();
        System.out.print("Mark 2: ");
        mark1_2 = scanner.nextInt();
        System.out.print("Mark 3: ");
        mark1_3 = scanner.nextInt();
        System.out.print("Mark 4: ");
        mark1_4 = scanner.nextInt();
        System.out.print("Mark 5: ");
        mark1_5 = scanner.nextInt();
        System.out.print("Mark 6: ");
        mark1_6 = scanner.nextInt();
        System.out.print("Mark 7: ");
        mark1_7 = scanner.nextInt();
        scanner.nextLine();

        total1 = mark1_1 + mark1_2 + mark1_3 + mark1_4 + mark1_5 + mark1_6 + mark1_7;
        average1 = total1 / 7.0;

        // Input for Student 2
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Registration Number: ");
        regNo2 = scanner.nextLine();
        System.out.print("Full Name: ");
        fullName2 = scanner.nextLine();
        System.out.print("Mark 1: ");
        mark2_1 = scanner.nextInt();
        System.out.print("Mark 2: ");
        mark2_2 = scanner.nextInt();
        System.out.print("Mark 3: ");
        mark2_3 = scanner.nextInt();
        System.out.print("Mark 4: ");
        mark2_4 = scanner.nextInt();
        System.out.print("Mark 5: ");
        mark2_5 = scanner.nextInt();
        System.out.print("Mark 6: ");
        mark2_6 = scanner.nextInt();
        System.out.print("Mark 7: ");
        mark2_7 = scanner.nextInt();
        scanner.nextLine();

        total2 = mark2_1 + mark2_2 + mark2_3 + mark2_4 + mark2_5 + mark2_6 + mark2_7;
        average2 = total2 / 7.0;

        // Input for Student 3
        System.out.println("\nEnter details for Student 3:");
        System.out.print("Registration Number: ");
        regNo3 = scanner.nextLine();
        System.out.print("Full Name: ");
        fullName3 = scanner.nextLine();
        System.out.print("Mark 1: ");
        mark3_1 = scanner.nextInt();
        System.out.print("Mark 2: ");
        mark3_2 = scanner.nextInt();
        System.out.print("Mark 3: ");
        mark3_3 = scanner.nextInt();
        System.out.print("Mark 4: ");
        mark3_4 = scanner.nextInt();
        System.out.print("Mark 5: ");
        mark3_5 = scanner.nextInt();
        System.out.print("Mark 6: ");
        mark3_6 = scanner.nextInt();
        System.out.print("Mark 7: ");
        mark3_7 = scanner.nextInt();
        scanner.nextLine();

        total3 = mark3_1 + mark3_2 + mark3_3 + mark3_4 + mark3_5 + mark3_6 + mark3_7;
        average3 = total3 / 7.0;

        // Input for Student 4
        System.out.println("\nEnter details for Student 4:");
        System.out.print("Registration Number: ");
        regNo4 = scanner.nextLine();
        System.out.print("Full Name: ");
        fullName4 = scanner.nextLine();
        System.out.print("Mark 1: ");
        mark4_1 = scanner.nextInt();
        System.out.print("Mark 2: ");
        mark4_2 = scanner.nextInt();
        System.out.print("Mark 3: ");
        mark4_3 = scanner.nextInt();
        System.out.print("Mark 4: ");
        mark4_4 = scanner.nextInt();
        System.out.print("Mark 5: ");
        mark4_5 = scanner.nextInt();
        System.out.print("Mark 6: ");
        mark4_6 = scanner.nextInt();
        System.out.print("Mark 7: ");
        mark4_7 = scanner.nextInt();
        scanner.nextLine();

        total4 = mark4_1 + mark4_2 + mark4_3 + mark4_4 + mark4_5 + mark4_6 + mark4_7;
        average4 = total4 / 7.0;

        // Input for Student 5
        System.out.println("\nEnter details for Student 5:");
        System.out.print("Registration Number: ");
        regNo5 = scanner.nextLine();
        System.out.print("Full Name: ");
        fullName5 = scanner.nextLine();
        System.out.print("Mark 1: ");
        mark5_1 = scanner.nextInt();
        System.out.print("Mark 2: ");
        mark5_2 = scanner.nextInt();
        System.out.print("Mark 3: ");
        mark5_3 = scanner.nextInt();
        System.out.print("Mark 4: ");
        mark5_4 = scanner.nextInt();
        System.out.print("Mark 5: ");
        mark5_5 = scanner.nextInt();
        System.out.print("Mark 6: ");
        mark5_6 = scanner.nextInt();
        System.out.print("Mark 7: ");
        mark5_7 = scanner.nextInt();

        total5 = mark5_1 + mark5_2 + mark5_3 + mark5_4 + mark5_5 + mark5_6 + mark5_7;
        average5 = total5 / 7.0;

        //C026-01-3456/2024

        var title = "Reg No.\t\t\t\tFull Name\t\tCCS 3432\tCCS 4562\tCCS 3453\tIGS 3454\tSMA 2345\tCCS 2216\tCCS 2207\tTOTALS\tAVERAGE\tSTATUS\tGRADE";

        System.out.println("\t\t\t\t\t\t\t\t\t\tDedan Kimathi Univrsity of Technology");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  School of Computer Science and IT");
        System.out.println("\t\t\t\t\t\t\t\t\t\t   Department of Computer Science");
        System.out.println("\t\t\t\t\t\t\t\t\t\t      Academic Year: 2025/2025");
        System.out.println("\t\t\t\t\t\t\t\t\t\tSTUDENT MARKSHEET (SECOND YEAR RESULTS)");

        // Display the score sheet
        System.out.println("\n\nStudent Score Sheet");
        System.out.println("-".repeat(title.length() + 100));

        System.out.println(title);
        System.out.println("-".repeat(title.length() + 100));

        System.out.println(regNo1 + "\t\t" + fullName1 + "\t\t" + mark1_1 + "\t\t" + mark1_2 + "\t\t" + mark1_3 + "\t\t" + mark1_4 + "\t\t" + mark1_5 + "\t\t" + mark1_6 + "\t\t" + mark1_7 + "\t\t" + total1 + "\t" + average1);

        System.out.println(regNo2 + "\t\t" + fullName2 + "\t\t" + mark2_1 + "\t\t" + mark2_2 + "\t\t" + mark2_3 + "\t\t" + mark2_4 + "\t\t" + mark2_5 + "\t\t" + mark2_6 + "\t\t" + mark2_7 + "\t\t" + total2 + "\t" + average2);

        System.out.println(regNo3 + "\t\t" + fullName3 + "\t\t" + mark3_1 + "\t\t" + mark3_2 + "\t\t" + mark3_3 + "\t\t" + mark3_4 + "\t\t" + mark3_5 + "\t\t" + mark3_6 + "\t\t" + mark3_7 + "\t\t" + total3 + "\t" + average3);

        System.out.println(regNo4 + "\t\t" + fullName4 + "\t\t" + mark4_1 + "\t\t" + mark4_2 + "\t\t" + mark4_3 + "\t\t" + mark4_4 + "\t\t" + mark4_5 + "\t\t" + mark4_6 + "\t\t" + mark4_7 + "\t\t" + total4 + "\t" + average4);

        System.out.println(regNo5 + "\t\t" + fullName5 + "\t\t" + mark5_1 + "\t\t" + mark5_2 + "\t\t" + mark5_3 + "\t\t" + mark5_4 + "\t\t" + mark5_5 + "\t\t" + mark5_6 + "\t\t" + mark5_7 + "\t\t" + total5 + "\t" + average5);


        System.out.println("-".repeat(title.length() + 100));

        scanner.close();
    }
}
