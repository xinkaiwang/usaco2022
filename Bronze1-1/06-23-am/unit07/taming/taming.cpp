/*
 * Taming (Feb 2018)
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	ifstream cin("taming.in");
	ofstream cout("taming.out");
	
	int N; cin >> N ;   //number of days
	int A[N];   //the log of records
	for(int k=0; k<N; k++)
		cin >> A[k];

	bool consistant = true;
	A[0] = 0;    //mark day 0 as accident day
	for(int j=N-2; j>=0; j--) {
		if( A[j+1]>0 ) {
			if( A[j]==-1 )
				A[j] = A[j+1]-1;
			else if( A[j]!=A[j+1]-1 ) {
				consistant = false;
				break;
			}
		}
	}
	if( !consistant ) {
		cout << -1 << endl;
		return 0;
	}
	
	//find the minimum number of days with accident
	int m = 0;
	for(int j=0; j<N; j++)
		if(A[j]==0)
			m++;
	
	//find the maximum number of days with accident
	int M = m;
	for(int j=0; j<N; j++)
		if(A[j]==-1)
			M++;
	
	cout << m << " " << M << endl;
}

