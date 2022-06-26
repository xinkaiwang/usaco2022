/*
* If there is an edge between pasture i and pasture j, and i < j, then 
* pasture j should NOT take the grass type of pasture i.
*/
#include <bits/stdc++.h>
using namespace std;

int main() {
	ifstream in("revegetate.in");
	ofstream out("revegetate.out");

	int N; in >> N;  // # of pastures
	int M; in >> M;  // # of edges

	vector<vector<int>> adj(N, vector<int>(N, 0));
	for(int j=0; j<M; j++) {
		int a, b;
		in >> a >> b;
		a--, b--;
		adj[a][b] = 1;
		adj[b][a] = 1;
	}

	// type[r]: final type of pasture[r]
	int type[N];
	fill(type, type+N, 0);
	
	// allowed[r][j]: whether pasture r can take type j, j>0
	vector<vector<bool>> allowed(N, vector<bool>(5, true));
	
	for(int r=0; r<N; r++) {
		if( type[r] == 0 ) {
			if( allowed[r][1] ) 
				type[r] = 1;
			else if( allowed[r][2] ) 
				type[r] = 2;
			else if( allowed[r][3] ) 
				type[r] = 3;
			else 
				type[r] = 4;
		}

		int d = type[r];
		for(int c=r+1; c<N; c++) {
			if( adj[r][c]!=0 )   // edge between r & c
				allowed[c][d] = false;   // pasture c can NOT be type d
		}
	}

	for(int r=0; r<N; r++) {
		out << type[r];
	}
	out << endl;
}

