/*
 * Herdle (Jan 2022)
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	string ref[3]; //reference grid
	for(int r=0; r<3; r++)
		cin >> ref[r];
	
	string guess[3]; //guess grid
	for(int r=0; r<3; r++)
		cin >> guess[r];

	int green = 0;
	int freq1[26]; //frequency in reference grid
	int freq2[26]; //frequency in guess grid
	fill(freq1, freq1+26, 0);
	fill(freq2, freq2+26, 0);
	for(int r=0; r<3; r++) {
		for(int c=0; c<3; c++) {
			if(ref[r][c]==guess[r][c]) //letters in right locations
				green++;
			else { //letters in wrong locations
				freq1[ref[r][c]-'A']++;
				freq2[guess[r][c]-'A']++;
			}
		}
	}

	int yellow = 0;
	for(int j=0; j<26; j++) {
		yellow += min(freq1[j], freq2[j]);
	}

	cout << green << '\n' << yellow << '\n';
}

