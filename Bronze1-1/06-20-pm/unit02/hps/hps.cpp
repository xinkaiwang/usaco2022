/*
* Using %3 to compare the pastures and count the wins.
*/
#include <bits/stdc++.h>
using namespace std;

int getHighScore(vector<vector<int>>& nums) {
	// 1 > 2 > 3 > 1
	int count1 = 0;
	for(int i=0; i<nums.size(); i++) {
		if( (nums[i][0]%3) == nums[i][1]-1 )
			count1++;
	}

	// 1 > 3 > 2 > 1
	int count2 = 0;
	for(int i=0; i<nums.size(); i++) {
		if( nums[i][0]-1 == (nums[i][1]%3) )
			count2++;
	}

	return max(count1, count2);
}

int main() {
	ifstream in("hps.in"); 
	ofstream out("hps.out");
	
	int N; in >> N;  // # of rounds
	
	vector<vector<int>> nums(N);
	for(int i=0; i<N; i++) {
		nums[i].resize(2);
		in >> nums[i][0] >> nums[i][1];
	}
	
	// get the possible higher score by changing the meaning of 1, 2, 3
	int score = getHighScore(nums);
	out << score << endl;
}

