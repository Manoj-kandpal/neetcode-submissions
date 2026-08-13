class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for(String str: strs) {
            int length = str.length();
            builder.append(length);
            builder.append('#');
            builder.append(str);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i=0;
        while (i<str.length()) {
            int j = i;
            while (j < str.length() && str.charAt(j) != '#') {
                j++;
            }
            
            String substring = str.substring(i,j);
            int length = 0;
            if (substring.length() > 0) {
                length = Integer.parseInt(substring);
            }
            
            String current = str.substring(j+1, j + 1 + length);
            res.add(current);
            i = j + 1 + length;
        }

        return res;
    }
}
