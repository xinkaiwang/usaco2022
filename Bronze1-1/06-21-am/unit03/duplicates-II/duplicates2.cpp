/*
 * Duplicates II
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N; //# of integers
	int T; cin >> T; //target
	int K; cin >> K; //dist between indices
	
	int A[N];
	for(int j=0; j<N; j++)
		cin >> A[j];

	bool exist = false;
	int ans1 = -1, ans2 = -1;
	for(int i=0; i<N; i++){
        for(int j=i+1; j<N && j-i<=K; j++){
            if(abs(A[i] - A[j]) <= T) {
            	exist = true;
            	ans1 = i+1;
            	ans2 = j+1;
            	goto Outer;
            }
        }
    }
    Outer:
	if(exist)
		cout << ans1 << " " << ans2 << '\n';
	else
		cout << -1 << '\n';
}

