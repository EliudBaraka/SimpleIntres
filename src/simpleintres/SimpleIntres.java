package simpleintres;
import java.util.Scanner;

public class SimpleIntres {

	//class attributes
		private double p;
		private double r;
		private double t;
		
		//Constructor of the class
		SimpleIntres(double p, double r, double t) {
			this.p = p;
			this.r = r;
			this.t = t;
		}
		
		//Method declaration
		public void simpleInterest() {
			double si;
			si = (p * r * t) / 100;
			
			if(p < 0 || r < 0 || t < 0) {
				System.out.println("INVALID INPUT!");
			}
			else {
				System.out.println("Simple Interest: " + si);
			}
		}
		
		//Main  method
		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
						
				//variable declaration
				double p;
				double t;
				double r;
				
				System.out.print("Enter the principle amount: ");
				p = sc.nextDouble();
				
				System.out.print("Enter the interest rate: ");
				r = sc.nextDouble();
				
				System.out.print("Enter the duration period: ");
				t = sc.nextDouble();
				
				
				
				//object of a class
				SimpleIntres interest = new SimpleIntres(p, r, t);
				
				System.out.println();
				
				interest.simpleInterest();//function call
			}
		}


