/*
 * Pens and pencils
 */
#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
	ll T; cin >> T; //total money
	ll x; cin >> x; //unit cost for pens
	ll y; cin >> y; //unit cost for pencils
	
	ll ans = 0;
	for(int k=0; k<=T/x; k++) {
		//buying k pens costs k*x; the rest is for pencils:
		//  at most (T-k*x) / y pencils
		ans += (T-k*x)/y + 1;
	}
	cout << ans << '\n';
}

