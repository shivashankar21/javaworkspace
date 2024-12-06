package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author:Paspunoori.Shankar
* Date  :24 Oct 2024
* Time  :11:36:24 am
* Email :paspunoori.shankar@coforge.com
*/
public class SimpleInterest {
	public static void main(String[] args) throws IOException {

        String name;
        double loan,si;
        int term,rate;

        //Create InputStreamReader Object to read characters from Console
        InputStreamReader reader=new InputStreamReader(System.in);

        //Create BufferedReader Object to read lines/data from InputStreamReader
        BufferedReader br=new BufferedReader(reader);

        System.out.println("Enter Customer Name    : ");
        name=br.readLine();                        //String Input
        System.out.println("Enter Loan Amount      :");
        loan=Double.parseDouble(br.readLine());   //Double data type Input
        System.out.println("Enter Loan Term        :");
        term=Integer.parseInt(br.readLine());     //Integer data type Input
        System.out.println("Enter Rate of Interest :");
        rate=Integer.parseInt(br.readLine());     //Integer data type Input

        if(loan > 100000) {
            si = (loan * term * rate) / 100;

            System.out.println("************ Simple Interest Calculation ************");
            System.out.println("Customer Name           : " + name);
            System.out.println("Loan Amount             : " + loan);
            System.out.println("Term                    : " + term);
            System.out.println("Rate of Interest        : " + rate);
            System.out.println("-----------------------------------------------------");
            System.out.println("Simple Interest         : " + si);
            System.out.println("*****************************************************");
        }
        else{
            System.out.println("Not Eligible for Loan. Please avail above 1 Lac");
        }
        br.close();


	}

}
