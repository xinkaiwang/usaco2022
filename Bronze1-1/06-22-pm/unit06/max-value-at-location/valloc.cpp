/*
 * Max value at location
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N; //# of integers
	int K; cin >> K; //index
	int S; cin >> S; //max total sum

	for(int V=S; V>=1; V--) {
		//assume A[k] = V
		int left, right;
		if(V-1>=K) //[V-K ... V]
			left = (V-K+V)*(K+1)/2;
		else //V<=k; [1...1] k-V+1 copies; then [1 ... V]
			left = K-V+1 + V*(V+1)/2;
		
		if(K+V-1>=N-1) //[V down to V-(N-1-K)]
			right = (V+V-(N-1-K))*(N-K)/2;
		else //K+V<N; [V down 1]; [1...1] N-K-V copies
			right = V*(V+1)/2 + N-K-V;
		
		if(left+right-V<=S) {
			cout << V << '\n';
			break;
		}
	}
}

