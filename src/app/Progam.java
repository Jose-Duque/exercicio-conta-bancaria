package app;

import java.util.Locale;
import java.util.Scanner;
import entities.ContaBancaria;

public class Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaBancaria conta;
		double deposit;

		System.out.print("Enter account number: ");
		int account = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char thereDeposit = sc.next().charAt(0);

		if (thereDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			conta = new ContaBancaria(account, name, deposit);
			System.out.println("Account data:");
			System.out.println(conta);

		} else {
			conta = new ContaBancaria(account, name);
			System.out.println("Account data:");
			System.out.println(conta);
		}
		System.out.println();
	

		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		conta.depositValue(deposit);
		System.out.println("Updated account data:");
		System.out.println(conta);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		conta.withdrawValue(deposit);
		System.out.println("Updated account data:");
		System.out.println(conta);

		sc.close();
	}

}