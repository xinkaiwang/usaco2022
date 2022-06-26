/*
 * Blocks (Feb 2022)
 */
#include <bits/stdc++.h>
using namespace std;
 
bool solve(array<string, 4> blocks) {
	string word;
	cin >> word;
	do {
		bool ok = true;
		for(int i=0; i<word.size(); i++) {
			if(find(blocks[i].begin(), blocks[i].end(), word[i]) == blocks[i].end())
				ok = false;
		}
		if(ok) return true;
	} 
	while(next_permutation(blocks.begin(), blocks.end()));

	return false;
}
 
int main() {
	int TC; cin >> TC;
	array<string, 4> blocks;
	for(int i=0; i<4; i++) 
		cin >> blocks[i];
	sort(blocks.begin(), blocks.end());

	for(int i=0; i<TC; i++) {
		bool b = solve(blocks);
		if(b) 
			cout << "YES\n";
		else 
			cout << "NO\n";
	}
}
