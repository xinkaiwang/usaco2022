/*
 * Right triangles
 */
#include <bits/stdc++.h>
using namespace std;

int A[1000][2];
int B[1000];
int main() {
	int N; cin >> N; //# of points in Quadrant I
	int M; cin >> M; //# of points on x-axis
	
	for(int i=0; i<N; i++) {
		cin >> A[i][0] >> A[i][1];
	}
	
	for(int j=0; j<M; j++)
		cin >> B[j];
	
	int cnt = 0;  //# of possible right triangles
	for(int j=0; j<M-1; j++) {
		for(int k=j+1; k<M; k++) {
			for(int i=0; i<N; i++) {
				int a2 = (A[i][0]-B[j])*(A[i][0]-B[j])+A[i][1]*A[i][1];
				int b2 = (A[i][0]-B[k])*(A[i][0]-B[k])+A[i][1]*A[i][1];
				int c2 = (B[j]-B[k])*(B[j]-B[k]);
				if(a2+b2==c2 || a2+c2==b2 || b2+c2==a2)
					cnt++;
			}
		}
	}

	cout << cnt << '\n';
}

