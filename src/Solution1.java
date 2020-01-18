class Solution1 {
    public static boolean isLongPressedName(String name, String typed) {
        int i=0;
        for(int j=0;j<typed.length();j++){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
            }
            if(i==(name.length()-1)){
                break;
            }
        }
        if(i!=name.length()-1){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        String name="abcs";
        String t="abbccss";
        System.out.println(isLongPressedName(name,t));
    }
}