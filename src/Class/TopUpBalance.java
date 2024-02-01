/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import Class.Student;
import Class.Stu_FileHandling;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class TopUpBalance {
    public static void reloadCredit(String studentID, double reloadAmount){
        ArrayList<Student> students = Stu_FileHandling.readStudentData("Student Profile.txt");
        
        for (Student student: students){
            if(student.getStudentID().equals(studentID)){
                student.reloadCredit(reloadAmount);
                break;
            }
        }
        
        Stu_FileHandling.updateStudent("Student Profile.txt", students);
    }
    
    public static double getUpdatedCreditBalance(String studentID) {
        ArrayList<Student> students = Stu_FileHandling.readStudentData("Student Profile.txt");
        
        for (Student student: students){
            if(student.getStudentID().equals(studentID)){
                return student.getCreditBalance();
            }
        }
        
        return 0.0;
    }
    
}
