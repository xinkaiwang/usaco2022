#include <bits/stdc++.h>
using namespace std;

int main() {
	ifstream cin("mixmilk.in");
	ofstream cout("mixmilk.out");
	
	int cap[3];
	int vol[3];
	
	for(int k=0; k<3; k++) {
		cin >> cap[k];
		cin >> vol[k];
	}
	
	//run 100 iterations pouring
	for(int k=0; k<100; k++) {
		int k0 = k%3;
		int k1 = (k+1)%3;
		
		//from k0 to k1
		if(vol[k1]+vol[k0] <= cap[k1]) {
			vol[k1] += vol[k0];
			vol[k0] = 0;
		}
		else {
			vol[k0] -= (cap[k1]-vol[k1]);
			vol[k1] = cap[k1];
		}
	}

	for(int j=0; j<3; j++) {
		cout << vol[j] << endl;
	}
}

