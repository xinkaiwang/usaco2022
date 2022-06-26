/*
 * Just stalling
 */
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll fit(vector<int>&A, vector<int>&B) {
	int n = A.size();
	if(n==1)
		return A[0]<=B[0] ? 1LL : 0LL;

	//All stalls >= A[n-1] are equivalent to A[n-1].
	// A[n-1] has to be in one of these stalls.
	int k=n-1;
	while(k>=0 && B[k]>=A[n-1]) {
		B[k] = A[n-1];
		k--;
	}

	A.pop_back();
	B.pop_back();
	
	return fit(A, B) * (n-1-k);
}

int main() {
	int N; cin >> N; //# of cows and stalls
	
	vector<int> A(N);
	vector<int> B(N);
	for(int j=0; j<N; j++)
		cin >> A[j];
	
	for(int j=0; j<N; j++)
		cin >> B[j];
	
	sort(A.begin(), A.end());
	sort(B.begin(), B.end());

	cout << fit(A, B) << endl;
}

