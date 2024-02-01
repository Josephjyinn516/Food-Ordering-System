/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import Class.Student;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Stu_FileHandling {
    public static boolean createStudentData(String filePath, Student student) {
        try (FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(student.getStudentID() + "," + student.getStudentName() + "," + student.getSchoolEmail() + "," + student.getCreditBalance() + "," + student.getPassword() + "\n");
            return true; // Data saved successfully
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Error occurred while saving data
        }
    }
    
    // Inside Stu_FileHandling class
    public static ArrayList<Student> readStudentData(String filePath) {
        ArrayList<Student> students = new ArrayList<>();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            int lineNumber = 0;  // Add this counter for debugging
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                System.out.println("Read line " + lineNumber + ": " + line); // Debug statement

                String[] data = line.split(",");
                if (data.length == 5) {
                    String studentID = data[0];
                    String studentName = data[1];
                    String schoolEmail = data[2];
                    double creditBalance = Double.parseDouble(data[3]);
                    String password = data[4];
                    students.add(new Student(studentID, studentName, schoolEmail, creditBalance, password));
                } else {
                    System.out.println("Invalid data format at line " + lineNumber);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return students;
    }

    
//    public static boolean updateStudent(String filePath, ArrayList<Student> students) {
//        if (students.isEmpty()){
//            return true;
//        }
//        try (FileWriter fileWriter = new FileWriter(filePath);
//             BufferedWriter writer = new BufferedWriter(fileWriter)) {
//            for (Student student : students) {
//                writer.write(student.getStudentID() + "," + student.getStudentName() + "," + student.getSchoolEmail() + "," + student.getPassword() + "\n");
//            }
//            return true; // Data saved successfully
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            return false; // Error occurred while saving data
//        }
//    }
    
    public static boolean updateStudent(String filePath, ArrayList<Student> students) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Student student : students) {
                // Write each student's data to the file in the desired format
                writer.println(student.getStudentID() + "," + student.getStudentName() + "," + student.getSchoolEmail() + "," + student.getCreditBalance() + "," + student.getPassword());
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Handle the exception and return false if an error occurs
        }
    }
    
    public static boolean deleteStudentData(String filePath, String studentNameToDelete) {
        try {
            File inputFile = new File(filePath);
            File tempFile = new File("temp2.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean deleted = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 1 && data[0].equals(studentNameToDelete)) {
                    // Skip the line (delete data)
                    deleted = true;
                } else {
                    writer.write(line + System.lineSeparator());
                }
            }

            reader.close();
            writer.close();

            if (deleted) {
                if (inputFile.delete() && tempFile.renameTo(inputFile)) {
                    return true; // Data removed successfully
                } else {
                    return false; // Error renaming the temporary file
                }
            } else {
                return false; // Data not found for deletion
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Error occurred
        }
    }

}
