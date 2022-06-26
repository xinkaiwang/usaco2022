/*
 * String value
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N; //# of strings
	string strs[N];
	for(int j=0; j<N; j++)
		cin >> strs[j];
	
	for(int j=0; j<N; j++) {
		int k=0;
		while(k<strs[j].length() && strs[j][k]=='A')
			k++;
		strs[j] = strs[j].substr(k);
	}

	int cnt = 0;
	for(int j=1; j<N; j++) {
		if(strs[j].length()<strs[0].length()) 
			continue;
		
		if(strs[j].length()>strs[0].length())
			cnt++;
		else if(strs[j].compare(strs[0])>0) { //equal lengths
			cnt++;
		}
	}
	cout << cnt << '\n';
}

