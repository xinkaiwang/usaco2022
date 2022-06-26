/*
 * Complete tasks
 */
#include <bits/stdc++.h>
using namespace std;

int freq[1000001];

int main() {
	int N; cin >> N;
	for(int j=0; j<N; j++) {
		int x; cin >> x;
		freq[x]++;
	}
	
	int ans = 0;
	for(int x=0; x<=1e6; x++) {
		if(freq[x]==1) {
			ans = -1;
			break;
		}
		else
			ans += (freq[x]+2)/3;  //round up
	}
	cout << ans << '\n';
}

