package projecteulerproblem2;

public class ProjectEulerProblem2 {

    public static void main(String[] args) {
        int max = 4000000;
        int prev = 1;
        int num = 2;
        int sum = 2;

        while (sum < max && sum + num < max) {
            int tmp = num;
            num = prev + tmp;
            prev = tmp;

            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
