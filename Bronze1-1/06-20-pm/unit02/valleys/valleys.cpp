/*
 * Valleys
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
	int A[N];
	for(int j=0; j<N; j++)
		cin >> A[j];
	
	int cnt = 0;
	for(int j=1; j<N-1; j++) {
		//no value in a neighborhood is smaller; there is a value larger
		bool validL = false;
		for(int i=j-1; i>=0; i--) {
			if(A[i]>A[j]) {
				validL = true;
				break;
			}
			else if(A[i]<A[j]) {
				break;
			}
		}

		bool validR = false;
		for(int i=j+1; i<N; i++) {
			if(A[i]>A[j]) {
				validR = true;
				break;
			}
			else if(A[i]<A[j]) {
				break;
			}
		}

		if(validL && validR)
			cnt++;
	}
	cout << cnt << '\n';
}

