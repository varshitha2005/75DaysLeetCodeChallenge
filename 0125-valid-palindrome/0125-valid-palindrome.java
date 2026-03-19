class Solution {
    public boolean isPalindrome(String s) {
        
        String a = s.toLowerCase();   
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(Character.isLetterOrDigit(c)){
                temp.append(c);
            }
        }  
        a = temp.toString();
        String p = new StringBuilder(a).reverse().toString();
        if(a.equals(p)){
            return true;   
        } else {
            return false;  
        }
    }
}