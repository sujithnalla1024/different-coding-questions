import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            Stack<Character> stack = new Stack<>();
            String line = scanner.nextLine();
            for(char c : line.toCharArray()) {
                if(c == '{' || c == '(' || c == '[') {
                   stack.push(c);
                   continue;
                }                    
                
                if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }
                
                if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    continue;
                }
                
                if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                    continue;
                }
                
                if(c == '}' || c == ')' || c == ']') {
                    stack.push(c);
                    break;
                }   
            }
            System.out.println(stack.isEmpty());
        }
    }
}

Second solution
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Parser{
   private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
    static {
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
    }  


    boolean checkParenthesesBalance(String str){
                final Stack<Character> stack = new Stack<Character>();
                for (int i = 0; i < str.length(); i++) {
                    if (brackets.containsKey(str.charAt(i))) {
                        stack.push(str.charAt(i));
                    } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
                        return false;
                    } 
                }
                return stack.empty();
        }
}
class Solution{

    public static void main(String []argh){
        Parser X=new Parser();
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(X.checkParenthesesBalance(in.next()));
        }

    }
}