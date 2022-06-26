/*
 * Longest divisible subsequence
 */
#include <bits/stdc++.h>
using namespace std;

int main() {
	int N; cin >> N; //# of integers
	int A[N];
	for(int j=0; j<N; j++)
		cin >> A[j];
	
	vector<vector<int>> lists(N);
	for(int j=0; j<N; j++) {
		lists[j].push_back(A[j]);
	}
	
	for(int i=0; i<N; i++) {
		for(int j=i+1; j<N; j++) {
			if(A[j]%A[i]==0 && lists[j].size() <= lists[i].size()) {
				lists[j].clear();
				lists[j] = lists[i];
				lists[j].push_back(A[j]);
			}
		}
	}

	int maxL = 1;
	int id = 0;
	for(int j=0; j<N; j++) {
		if(lists[j].size()>maxL) {
			maxL = lists[j].size();
			id = j;
		}
	}
	
	cout << maxL << '\n';
	for(int v : lists[id])
		cout << v << " ";
	cout << '\n';
}

