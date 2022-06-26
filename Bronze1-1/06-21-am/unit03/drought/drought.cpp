/*
 * Drought (Jan 2022)
 */
#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int N;
ll H[100005];

ll sweepR() {
	ll sum = 0;
	for(int j=1; j<N-1; j++) {
		if(H[j]>H[j-1]) { //bring down H[j] down to H[j-1]
			ll d = H[j] - H[j-1];
			sum += d;
			H[j] -= d;
			H[j+1] -= d;
		}
	}
	
	return sum*2;
}

ll sweepL() {
	ll sum = 0;
	for(int j=N-2; j>0; j--) {
		if(H[j]>H[j+1]) { //bring down H[j] down to H[j+1]
			ll d = H[j] - H[j+1];
			sum += d;
			H[j] -= d;
			H[j-1] -= d;
		}
	}
	
	return sum*2;
}

bool isLevel() {
	bool flag = (H[0]>=0);
	if(!flag) return false;
	
	for(int j=1; j<N; j++) 
		if(H[j]!=H[j-1]) {
			flag = false;
			break;
		}
	return flag;
}

int main() {
	int T; cin >> T;
	
	for(int t=0; t<T; t++) {
		cin >> N;
		for(int j=0; j<N; j++)
			cin >> H[j];
		
		ll ans = sweepR(); //sweep left to right
		if(isLevel())
			cout << ans << '\n';
		
		else { //not level yet
			ans += sweepL(); //sweep right to left
			if(isLevel())
				cout << ans << '\n';
			else
				cout << -1 << '\n';
		}
	}
}

