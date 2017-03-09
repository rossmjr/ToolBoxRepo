package stringMath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Equations {

	private Stack<String> operators = new Stack<>();
	private Queue<String> output = new LinkedList<String>();
	private ArrayList<String> tokens = new ArrayList<>();
	private HashMap<String, Integer> order = new HashMap<>();

	private void fillOrder() {
		order.put("+", 0);
		order.put("-", 0);
		order.put("*", 1);
		order.put("/", 1);
		order.put("^", 2);
	}
	
	/**
	 * @param equation - The equation that will be solved.
	 * Add a space between every character. Only accepts operators and numbers.
	 * @return  Returns the answer to the equation as a String.
	 */

	public void equation(String equation) {
		fillOrder();
		
		String[] symbols = equation.split(" ");
		for (int x = 0; x < symbols.length; x++) {
			tokens.add(symbols[x]);
		}
		
		Iterator<String> iter = operators.iterator();
		Iterator<String> token = tokens.iterator();

			while (token.hasNext()) {
				String currentToken = token.next();
				
				if(currentToken.equals("(")){
					operators.push(currentToken);
				}
		
				if (currentToken.equals(")")) {
					while (!operators.peek().equals("(")) {
						output.add(operators.pop());
					}
					operators.pop();
				}

					try{
						int num = Integer.parseInt(currentToken);
						output.add(currentToken);
					}catch(NumberFormatException n){
						if (order.containsKey(currentToken)) {
							if (!operators.isEmpty()) {
									if (order.containsKey(operators.peek()) && order.get(currentToken) < order.get(operators.peek())) {
										while(iter.hasNext()){
											output.add(operators.pop());
										}
									}else if(order.containsKey(operators.peek()) && currentToken.equals(operators.peek())){
										//^^This needs to compare the key of the currentToken, which it does not.
										operators.push(currentToken);
									}else if(order.containsKey(operators.peek()) && order.get(currentToken) == order.get(operators.peek())){
										//^^This needs to compare the values of the currentToken, which is used by the .get()
										output.add(operators.pop());
										operators.push(currentToken);
									}else{
										operators.push(currentToken);
									}
							}else{
								operators.push(currentToken);
							}
						}
					}
				
			}
		
		while (!operators.isEmpty()) {
			output.add(operators.pop());
		}
		
//		System.out.println(solve());
	}
	
	public String solve(){
		Stack<Double> solvingEquation = new Stack<>();
		Iterator<String> postfix = output.iterator();
		String tokens = "";
		
		while(postfix.hasNext()){
			tokens += (output.remove() + " ");
		}
		
		String[] equation = tokens.split(" ");
		
		for(String token : equation){
			double tokenNum = 0;
			try{
				tokenNum = Double.parseDouble(token);
				solvingEquation.push(tokenNum);
			}catch(NumberFormatException n){
				if(token.equals("*")){
					double operand2 = solvingEquation.pop();
					double operand1 = solvingEquation.pop();
					solvingEquation.push(operand1 * operand2);
				}else if(token.equals("/")){
					double operand2 = solvingEquation.pop();
					double operand1 = solvingEquation.pop();
					solvingEquation.push(operand1 / operand2);
				}else if(token.equals("-")){
					double operand2 = solvingEquation.pop();
					double operand1 = solvingEquation.pop();
					solvingEquation.push(operand1 - operand2);
				}else if(token.equals("+")){
					double operand2 = solvingEquation.pop();
					double operand1 = solvingEquation.pop();
					solvingEquation.push(operand1 + operand2);
				}else if(token.equals("^")){
					double operand2 = solvingEquation.pop();
					double operand1 = solvingEquation.pop();
					solvingEquation.push(Math.pow(operand1, operand2));
				}else{
					System.out.println("An unexpected error has occurred");
				}
			}
		}
		
		double answer = solvingEquation.pop();
		String result = Double.toString(answer);
		
		return result;
	}
}
