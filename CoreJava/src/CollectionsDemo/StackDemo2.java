package CollectionsDemo;

import java.util.Stack;

/**
 * Author:Paspunoori.Shankar
 * Date  :5 Nov 2024
 * Time  :3:32:31 pm
 * Email :paspunoori.shankar@coforge.com
 */
public class StackDemo2 {

	public static void main(String[] args) {

		Stack<String> stackOfCards = new Stack<>();

		stackOfCards.push("Jack");
		stackOfCards.push("Queen");
		stackOfCards.push("King");
		stackOfCards.push("Ace");

		System.out.println("Stack : " + stackOfCards);

		// Check if the Stack is empty
		System.out.println("Is Stack empty? : " + stackOfCards.isEmpty());

		// Find the size of Stack
		System.out.println("Size of Stack : " + stackOfCards.size());

		// Search for an element
		// The search() method returns the 1-based position of the element from the top of the stack
		// It returns -1 if the element was not found in the stack
		int position = stackOfCards.search("Queen");

		if(position != -1) {
			System.out.println("Found the element \"Queen\" at position : " + position);
		} else {
			System.out.println("Element not found");
		}

		// Popping items from the Stack
		String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
		System.out.println("Stack.pop() => " + cardAtTop);
		System.out.println("Current Stack => " + stackOfCards);
		System.out.println();

		// Get the item at the top of the stack without removing it
		cardAtTop = stackOfCards.peek();
		System.out.println("Stack.peek() => " + cardAtTop);
		System.out.println("Current Stack => " + stackOfCards);












	}

}