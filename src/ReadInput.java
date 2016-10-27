import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadInput {

	public static void main(String[] args) throws IOException {
		Reader.init(new FileInputStream(new File("data/input.txt")));
		Reader.setDelimeter("\t,");
		
		int year;
		double amount, rate = 5.0;
		double mPay, tPay, mRate;
		amount = Reader.nextDouble();
		year = Reader.nextInt();
		mRate = rate / 1200;
		mPay = (mRate * amount)/(1-(1/Math.pow(1 + mRate, year * 12)));
		tPay = mPay * (year * 12);
		
		System.out.printf("Loan Amount : %10.2f\n",amount);
		System.out.printf("Number of Years : %10d\n",year);
		System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
		System.out.printf("%15.2f\t\t%15.2f\t\t&15.2f\n",rate,mPay,tPay);
		
	}

}
