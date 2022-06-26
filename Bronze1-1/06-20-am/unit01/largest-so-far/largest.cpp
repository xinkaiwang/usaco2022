/*
 * Largest so far
 */
#include <bits/stdc++.h>
using namespace std;

int A[1000];
int main() {
	int N; cin >> N;
	for(int j=0; j<N; j++)
		cin >> A[j];

	int count = 0;
	for(int j=0; j<N; j++) {
		bool isLargest = true;
		for(int i=0; i<j; i++) {
			if(A[i]>=A[j]) { //no integer on the left is >= A[j]
				isLargest = false;
				break;
			}
		}
		if(isLargest)
			count++;
	}
	cout << count << '\n';
}

