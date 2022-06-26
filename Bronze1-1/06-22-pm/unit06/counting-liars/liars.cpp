/*
 * Counting liars (Mar 2022)
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n; cin >> n; //# of cows
    vector<vector<int>> cows(n, vector<int>(2, 0));
    for(int j=0; j<n; j++) {
        char dir; cin >> dir;
        cows[j][0] = (dir=='L' ? 0 : 1);
        cin >> cows[j][1];
    }

    int answer = n-1;  //min # of cows telling lies
    for(int j=0; j<n; j++) { 
    	int h = cows[j][1];
        int liars = 0;
        for(int k=0; k<n; k++) {
            if(cows[k][0]==1 && h<cows[k][1] || cows[k][0]==0 && h>cows[k][1]) {
                liars++;
            }
        }
        answer = min(answer, liars);
    }
    cout << answer << '\n';
}

