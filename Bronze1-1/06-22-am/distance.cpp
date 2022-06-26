/*
 * Back and forth
 */
#include <bits/stdc++.h>
using namespace std;
using ll = long long;

ll sumdist(vector<int>& A) {
	ll sum = 0;
	int len = A.size();
	for(int j=0; j<len/2; j++) {
		sum += abs(A[len-1-j] - A[j]);
	}
	return sum;
}

int main() {
	int N; cin >> N;

	//the locations of all the 0s
	vector<int> A;
	for(int j=1; j<=N; j++) {
		int x; cin >> x;
		if(x==0)
			A.push_back(j);
	}
	
	ll sum1 = sumdist(A);
	reverse(A.begin(), A.end());
	if(!A.empty()) A.pop_back();
	ll sum2 = sumdist(A);
	cout << (sum1 + sum2) << '\n';
}

