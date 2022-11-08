package pairSumBST;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pairSumMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BSTUtil bst = new BSTUtil();
		System.out.println("Enter numbers to insert to bst , enter anything else when finished");

		try {

			while (true) {
				int num = sc.nextInt();
				bst.insert(num);
			}
		} catch (InputMismatchException ex) {
			System.out.println("Inorder traversal of Binary Search Tree:");
			bst.getInorder();
		}

		System.out.println();
		System.out.println("Enter Desired Sum:");
		sc.nextLine();
		int sum = sc.nextInt();
		sc.close();
		bst.findPairSum(bst.parentNode, sum);

	}

}
