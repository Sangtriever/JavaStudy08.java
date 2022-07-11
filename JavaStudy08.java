// 제로베이스 과제 08번
// 연소득 과세금액 계산 프로그램
// 작성자 : 이상현
import java.util.Scanner;
public class 과제8 {
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int income;
        int tax=0;
        int tax2=0;
        int tax3=0;
        int remainder=0;
        char A = '%';


        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요 : ");
        income = in.nextInt();
        if(income <= 12000000) {
          tax = (int) (income*0.06);
            System.out.println(String.format("%11d *  6%s = %11d", income,A,tax));
        }else if(income <= 46000000){
            tax = (int) (720000+(income-12000000)*0.15);
            tax2 = (int) ((income-12000000)*0.15);
            remainder= income-12000000;
            System.out.println(String.format("   12000000 *  6%s =      720000", A));
            System.out.println(String.format("%11d * 15%s = %11d",  remainder,A,tax2));
        }else if(income <=88000000) {
            tax = (int) (5820000+(income-46000000)*0.24);
            tax2 = (int) ((income-46000000)*0.24);
            remainder= income-46000000;
            System.out.println(String.format("   12000000 *  6%s =      720000", A));
            System.out.println(String.format("   34000000 * 15%s =     5100000", A));
            System.out.println(String.format("%11d * 24%s = %11d",  remainder,A,tax2));
        } else if (income <= 150000000) {
            tax = (int) (15900000+(income-88000000)*0.35);
            tax2 = (int) ((income-88000000)*0.35);
            remainder= income-88000000;
            System.out.println(String.format("   12000000 *  6%s =      720000", A));
            System.out.println(String.format("   34000000 * 15%s =     5100000", A));
            System.out.println(String.format("   42000000 * 24%s =    10080000", A));
            System.out.println(String.format("%11d * 35%s = %11d",  remainder,A,tax2));
        }else if (income <= 300000000) {
            tax = (int) (37600000+(income-150000000)*0.38);
            tax2 = (int) ((income-150000000)*0.38);
            remainder= income-150000000;
            System.out.println(String.format("   12000000 *  6%s =      720000", A));
            System.out.println(String.format("   34000000 * 15%s =     5100000", A));
            System.out.println(String.format("   42000000 * 24%s =    10080000", A));
            System.out.println(String.format("   62000000 * 35%s =    21700000", A));
            System.out.println(String.format("%11d * 38%s = %11d",  remainder,A,tax2));
        }else if (income <= 500000000) {
            tax = (int) (94000000+(income-300000000)*0.4);
            tax2 = (int) ((income-300000000)*0.4);
            remainder= income-300000000;
            System.out.println(String.format("   12000000 *  6%s =      720000", A));
            System.out.println(String.format("   34000000 * 15%s =     5100000", A));
            System.out.println(String.format("   42000000 * 24%s =    10080000", A));
            System.out.println(String.format("   62000000 * 35%s =    21700000", A));
            System.out.println(String.format("  150000000 * 38%s =    57000000", A));
            System.out.println(String.format("%11d * 40%s = %11d",  remainder,A,tax2));
        }else if (income <= 1000000000) {
            tax = (int) (174600000+(income-500000000)*0.42);
            tax2 = (int) ((income-500000000)*0.42);
            remainder= income-500000000;
            System.out.println(String.format("   12000000 *  6%s =      720000", A));
            System.out.println(String.format("   34000000 * 15%s =     5100000", A));
            System.out.println(String.format("   42000000 * 24%s =    10080000", A));
            System.out.println(String.format("   62000000 * 35%s =    21700000", A));
            System.out.println(String.format("  150000000 * 38%s =    57000000", A));
            System.out.println(String.format("  200000000 * 40%s =    80000000", A));
            System.out.println(String.format("%11d * 42%s = %11d",  remainder,A,tax2));
        }else{
            tax = (int) (384600000+(income-1000000000)*0.45);
            tax2 = (int) ((income-1000000000)*0.45);
            remainder= income-1000000000;
            System.out.println(String.format("   12000000 *  6%s =      720000", A));
            System.out.println(String.format("   34000000 * 15%s =     5100000", A));
            System.out.println(String.format("   42000000 * 24%s =    10080000", A));
            System.out.println(String.format("   62000000 * 35%s =    21700000", A));
            System.out.println(String.format("  150000000 * 38%s =    57000000", A));
            System.out.println(String.format("  200000000 * 40%s =    80000000", A));
            System.out.println(String.format("  500000000 * 42%s =   210000000", A));
            System.out.println(String.format("%11d * 45%s = %11d", remainder,A,tax2));

        }
        System.out.println("----------------------------------------------");
        System.out.println(String.format("[세율에 의한 세금] :             %11d",tax));
        //누진공제
        if(income <= 12000000) {
            tax3 = (int) (income*0.6);

        }else if (income <= 46000000) {
            tax3 = (int) (income*0.15-1080000);

        }else if (income <= 88000000) {
            tax3 = (int) (income*0.24-5220000);

        }else if (income <= 150000000) {
            tax3 = (int) (income*0.35-14900000);

        }else if (income <= 300000000) {
            tax3 = (int) (income*0.38-19400000);

        }else if (income <= 500000000) {
            tax3 = (int) (income*0.40-25400000);

        }else if (income <= 1000000000) {
            tax3 = (int) (income*0.42-35400000);

        }else {
            tax3 = (int) (income*0.45-65400000);
        }
        System.out.println(String.format("[누진공제 계산에 의한 세금] :     %11d",tax3));
    }
    }




