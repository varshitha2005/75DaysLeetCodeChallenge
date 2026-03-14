class Solution {
    public boolean isAnagram(String s, String t) {
        Scanner sc=new Scanner(System.in);
            char[] a = s.toCharArray();
             char[] b = t.toCharArray();
             if(s.length()!=t.length()){
                return false;
             }
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }return true;
    }

        }
        
