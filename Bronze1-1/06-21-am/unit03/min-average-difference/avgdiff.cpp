/*
 * Minimum average difference
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
	int A[N];
	for(int j=0; j<N; j++)
		cin >> A[j];
	
	int minDiff = INT_MAX;
	int loc = -1;
	
	int sum = 0;
	for(int j=0; j<N; j++)
		sum += A[j];
	
	for(int j=0; j<N; j++) {
		int s1 = 0;
		for(int i=0; i<=j; i++)
			s1 += A[i];
		
		int avg1 = s1 / (j+1);
		int avg2 = j<N-1 ? (sum-s1)/(N-1-j) : 0;
		
		if(abs(avg1-avg2)<minDiff) {
			minDiff = abs(avg1-avg2);
			loc = j;
		}
	}
	cout << loc << '\n';
}

