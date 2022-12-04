class Solution {
        public String freqAlphabets(String s) {
            StringBuilder res= new StringBuilder();
            for (int i=0 ; i< s.length() ; i++) {
                if (i+2<s.length() && s.charAt(i+2)=='#') {
                    String c = s.substring(i,i+2);
                    i+=2;
                    int number = Integer.parseInt(c);
                    char newChar = (char) ((char) number + 96);
                    res.append(newChar);

                } else {
                    int number = Integer.parseInt(String.valueOf(s.charAt(i)));
                    char newChar = (char) ((char) number + 96);
                    res.append(newChar);
                }
            }
            return res.toString();
        }
    }