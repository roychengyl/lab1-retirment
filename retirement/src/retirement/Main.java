package retirement;

import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class Main {

	public static void main(String[] args) {
		double r_PV;
		double n_PV;
		double y_PV;
		double f_PV;
		double r_PMT;
		double n_PMT;
		double p_PMT;
		double f_PMT;
		boolean t;
		
		//defining the variables
		Scanner input = new Scanner( System.in );
		System.out.print("Enter the annual return(in decimal): ");
		r_PV = input.nextDouble()/12;
		System.out.print("Enter the years retired: ");
		n_PV = input.nextDouble()*12;
		System.out.print("Enter the Required Income - Monthly SSI: ");
		y_PV = input.nextDouble();
		System.out.print("Enter the principle: ");
		f_PV = input.nextDouble();
		t = false;
		
		//PV stands for present value
		double PV = FinanceLib.pv(r_PV,n_PV,y_PV,f_PV,t);
		
		System.out.println("PV: " + PV);
		
		
		System.out.print("Enter the annual return(in decimal): ");
		r_PMT = input.nextDouble()/12;
		System.out.print("Enter the years to work: ");
		n_PMT = input.nextDouble()*12;
		System.out.print("Enter the p_PMT: ");
		p_PMT = input.nextDouble();
		f_PMT = PV;
		t = false;
				
		//PMT stands for public static double
		double PMT = FinanceLib.pmt(r_PMT,n_PMT,p_PMT,f_PMT,t);
						
		System.out.println("PMT: " + PMT);
	}

}
