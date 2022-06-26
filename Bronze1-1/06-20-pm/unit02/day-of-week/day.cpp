/*
 * Day of the week
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int m; cin >> m; //month
	int d; cin >> d; //day
	
	int days = 0;
	for(int x=1; x<m; x++) {
		if(x==2)
			days += 28;
		else if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10)
			days += 31;
		else 
			days += 30;
	}
	days += d-1;
	
	days %= 7;
	string names[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday",
			"Thursday", "Friday"};
	
	cout << names[days] << '\n';
}

