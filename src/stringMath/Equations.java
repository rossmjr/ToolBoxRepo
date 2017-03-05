package stringMath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Equations {
	
	public Stack<String> operators = new Stack<>();
	public Queue<String> output = new LinkedList<String>();
	public ArrayList<String> tokens = new ArrayList<>();
	
	public HashMap<String, Integer> order = new HashMap<>();
	
	private void fillOrder(){
		order.put("+", 0);
		order.put("-", 0);
		order.put("*", 1);
		order.put("/", 1);
		order.put("^", 2);
	}
	
	public void equation(String equation){
		String[] symbols = equation.split(" ");
		for(int x = 0; x < symbols.length; x++){
			tokens.add(symbols[x]);
		}
		
		while(!tokens.isEmpty()){
			for(String token : tokens){
				if(!token.equals(order.keySet())){
					output.add(token);
				}
				
				if(token.equals(order.keySet())){
					while(!operators.isEmpty()){
						if(order.get(token).intValue() > order.get(operators.peek()).intValue()){
							output.add(operators.pop());
							operators.push(token);
						}else{
							operators.push(token);
						}
					}
					
					if(token.equals("(")){
						operators.push(token);
					}
					
					if(token.equals(")")){
						while(operators.peek() != "("){
							output.add(operators.pop());
							operators.pop();
						}
					}
					
					while(!operators.isEmpty()){
						output.add(operators.pop());
					}
				}
			}
		}
	}	
}

