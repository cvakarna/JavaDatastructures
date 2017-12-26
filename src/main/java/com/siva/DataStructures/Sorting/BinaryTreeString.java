package com.siva.DataStructures.Sorting;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryTreeString {
	public BinaryTreeString left, right;
	public String data;
	public static String[] strings = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"zero", "computer", "mouse", "screen", "laptop", "book", "decimal", "binary", "quake" };

	public static BinaryTreeString tree_AddString(BinaryTreeString r, String s) {
		if (r == null) {
			r = new BinaryTreeString();
			r.left = r.right = null;
			r.data = s;

		} else if (r.data.compareTo(s) < 0)
			r.right = tree_AddString(r.right, s);
		else
			r.left = tree_AddString(r.right, s);
		return r;
	}

	public static void tree_inOrderPrint(BinaryTreeString r) {
		if (r != null) {
			tree_inOrderPrint(r.left);
			System.out.println(r.data);
			tree_inOrderPrint(r.right);
		}

	}

	public static void tree_FileWriter(BinaryTreeString r, DataOutputStream output) throws IOException {
		if (r != null) {
			byte[] tmp = r.data.getBytes();
			output.writeInt(tmp.length);
			output.write(tmp);
			tree_FileWriter(r.left, output);
			tree_FileWriter(r.right, output);

		} else
			output.writeInt(0);
	}

	public static BinaryTreeString tree_FileRead(BinaryTreeString r, java.io.DataInputStream input) throws IOException {
		int n = input.readInt();
		if (n != 0) {
			byte[] tmp = new byte[n];
			input.read(tmp);
			r = new BinaryTreeString();
			r.data = new String(tmp);
			r.left = tree_FileRead(r.left, input);
			r.right = tree_FileRead(r.right, input);

		} else
			r = null;
		return r;

	}

	public static boolean tree_Compare(BinaryTreeString a, BinaryTreeString b) {
		if (a != null && b != null) {
			return a.data.compareTo(b.data) == 0 && tree_Compare(a.left, b.left) && tree_Compare(a.right, b.right);

		} else if (a == null && b == null)
			return true;
		else
			return false;
	}

	public static void readData() {
		File file = new File("BinaryTreeString.dat");

		// declare two trees, one named tree, the other named read_tree
		BinaryTreeString read_tree = null, tree = null;
		System.out.println("inserting...");
		for (int i = 0; i < strings.length; i++) {
			String s = new String(strings[i]);
			System.out.print(" " + s);
			tree = tree_AddString(tree, s);

		}
		System.out.print("tree:");
		System.out.println("writing to " + file);
		try {
			FileOutputStream f = new FileOutputStream(file);
			tree_FileWriter(tree, new DataOutputStream(f));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("read tree:");
		tree_inOrderPrint(read_tree);
		if (tree_Compare(tree, read_tree))
			System.out.println("the two trees are identical");
		else
			System.out.println("the two trees are different");
		System.out.println("done!!!");
	}

	public static void main(String[] args) {

		readData();
	}
}
