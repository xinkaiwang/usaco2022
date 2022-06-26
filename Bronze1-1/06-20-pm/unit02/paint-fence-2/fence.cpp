/*
 * Paint fence
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int a, b, c, d;
	cin >> a >> b >> c >> d;
	
	int whole = 0;
	int twice = 0;
	if(a<c) {
		if(b<c) {
			whole = b-a + d-c;
			twice = 0;
		}
		else if(b<d) {
			whole = d-a;
			twice = b-c;
		}
		else { //b>=d
			whole = b-a;
			twice = d-c;
		}
	}
	else if(a<d) {
		if(b<d) {
			whole = d-c;
			twice = b-a;
		}
		else { //b>=d
			whole = b-c;
			twice = d-a;
		}
	}
	else { //a>=d
		whole = b-a + d-c;
		twice = 0;
	}
	
	cout << whole-twice << " " << twice << '\n';
}

