package a00001;

import java.util.Scanner;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String [] arTime     = new String[5];
		double [] arDist1    = new double[5];
		double  arDistDAll = 0;
		int     fare = 0;
		for (int i1 = 0; i1 < 5; i1++) {
			try {
				Scanner sc = new Scanner(System.in);
				arTime[i1]  = sc.nextLine();
				arDist1[i1]  = sc.nextDouble();
				
				Check ch = new Check();
				Check ch1 = ch.inCheck(arTime[i1],arDist1[i1]);
				if (ch1.eCode1>0) {
					error(ch1.eCode1);
				}
				if (ch1.eCode2>0) {
					error(ch1.eCode2);
				}
				
				arDistDAll = arDistDAll + arDist1[i1];
				System.out.println(arDistDAll);
			}catch(Exception e) {
				error(001);
			}
		}
			if (arDistDAll>0 || arDistDAll<=1052) {
				fare = 410;
		} else if(arDistDAll >1052 || arDistDAll<=1289) {
				fare = 410 + 490;
		} else if(arDistDAll >1052 || arDistDAll<=1289) {
			fare = 410 + 490 +570;
		}
		System.out.println(fare);
	}
	
	public static void error(int eCode) {
		if (eCode==001) {
			System.out.println("標準入力のエラー");
		}  else if(eCode==002) {
			System.out.println("入力値「時間」が妥当ではない");
		}	else if(eCode==003) {
			System.out.println("入力値「距離」が妥当ではない");
		}
	
	}
}

class Check{
	int eCode1;
	int eCode2;
	public  Check inCheck(String in1,double in2) {
		Check ch = new Check();
		System.out.println(in1);
		System.out.println(in2);
//		if (in1990000000) {
//			ch.eCode1 = 002;
//		}
		 if (in2>=0 || in2<=99.9) {
		} else {
			ch.eCode2 = 003;
		}
		return ch;
	}
}

	

