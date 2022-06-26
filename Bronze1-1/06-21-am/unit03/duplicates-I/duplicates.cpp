/*
 * Duplicates
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int Q; cin >> Q; //# of queries
	while(Q--) {
		int N, K;
		cin >> N >> K;
	
		int A[N];
		for(int j=0; j<N; j++)
			cin >> A[j];
		
		int freq[1001];
		fill(freq, freq+1001, 0);
		for(int j=0; j<N; j++)
			freq[ A[j] ]++;
		
		bool exist = false;
		for(int x=0; x<=1000; x++) {
			if(freq[x]>=K) {
				exist = true;
				break;
			}
		}
		cout << (exist ? "YES" : "NO") << '\n';
	}
}
