class Main {
    public static void main(String[] args) {
        String s = "PALINDROME";
        System.out.println(reverse(s));
    }    
    public static String reverse(String in) {

            if(in==null)
            {
                throw new IllegalArgumentException("null is an invalid input");
            }
            StringBuilder out = new StringBuilder();
            char[] ch = in.toCharArray();
            for(int i = ch.length-1; i>=0; i--)
            {
              out.append(ch[i]);
            }
            return out.toString();
        
    }
}
