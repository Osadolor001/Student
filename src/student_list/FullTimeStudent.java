/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_list;

/**
 *
 * @author Osadolor Ebhuoma
 */
public class FullTimeStudent extends Student {
    private int numSemesters;
    
    public int getNumSemesters(){
        return numSemesters;
    }
    
    public void setNumSemesters(int numSemesters){
        this.numSemesters = numSemesters;
    }
    
}