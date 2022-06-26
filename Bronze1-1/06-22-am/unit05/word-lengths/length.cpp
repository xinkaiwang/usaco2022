/*
 * Word length product
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N; //# of words
	string words[N];
	for(int j=0; j<N; j++)
		cin >> words[j];
	
	int ans = 0;

	//freq[j]: frequency of the letters in words[j]
	int freq[N][26];
	for(int i=0; i<N; i++)
		fill(freq[i], freq[i]+26, 0);
		
    for(int i=0; i<N; i++) {
        for(int j=0; j<words[i].length(); j++) {
            int c = words[i][j] - 'a';
            freq[i][c]++;
        }
    }

    for(int i=0; i<N-1; i++) {
        for(int j=i+1; j<N; j++) {
        	bool overlap = false;
            for(int k=0; k<26; k++) {
                if(freq[i][k] != 0 && freq[j][k] != 0) {
					overlap = true;
					break;
				}
            }
            if(!overlap)
	            ans = max(ans, (int)words[i].length() * (int)words[j].length());
        }
    }
    
    cout << ans << '\n';
}

