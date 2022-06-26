/*
 * Group sum
 */
#include <bits/stdc++.h>
using namespace std;

//Report whether to find a subsequence of A (from "start" to the end, 
// not necessarily continuous) that adds up to sum.
bool solve(int A[], int start, int sum, int len) {
	if(sum==0)
		return true;
	
	if(start==len-1)
		return A[start]==sum;
	
	return solve(A, start+1, sum, len) || solve(A, start+1, sum-A[start], len);
}

int main() {
	int Q; cin >> Q; //# of queries
	while(Q--) {
		int N, T;
		cin >> N >> T;
		
		int A[N];
		for(int j=0; j<N; j++)
			cin >> A[j];

		bool res = solve(A, 0, T, N);
		cout << (res ? "YES" : "NO") << '\n';
	}
}

