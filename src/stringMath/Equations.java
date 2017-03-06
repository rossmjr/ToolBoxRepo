package stringMath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import programUtils.ProgramUtil;
import programUtils.TryParseIntResult;

public class Equations {

	public Stack<String> operators = new Stack<>();
	public Queue<String> output = new LinkedList<String>();
	public ArrayList<String> tokens = new ArrayList<>();

	public HashMap<String, Integer> order = new HashMap<>();

	private void fillOrder() {
		order.put("+", 0);
		order.put("-", 0);
		order.put("*", 1);
		order.put("/", 1);
		order.put("^", 2);
		order.put("(", 3);
		order.put(")", 3);
	}

	public void equation(String equation) {
		fillOrder();
		String[] symbols = equation.split(" ");
		for (int x = 0; x < symbols.length; x++) {
			tokens.add(symbols[x]);
		}

		while (!tokens.isEmpty()) {
			for (String token : tokens) {
				if (!order.containsKey(token)) {
					output.add(token);
				}

				if (order.containsKey(token)) {
					if (!operators.isEmpty()) {
						if (order.get(token).intValue() < order.get(operators.peek()).intValue()) {
							for(String stackToken : operators){
								output.add(stackToken);	
								operators.pop();
							}
						}
						operators.push(token);
					} else {
						operators.push(token);
					}

					if (token.equals("(")) {
						operators.push(token);
					}

					if (token.equals(")")) {
						operators.pop();
						while (operators.peek() != "(") {
							output.add(operators.pop());

						}
						operators.pop();
					}
				}
			}
		}
		while (!operators.isEmpty()) {
			output.add(operators.pop());
		}
	}
}
