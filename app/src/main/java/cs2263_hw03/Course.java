package cs2263_hw03;

import java.util.Arrays;

/**
 * @author Victoria Weir
 * in this class, it will be able to store the information about a single course
 */
public class Course {
    public static String [] id = {"CS", "MATH", "CHEM", "PHYS", "BIOL", "EE"};
    public static String [] departments = {"Computer Science", "Mathematics", "Chemistry", "Physics", "Biology", "Electrical Engineering"};



    //setters and getters
    private String name;
    private String ID;
    private int number;
    private int credits;

    /**
     *
     * @param name - sets the course name
     * @param ID - sets the code of the course
     * @param number - sets the number of the course
     * @param credits - sets how many credits for the course
     *
     */
    public Course(String name, String ID, int number, int credits){
        this.name = name;
        this.ID = ID;
        this.number = number;
        this.credits = credits;
    }

    /**
     *
     * @param name- sets the name
     * For the rest of the code, I am setting whatever input is put inside and updating it. Also creating a way to get it.
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + Arrays.toString(id) +
                ", departments=" + Arrays.toString(departments) +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", number=" + number +
                ", credits=" + credits +
                '}';
    }
}
