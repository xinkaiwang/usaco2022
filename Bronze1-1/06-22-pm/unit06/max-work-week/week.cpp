/*
 * Max work week
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
	int M[N];
	for(int j=0; j<N; j++)
		cin >> M[j];
	
	int sum = 0;
	int maxM = 0;
	for(int x : M) {
		sum += x;
		maxM = max(maxM, x);
	}
	
	if(maxM*2<=sum)
		cout << sum << '\n';
	else
		cout << 2*(sum-maxM)+1 << '\n';
}

