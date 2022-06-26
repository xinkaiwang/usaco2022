/*
 * Single number I
 * 
 * Find the single number that appears only once while all others 
 * appear twice.
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
	
	int ans = 0;
	for(int j=0; j<N; j++) {
		int x; cin >> x;
		ans = ans ^ x;
	}
	cout << ans << '\n';
}

