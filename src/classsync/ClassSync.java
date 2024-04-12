/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classsync;

import java.util.HashMap;
import java.util.Map;


public class ClassSync {
    
    public static void main(String[] args) {        
        int currentX = 300;
        int currentY = 250;

        loginjf loginFrame = new loginjf();
        loginFrame.setLocation(currentX, currentY);
        loginFrame.setVisible(true);
    }  
    // Define a static map to store student IDs and passwords
    private static final Map<String, String> students = new HashMap<>();

    // Method to add a student to the map
    public static void addStudent(String studentId, String password) {
        students.put(studentId, password);
    }

    // Method to check if a student with the given ID exists in the map
    public static boolean studentExists(String studentId) {
        return students.containsKey(studentId);
    }

    // Method to get the password of a student with the given ID from the map
    public static String getStudentPassword(String studentId) {
        return students.get(studentId);
    }    
}