/*
* Using a user defined helper class "Cow".
*/
#include <bits/stdc++.h>
using namespace std;

int main() {
    ifstream cin("notlast.in");
	ofstream cout("notlast.out");
	
	int N; cin >> N;  // # of records
	
	string A[] = {"Annabelle", "Bessie", "Daisy", "Elsie", "Gertie",
			"Henrietta", "Maggie"};
	
	vector<string> names(A, A+7);
	
	int mp[7];
	fill(mp, mp+7, 0);
	
	for(int k=0; k<N; k++) { //read records and update milk
		string name; cin >> name;   //cow name
		int a; cin >> a;      //one milk production of the cow
		int loc = distance(names.begin(), find(names.begin(), names.end(), name));
		mp[loc] += a;
	}

	//find the lowest and second lowest milk production
	int min1 = mp[0];  //lowest production
	for(int j=0; j<7; j++) {
		if(mp[j] < min1) 
			min1 = mp[j];
	}
	
	int min2 = INT_MAX;  //second lowest production
	int cnt = 0;  //# of cows with the second lowest production
	int loc = -1;   //location of the second lowest production if count=1
	for(int j=0; j<7; j++) {
		if(mp[j]>min1 && mp[j]<min2) {
			min2 = mp[j];
			loc = j;
			cnt = 1;
		}
		else if(mp[j]==min2) {
			cnt++;
		}
	}

	if(cnt==1) //unique cow with the second lowest production
		cout << names[loc] << '\n';
	else
		cout << "Tie\n";
}

