/*
 * Cownditioning (Dec 2021)
 */
#include <bits/stdc++.h>
using namespace std;

int cnt = 0;
int D[100005];

//D[low...high]>0
void solve(int low, int high) {
	int prev = 0;
	for(int z=low; z<=high; z++) {
		if(D[z]>prev) 
			cnt += D[z] - prev;
		prev = D[z];
	}
}

int main() {
	int N; cin >> N; //# of cows
	for(int j=0; j<N; j++)
		cin >> D[j];
	
	for(int j=0; j<N; j++) { //D[j] = final value - initial value
		int x; 
		cin >> x;
		D[j] = D[j] - x;
	}

	for(int x=0; x<N; ) {
		if(D[x]==0) { //if difference is already 0
			x++;
			continue;
		}
		
		int y = x+1;
		if(D[x]>0) {
			while(y<N && D[y]>0) //block of positive differences
				y++;
			solve(x, y-1);
		}
		else {
			while(y<N && D[y]<0) //block of negative differences
				y++;
			
			for(int z=x; z<y; z++)
				D[z] = -D[z];
			solve(x, y-1);
		}
		x = y;
	}
	cout << cnt << '\n';
}

