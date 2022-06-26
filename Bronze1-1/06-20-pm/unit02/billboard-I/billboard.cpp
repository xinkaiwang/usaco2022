/*
 * billboard.cpp
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	ifstream cin("billboard.in");
	ofstream cout ("billboard.out");

	int r1[4];
	int r2[4];
	int r3[4];

	//rectangle 1
	for(int i=0; i<4; i++)
		cin >> r1[i];

	//rectangle 2
	for(int i=0; i<4; i++)
		cin >> r2[i];

	//rectangle 3
	for(int i=0; i<4; i++)
		cin >> r3[i];

	//area of overlap of r1 and r3
	int ox1 = max(r1[0], r3[0]);
	int ox2 = min(r1[2], r3[2]);

	int oy1 = max(r1[1], r3[1]);
	int oy2 = min(r1[3], r3[3]);

	int overlap1 = (ox2 - ox1) * (oy2 - oy1);
	if(ox1 >= ox2 || oy1 >= oy2)
		overlap1 = 0;

	//area of overlap of r2 and r3
	int ox21 = max(r2[0], r3[0]);
	int ox22 = min(r2[2], r3[2]);

	int oy21 = max(r2[1], r3[1]);
	int oy22 = min(r2[3], r3[3]);

	int overlap2 = (ox22 - ox21) * (oy22 - oy21);
	if(ox21 >= ox22 || oy21 >= oy22)
		overlap2 = 0;

	int res = (r1[2]-r1[0]) * (r1[3]-r1[1]) + (r2[2]-r2[0]) * (r2[3]-r2[1]);
	res -= (overlap1 + overlap2);

	cout << res << endl;
}
