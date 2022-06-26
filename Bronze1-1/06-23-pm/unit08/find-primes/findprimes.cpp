/*
 * Find the number of primes in an interval [m, n].
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int m, n; 
	cin >> m >> n;

	vector<bool> isPrime(n+1, true);

	//traverse all entries
	for(int k=2; k<=n; k++) {
		if(isPrime[k]) {
			for(int j=k+k; j<=n; j=j+k) {
				if(isPrime[j])
					isPrime[j] = false;
			}
		}
	}

	int count = 0; //# of primes
	for(int k=max(2, m); k<=n; k++) {
		if(isPrime[k]) {
			count++;
		}
	}
	cout << count << '\n';
}

