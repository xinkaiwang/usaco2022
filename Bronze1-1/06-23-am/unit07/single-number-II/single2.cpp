/*
 * Single number II
 * 
 * Find the single number that appears only once while all others 
 * appear three times.
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N;
	int A[N];
	for(int j=0; j<N; j++)
		cin >> A[j];
	
    int ans = 0;
    for(int k=0; k<32; k++) {
    	int mask = 1<<k;  //only digit k is 1; 0 at all other digits
    	int sum = 0;
    	for(int x : A)
    		if((x&mask)>0) sum++;
      
    	if(sum%3==1) ans = ans|mask;
    }
	
	cout << ans << '\n';
}

