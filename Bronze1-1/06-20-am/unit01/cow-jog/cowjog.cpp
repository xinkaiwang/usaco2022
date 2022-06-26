/*
 * Cow jog (Dec 2014)
 */
#include <bits/stdc++.h>
using namespace std;

int main() {	//read input
	ifstream cin("cowjog.in");
	ofstream cout("cowjog.out");
	
	int N; cin >> N;
	
	vector<int> pos(N, 0);
	vector<int> speed(N, 0);
	
	for(int k=0; k<N; k++)
		cin >> pos[k] >> speed[k];

	//Update position and speed to count the groups:  
	//  If speed[k] > speed[k+1], then pos[k] should be pos[k+1]-1   
	//  and speed[k] should be speed[k+1].
	int cnt = 1;
	for(int k=N-2; k>=0; k--) {
		if( speed[k]>speed[k+1] ) { //the two cows will be in one group
			pos[k] = pos[k+1]-1;
			speed[k] = speed[k+1];  
		}
		else if(speed[k]<speed[k+1]) { //the two cows won't be in one group
			cnt++;
		}
		else if(pos[k]<pos[k+1])  //the two cows won't be in one group
			cnt++;
	}		

	cout << cnt << endl;
}

