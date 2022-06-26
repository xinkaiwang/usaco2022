/*
 * Tournament matches
 */
#include <bits/stdc++.h>
using namespace std;

int solve(int n) {
	if(n<=1)
		return 0;
	else if(n%2==0)
		return n/2 + solve(n/2);
	else
		return (n-1)/2 + solve((n+1)/2);
}

int main() {
	int N; cin >> N;

	cout << solve(N) << '\n';
}

