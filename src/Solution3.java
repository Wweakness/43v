import java.util.Stack;

class Solution3 {
    public static String reverseOnlyLetters(String S) {
        char[] s=S.toCharArray();
        Stack stack=new Stack();
        for(int i=0;i<s.length;i++){
            if(Character.isLetter(s[i])){
                stack.push(s[i]);
            }
        }
        StringBuffer result=new StringBuffer();
        for(int j=0;j<s.length;j++){
            if(Character.isLetter(s[j])){
                result.append(stack.pop());
            }else {
                result.append(s[j]);
            }
        }
        String p=result.toString();
        return p;
    }

    public static void main(String[] args) {
        String p="ab-d-s";
        System.out.println(reverseOnlyLetters(p));
    }
}