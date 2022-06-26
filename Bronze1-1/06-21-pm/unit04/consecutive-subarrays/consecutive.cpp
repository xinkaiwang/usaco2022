/*
 * Remove consecutive subarrays
 */
#include <bits/stdc++.h>
using namespace std;

int A[100005];
int main() {
	int N; cin >> N; //# of integers
	int K; cin >> K;
	for(int j=0; j<N; j++)
		cin >> A[j];
	A[N] = INT_MAX;

	vector<int> B;
	for(int j=0; j<=N; j++) {
		if(B.size()<K || A[j]==1+B.back()) {
			B.push_back(A[j]);
		}
		else { //A[j] is not consecutive to B[last]
			
			//check the consecutive subarray seen so far
			int i = B.size()-2;
			while(i>=0) {
				if(B[i]+1!=B[i+1])
					break;
				i--;
			}
			if(i<B.size()-K) { 
				//a consecutive subarray with length >= K exists; remove it
				B.erase(B.begin()+i+1, B.end());
			}

			B.push_back(A[j]);
		}
	}

	if(B.back()==INT_MAX) B.pop_back();
	
	if(B.empty())
		cout << "NONE\n";
	else {
		for(int v : B)
			cout << v << " ";
		cout << '\n';
	}
}

