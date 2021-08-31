class Solution {
    public int numIdenticalPairs(int[] nums) {
	int answer = 0;
	int[] freq = new int[101];
        
	for (int i : nums) {
		if (freq[i] == 0) freq[i]++;
		else{
			answer += freq[i];
			freq[i]++;
		}
	}
	return answer;
    }
}
