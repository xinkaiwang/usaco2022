/*
 * Longest wave
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N; //# of integers
	int A[N];
	for(int j=0; j<N; j++)
		cin >> A[j];
	
	vector<int> B;
	B.push_back(INT_MAX);
	
	for(int j=0; j<N; j++) {
		if(B.size()%2==1) {
			if(A[j]<B.back())
				B.push_back(A[j]);
			else if(A[j]>B.back()) {
				B.pop_back();
				B.push_back(A[j]);
			}
		}
		else { //B.size()%2==0
			if(A[j]<B.back()) {
				B.pop_back();
				B.push_back(A[j]);
			}
			else if(A[j]>B.back())
				B.push_back(A[j]);
		}
	}
	cout << (B.size()-1) << '\n';
}
