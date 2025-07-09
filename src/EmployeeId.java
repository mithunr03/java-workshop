import java.util.Arrays;

public class EmployeeId {
    public static void main(String[]args){
        String[][]employees = new String[5][2];
        employees[0][0]="jack";
        employees[0][1]="12001";
        employees[1][0]="achu";
        employees[1][1]="12002";
        employees[2][0]="mithun";
        employees[2][1]="12003";
        employees[3][0]="kate";
        employees[3][1]="12004";
        employees[4][0]="locke";
        employees[4][1]="12004";
        for(String[]employee :employees){
            System.out.println(Arrays.toString(employee));
        }

    }

    
    
    
}
