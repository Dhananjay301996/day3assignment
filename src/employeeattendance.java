
import java.util.*;

public class employeeattendance {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter 1 for Present");
        int a = obj.nextInt();

        if (a==1){
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
}
