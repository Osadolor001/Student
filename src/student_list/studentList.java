/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_list;

/**
 *
 * @author Osadolor Obiahon Ebhuoma
 */
public class studentList {
    public static void main (String[] args){
        /* I added comment on 7:21 */
        Student[] studentList = new Student[4];
        studentList[0] = new Student("1", "Osadolor Ebhuoma");
        studentList[1] = new Student("2", "John Doe");
        studentList[2] = new Student("3", "abc");
        
        for (int i = 0; i<studentList.length; i++)
        {
            System.out.println(studentList[i].getStudentName());
        }
              
    }
}
