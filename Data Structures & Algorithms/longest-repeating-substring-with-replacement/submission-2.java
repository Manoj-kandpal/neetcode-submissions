class Solution {

    public int getMaxFrequency(int[] counter) {
        int maxLength = 0;

        for (int i=0; i<counter.length; i++) {
            maxLength = Math.max(maxLength, counter[i]);
        }

        return maxLength;
    }


    public int characterReplacement(String s, int k) {
        int[] counter = new int[26];

        int low = 0;
        int high = 0;

        int length = s.length();
        int max = 0;

        while (high < length) {
            counter[s.charAt(high) - 'A'] += 1;

            int maxFreq = getMaxFrequency(counter);
            int subLength = high - low + 1;

            if (maxFreq < subLength) {
                int replacement = subLength - maxFreq;
                
                if (replacement <= k) {
                    max = Math.max(max, maxFreq + replacement);
                } else {
                    max = Math.max(max, maxFreq + k);
                    counter[s.charAt(low) - 'A'] -= 1;
                    low++;
                }
            } else {
                max = Math.max(max, maxFreq);
            }
            high++;
        }

        return max;
    }
}
