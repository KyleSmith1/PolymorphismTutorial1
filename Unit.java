package polymorphismtutorialproblem1;

/**
 *
 * @author 14001835
 */
public class Unit {

    private String unitNumber;
    private String unitTitle;
    private Student classlist[] = new Student[10];
    private String result[] = new String[10];

    public Unit(String unos, String utitle) {
        unitNumber = unos;
        unitTitle = utitle;
    }

    public void addStudent(Student temp) {
        boolean space = false;
        for (int x = 0; x < classlist.length; x++) {
            if (classlist[x] == null) {
                classlist[x] = temp;
                space = true;
                break;
            }
        }
        if (space == true) {
            System.out.println("Student inserted");
        } else {
            System.out.println("No space available");
        }
    }

    public void displayAll() {

        System.out.println("Students enrolled in course " + unitNumber);
        for (int x = 0; x < classlist.length; x++) {
            if (classlist[x] != null) {
                System.out.println(classlist[x]);
            }
        }
    }

    public void displayStudent(Student studentNo) {
        for (int x = 0; x < classlist.length; x++) {
            System.out.println(classlist[x]);
        }

    }

    public void displayPassedStudents() {
        for (int x = 0; x < classlist.length; x++) {
            if (result[x].equals("P")) {
                System.out.println(classlist[x]);
            }
        }
    }
    
    public void displayPercentage(){
        int totalPass = 0;
        int percentage;
        for (int x = 0; x < result.length; x++) {
            if (result[x].equals("P")) {
                totalPass = totalPass + 1;
            }
        }
        percentage = (totalPass/result.length) * 100;
        System.out.println("Percentage success rate: " + percentage);
    }
    
    public void removeStudent(Student temp) {
        //???
        classlist = ArrayUtils.removeElement(classlist,temp);
       
    }
    

}
