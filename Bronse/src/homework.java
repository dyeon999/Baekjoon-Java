import java.util.Scanner;
// 5597
public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[30];
    
        for (int i = 0; i < 28; i++){
            int n = sc.nextInt();
            num[n - 1] = n;
        }

        for (int i = 0; i < 30; i++){
            if (num[i] == 0){
                System.out.println(i + 1);
            }
        }
    }
}
