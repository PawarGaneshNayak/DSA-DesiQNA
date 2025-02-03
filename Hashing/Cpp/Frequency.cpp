#include<bits/stdc++.h>
using namespace std;

int main(){
    int N;
    cin>>N;
    int arr[N];
    unordered_map<int, int> hash_map;
    for(int i=0; i<N; i++){
        cin>>arr[i];
        hash_map[arr[i]] = hash_map[arr[i]] + 1;
    }
    cout<<"Frequencies are : "<<endl;
    for(auto e : hash_map){
        cout<< e.first <<" : "<< e.second <<endl;
    }
}
