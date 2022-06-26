/*
 * Cross words (Dec 2014)
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	ifstream cin("crosswords.in");
	ofstream cout("crosswords.out");

	int n; //# of rows
	int m; //# of columns
	cin >> n >> m;
	
	vector<vector<char>> grid(n, vector<char>(m, 0));
	for(int r=0; r<n; r++) {
		string line; cin >> line;
		for(int c=0; c<m; c++)
			grid[r][c] = line[c];
	}

	int count = 0;
	vector<int> X; //store clue start position
	vector<int> Y; //store clue start position
	for(int r=0; r<n; r++) {
		for(int c=0; c<m; c++) {
			if(grid[r][c]=='#')
				continue;
			
			bool flag = false;
			
			//check horizontally
			if(c<m-2) {
				if(c==0 || (c>0 && grid[r][c-1]=='#')) {
					if(grid[r][c+1]=='.' && grid[r][c+2]=='.') {
						count++;
						X.push_back(r+1);
						Y.push_back(c+1);
						flag = true;
					}
				}
			}
			
			//check vertically
			if(r<n-2 && !flag) {
				if(r==0 || (r>0 && grid[r-1][c]=='#') ) {
					if(grid[r+1][c]=='.' && grid[r+2][c]=='.') {
						count++;
						X.push_back(r+1);
						Y.push_back(c+1);
					}
				}
			}
		}
	}

	cout << count << endl;
	
	for(int k=0; k<X.size(); k++)
		cout << X[k] << " " << Y[k] << endl;
}

