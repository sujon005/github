package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void registerStudent(Student s) {
        students.add(s);
        System.out.println("✅ Student registered successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(
                s.getId() + " | " +
                s.getName() + " | Skill: " +
                s.getSkill()
            );
        }
    }

    // 🔥 Skill-based auto matching
    public void matchStudents(String skill) {
        boolean found = false;
        System.out.println("\n🎯 Matched Students:");

        for (Student s : students) {
            if (s.getSkill().equalsIgnoreCase(skill)) {
                System.out.println(
                    s.getId() + " | " +
                    s.getName() + " | Skill: " +
                    s.getSkill()
                );
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ No students found with skill: " + skill);
        }
    }
}
