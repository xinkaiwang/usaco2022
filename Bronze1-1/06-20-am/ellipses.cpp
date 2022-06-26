/*
 * Ellipses overlap
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int a1, b1, h1, k1;
	cin >> a1 >> b1 >> h1 >> k1;

	int a2, b2, h2, k2;
	cin >> a2 >> b2 >> h2 >> k2;

	int count = 0;
	for(int x=h1-a1; x<=h1+a1; x++) {
		for(int y=k1-b1; y<=k1+b1; y++) {
			int p1 = (x-h1)*b1;
			int q1 = (y-k1)*a1;
			if(p1*p1 + q1*q1 < a1*a1*b1*b1) {
				
				int p2 = (x-h2)*b2;
				int q2 = (y-k2)*a2;
				if(p2*p2 + q2*q2 < a2*a2*b2*b2)
					count++;
			}
		}
	}
	cout << count << '\n';
}

