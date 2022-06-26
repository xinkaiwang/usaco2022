/*
 * Moo buzz
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
	
	for(int j=1; j<=N; j++) {
		string ans = to_string(j);
		if(j%15==0)
			ans = "Moobuzz";
		else if(j%3==0)
			ans = "Moo";
		else if(j%5==0)
			ans = "Buzz";
		cout << ans << " ";
	}
}

