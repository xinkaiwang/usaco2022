/*
 * Water container
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N; //# of vertical lines
	int H[N];
	for(int j=0; j<N; j++)
		cin >> H[j];
	
	int maxW = 0;
	for(int i=0; i<N; i++) {
		for(int j=i+1; j<N; j++) {
			//the water height is determined by the min of H[i] and H[j]
			int y = min(H[i], H[j]);
			maxW = max(maxW, y*(j-i));
		}
	}
	cout << maxW << '\n';
}

