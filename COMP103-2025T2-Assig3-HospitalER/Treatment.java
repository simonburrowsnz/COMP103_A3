// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP103 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP103 - 2025T2, Assignment 3
 * Name:
 * Username:
 * ID:
 */

/**
 * A Treatment is an object with two fields:
 *   - the department the patient must be treated in, and
 *   - the time they will need to be treated.
 * While they are receiving the treatment, the time remaining will be reduced on each time tick
 * The initial treatment time is always at least 1 tick.
 */
public class Treatment {
    private String department;
    private int timeRemaining;

    /**
     * Constructor
     */
    public Treatment(String dept, int time){
        department = dept;
        timeRemaining = time;
    }

    /**
     * Return the department 
     */
    public String getDepartment(){return department;}

    /**
     * Return the treatment time remaining 
     */
    public int getTimeRemaining(){return timeRemaining;}

    /**
     * Advance the treatment by one time tick
     */
    public void advanceTime(){timeRemaining--;}

    /**
     * Return a string to print
     */
    public String toString(){return department+"("+timeRemaining+")";}
}
