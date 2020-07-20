package _01_random._6_lottery_numbers;



import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Random ran = new Random();
	
	int lotteryNumbers = 0;
	int lotteryNumber2 = 0;
	int lotteryNumber3 = 0;
	int lotteryNumber4 = 0;
	int lotteryNumber5 = 0;
	int lotteryNumber6 = 0;
	
	lotteryNumbers = ran.nextInt(99)+1;	
	lotteryNumber2= ran.nextInt(99)+1;	
	lotteryNumber3= ran.nextInt(99)+1;	
	lotteryNumber4= ran.nextInt(99)+1;	
	lotteryNumber5= ran.nextInt(99)+1;	
	lotteryNumber6= ran.nextInt(99)+1;	
		
	
	JOptionPane.showMessageDialog(null, lotteryNumbers +" "+ lotteryNumber2+" "+lotteryNumber3+" "+lotteryNumber4+" "+lotteryNumber5+" "+lotteryNumber6);

		
		
		
		
		
		
	}

}
