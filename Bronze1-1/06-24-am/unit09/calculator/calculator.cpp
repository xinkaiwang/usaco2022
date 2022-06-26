/*
 * Implement a simple calculator with +, -, and ().
 */
#include <bits/stdc++.h>
using namespace std;

int solve(string& s) {
	int ans = 0;

	int sign = 1;
	int N = s.length();
	for(int j=0; j<N; ) {
		char ch = s[j];
		if(ch=='(') { //find the matching ) and evaluate the substring
			int left = 1; //# of extra '('
			int k = j+1;
			while(k<N) {
				if(s[k]=='(')
					left++;
				else if(s[k]==')')
					left--;
				if(left==0) break;
				k++;
			} //s[k] has the matching ')'
			string ss = s.substr(j+1, k-j-1);
			ans += sign * solve(ss);
			j=k+1;
		}

		else if(ch=='+') {
			sign = 1; j++;
		}
		
		else if(ch=='-') {
			sign = -1; j++;
		}
		
		else if('0'<=ch && ch<='9') {
			//find the integer
			int val = ch-'0';
			int k = j+1;
			while(k<N) {
				char ch2 = s[k];
				if('0'<=ch2 && ch2<='9') {
					val = val*10 + (ch2-'0');
					k++;
				}
				else //no longer a digit
					break;
			}
			
			ans += sign * val;
			j = k;
		}
		else
			j++;
	}
	
	return ans;
}

int main() {
	string s; cin >> s;
	cout << solve(s) << '\n';
}

