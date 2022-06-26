/*
 * Max after digit swap
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int num;
	cin >> num;

    string str = to_string(num);
    int res = num;
	int n = str.size();
    
	for(int i=0; i<n; i++) {
        for (int j = i+1; j<n; j++) {
            swap(str[i], str[j]);
            res = max(res, stoi(str));
            swap(str[i], str[j]);
        }
    }
    cout << res << '\n';
}

