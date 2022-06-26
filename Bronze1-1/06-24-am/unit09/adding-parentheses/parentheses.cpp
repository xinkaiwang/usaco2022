/*
 * Adding parentheses
 */
#include <bits/stdc++.h>
using namespace std;

vector<int> solve(string str) {
	vector<int> ret;

	int len = str.length();
    for(int j=0; j<len; j++) {
        char c = str[j];
        if(c == '*' || c == '-' || c == '+') {
            vector<int> left = solve(str.substr(0, j));
            vector<int> right = solve(str.substr(j+1, len-j-1));
            for(int x : left) {
                for(int y : right) {
                	if(c == '+' && find(ret.begin(), ret.end(), x+y)==ret.end())
                    	ret.push_back(x+y);
                    else if(c == '-' && find(ret.begin(), ret.end(), x-y)==ret.end())
                    	ret.push_back(x-y);
                    else if(c == '*' && find(ret.begin(), ret.end(), x*y)==ret.end())
                    	ret.push_back(x*y);
                }
            }
        }
    }
    
    if(ret.empty()) ret.push_back(stoi(str));
    
    return ret;
}

int main() {
	string str; cin >> str;
	
	vector<int> ans = solve(str);
	sort(ans.begin(), ans.end());
	for(int v : ans)
		cout << v << " ";
	cout << '\n';
}

