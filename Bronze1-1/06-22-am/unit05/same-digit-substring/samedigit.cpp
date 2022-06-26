/*
 * Same digit substring
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	string str; cin >> str; str += ' ';
	
	int maxLen = 1;
	int loc = 0;
	for(int j=0; j<str.length();) {
		int k = j+1;
		while(k<str.length() && str[k]==str[j])
			k++;
		//k is the first index so that str[k] != str[j]
		
		if(k-j>maxLen) {
			maxLen = k-j;
			loc = j;
		}
		else if(k-j==maxLen && str[j]>str[loc]) {
			loc = j;
		}
		j = k;
	}
	cout << str.substr(loc, maxLen) << '\n';
}

