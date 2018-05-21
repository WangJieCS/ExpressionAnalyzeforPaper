public class Test2 {  
      
    public static void main(String[] args){  
          
       
    	String   resultStr ="sqrt(4)*3-5*(6-2)*cbrt(8)*(6-2)";
    	System.out.println(resultStr);
        System.out.println(ExpressionEvaluator.CalcExpression(ExpressionEvaluator.parse(resultStr)));  
        
    	resultStr ="-3+sqrt(4)*2-4";
    	System.out.println(resultStr);
        System.out.println(ExpressionEvaluator.CalcExpression(ExpressionEvaluator.parse(resultStr)));  
        
        resultStr ="A+sqrt(x)*2-4.2";
        System.out.println(resultStr);

        resultStr ="A+sqrt(x)*4-6";
        System.out.println(resultStr);

        ExpressionEvaluator.parse(resultStr);
    }  
}  