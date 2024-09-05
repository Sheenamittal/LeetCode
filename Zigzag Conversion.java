class Solution {

    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()) {
            return s;
        }

        StringBuilder str = new StringBuilder();
        for(int i=0; i<numRows; i++) {
            int one= (numRows*2)-2;
            int two= i*2;
                str.append(s.charAt(j));
                if(two>0 && two<one && (j+one)-two<s.length()) {
                    str.append(s.charAt((j+one)-two));
                }
            }
        }
        return str.toString();
    }
}
