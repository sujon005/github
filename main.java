import model.Student;
import model.Job;
import service.StudentService;
import service.JobService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        JobService jobService = new JobService();

        while (true) {
            System.out.println("\n===== STUDENT SKILL MARKETPLACE =====");
            System.out.println("1. Register Student");
            System.out.println("2. Post Job");
            System.out.println("3. View Jobs");
            System.out.println("4. View Students");
            System.out.println("5. Auto Match Students (by Skill)");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Student Name: ");
                    String sname = sc.nextLine();

                    System.out.print("Skill: ");
                    String skill = sc.nextLine();

                    studentService.registerStudent(
                        new Student(sid, sname, skill)
                    );
                    break;

                case 2:
                    System.out.print("Job ID: ");
                    int jid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Job Title: ");
                    String title = sc.nextLine();

                    System.out.print("Required Skill: ");
                    String rskill = sc.nextLine();

                    jobService.postJob(
                        new Job(jid, title, rskill)
                    );
                    break;

                case 3:
                    jobService.viewJobs();
                    break;

                case 4:
                    studentService.viewStudents();
                    break;

                case 5:
                    System.out.print("Enter required skill: ");
                    String reqSkill = sc.nextLine();
                    studentService.matchStudents(reqSkill);
                    break;

                case 6:
                    System.out.println("🚀 Thank you for using the platform!");
                    return;

                default:
                    System.out.println("❌ Invalid option");
            }
        }
    }
}
