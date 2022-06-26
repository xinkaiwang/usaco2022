/*
 * Photo shoot II (Feb 2022)
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N; //# integers

	int A[N+1];
	for(int j=1; j<=N; j++)
		cin >> A[j];

	int B[N+1];
	int BI[N+1];
	for(int j=1; j<=N; j++) {
		cin >> B[j];
		BI[B[j]] = j;
	}

	int AI[N+1];
	for(int j=1; j<=N; j++)
		AI[j] = BI[A[j]];

	int maxPref = AI[1];
	int count = 0;
	for(int j = 2; j<=N; j++) {
		if(AI[j] < maxPref)
			count++;
		maxPref = max(maxPref, AI[j]);
	}

	cout << count << '\n';
}

