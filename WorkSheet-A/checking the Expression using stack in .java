 a java code to Check the given below expression is balanced or not . (using stack)
{ { [ [ ( ( ) ) ] ) } }?
     
public class BalancedExpressionChecker {

   public static void main(String[] args) {
      String expression = "{{[[(())]]}}";
      boolean isBalanced = checkBalanced(expression);
      if (isBalanced) {
         System.out.println("The expression is balanced.");
      } else {
         System.out.println("The expression is not balanced.");
      }
   }

   public static boolean checkBalanced(String expression) {
      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < expression.length(); i++) {
         char c = expression.charAt(i);
         if (c == '{' || c == '[' || c == '(') {
            stack.push(c);
         } else if (c == '}' || c == ']' || c == ')') {
            if (stack.isEmpty()) {
               return false;
            } else if (c == '}' && stack.peek() == '{' ||
                       c == ']' && stack.peek() == '[' ||
                       c == ')' && stack.peek() == '(') {
               stack.pop();
            } else {
               return false;
            }
         }
      }
      return stack.isEmpty();
   }
}
