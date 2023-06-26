package PW_TEST;
public class TESTQ2 {
        static int firstUniqChar(String s) {
            int min = Integer.MAX_VALUE;
            for(int i= 'a';i<= 'z';i++){
                int idx = s.indexOf(i);
                if(idx != -1 && s.lastIndexOf(i) == idx){
                    min = Math.min(min,idx);
                }

            }

            return min !=Integer.MAX_VALUE ? min : -1 ;
        }

    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    }

