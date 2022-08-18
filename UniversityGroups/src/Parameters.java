import java.util.Scanner;

public class Parameters {
    private String groupName;
     private int startYear;
    private int endYear;
    private String[] studentsArray;
    Scanner sc = new Scanner(System.in);

    public String getGroupName() {
        return groupName;
    }
    public int getStartYear() {
        return startYear;
    }
    public int getEndYear() {
        return endYear;
    }
    public String[] getStudentsArray() {
        return studentsArray;
    }

    public Parameters (String groupName, int startYear) {
        this. groupName=groupName;
        this. startYear=startYear;
        endYear=startYear+5;
    }
     public Parameters ( String groupName, int startYear, String [] studentsArray) {
         this. groupName=groupName;
         this. startYear=startYear;
         this. studentsArray=studentsArray;
          endYear=startYear+5;
     }
     public void getGroupDescription () {
         System.out.println("\n" +"Group info: ");
         System.out.println("\n" +groupName);
         System.out.println(startYear);
         System.out.println(endYear);
        addStudents();
         for (int i = 0; i < studentsArray.length; i++) {
             System.out.print(studentsArray[i] + " ");
         }
     }
         public String[] addStudents (){
             if (studentsArray==null){
                 System.out.println("There is no students in this group. Please enter the students' names to add: ");
                 String StudentName = sc.nextLine();
                 studentsArray=StudentName.split (", ");
         }  return studentsArray;

     }}



