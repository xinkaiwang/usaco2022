/*
 * shuffle.cpp
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	ifstream cin("shuffle.in");
	ofstream cout("shuffle.out");

	int n; cin >> n;

	int next[n+1]; //forward shuffle
	for(int i=1; i<=n; i++)
		cin >> next[i];

	int A[n+1]; //final order
	for(int i=1; i<=n; i++)
		cin >> A[i];

	int prev[n+1]; //inverse shuffle
	for(int i=1; i<=n; i++)
		prev[next[i]] = i;

	//inverse shuffle three times to recover the original order
	int B[n+1]; //previous order
	for(int j=0; j<3; j++) {
		for(int i=1; i<=n; i++)
			B[prev[i]] = A[i];

		//A = B;
		for(int i=1; i<=n; i++)
			A[i] = B[i];
	}

	for(int i=1; i<=n; i++)
		cout << A[i] << '\n';
}

