public class Main{
    public static void main(String [] numbers){
        String num = "{(((((((1+2)))))))}";
        Expression ex = new Expression();
        var result = ex.isBalanced(num);
        System.out.println(result);
    }

}