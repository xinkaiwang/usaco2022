/* 
 * Life guards (Jan 2018)
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	ifstream cin("lifeguards.in");
	ofstream cout("lifeguards.out");
	
	int N; cin >> N; //# of guards
	int A[N][2];
	for(int j=0; j<N; j++) {
		cin >> A[j][0]; //start time
		cin >> A[j][1]; //end time
	}
	
	int maxCoverage = 0; //max coverage of the pool
	
	for(int j=0; j<N; j++) {
		//assume guard j is removed, find the coverage time.
		//all other guards will contribute to the coverage.
		int coverage = 0;
		
		bool covered[1000];
		fill(covered, covered+1000, false);
		
		for(int k=0; k<N; k++) {
			if(k==j) continue;
			
			//mark the unit interval being covered
			for(int x=A[k][0]; x<A[k][1]; x++)
				covered[x] = true;
		}
		
		for(int x=0; x<1000; x++)
			if(covered[x]) coverage++;
		
		if(coverage > maxCoverage) maxCoverage = coverage;
	}
	cout << maxCoverage << '\n';
}

