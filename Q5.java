import java.util.Arrays;
import java.util.Scanner;
class Node{
	Node left,right;
	public int info;
	Node(int info){
		this.info=info;
		left=right=null;
	}
	
}
class Tree{
	Node root;
	Tree(){
		root=null;
	}
	void preorder() {
		preorderRec(root);
	}
	void preorderRec(Node root) {
		if(root!=null) {
			System.out.print(root.info+" ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}
	void create(int info) {
		root=createTree(root,info);
	}
	public Node createTree(Node root,int info) {
		if(root==null) {
			root=new Node(info);
			return root;
		}
		if(info<root.info) {
			root.left=createTree(root.left,info);
		}
		if(info>root.info) {
			root.right=createTree(root.right,info);
		}
		return root;
		
	}
	
}
public class Q5 {
	public static void printArr(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of elements in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		printArr(a);
		Tree t=new Tree();
		for(int i=0;i<a.length;i++) {
			t.create(a[i]);
		}
		System.out.println("preorder");
		t.preorder();
		sc.close();
		
	}

}
