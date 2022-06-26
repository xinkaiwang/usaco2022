/*
 * Photoshoot III (Mar 2022)
 */
#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int N; cin >> N;
	 
    string str; cin >> str;
    
    int ret = 0;
    for(int idx=N-1; idx>=1; idx-=2) {
        if(str[idx] == str[idx-1])
            continue;
 
        if(str[idx] == 'G' && ret%2==1)
            ret++;
 
        if(str[idx] == 'H' && ret%2==0)
            ret++;
    }
 
    cout << ret << '\n';
}
