/*
 * Increasing triple
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int Q; cin >> Q; //# of queries
	while(Q--) {
		int N; cin >> N; //# of integers
		int A[N];
		for(int j=0; j<N; j++)
			cin >> A[j];
		
		int min1 = INT_MAX; //the smallest
		int min2 = INT_MAX; //the 2nd smallest
		//min2 is right after min1, if it is not INT_MAX.
		
		bool ans = false;
		for(int j=0; j<N; j++) {
			if(A[j] <= min1) 
				min1 = A[j];
			else if(A[j] <= min2)
				min2 = A[j];
			else {
				ans = true;
				break;
			}
		}
		cout << (ans ? "YES" : "NO") << '\n';
	}
}

