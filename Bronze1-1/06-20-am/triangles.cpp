#include <bits/stdc++.h>
using namespace std;

int P[100][2];
int Q[100];

int main() {
	int N, M;
	cin >> N >> M;
	
	for(int i=0; i<N; i++) {
		cin >> P[i][0] >> P[i][1];
	}
	
	int Q[M];
	for(int j=0; j<M; j++) {
		cin >> Q[j];
	}
	
	int cnt = 0; //# of right triangles that can be formed P[i]Q[j]Q[k]
	
	
	
	cout << cnt << '\n';
}

