package BinarySearchTree;


public class MyBinaryTreeTest {

	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<Integer>();
		myBinaryTree.add(56); //adding 56 as root node
		myBinaryTree.add(30); //adding 30 as left child
		myBinaryTree.add(70); //adding 70 as right child
		System.out.println("size of tree is "+myBinaryTree.getSize());

	}

}