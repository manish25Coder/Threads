package time;

public class Armstrong extends Thread {

	public void run() {
		System.out.println("armstrong numbers from 1 to 1000");
		for (int num = 1; num <= 1000; num++) {
			int temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println("Armstrong number: " + num);
            }
		}
	}
}
