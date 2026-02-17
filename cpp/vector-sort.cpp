#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {
  int n;

  cin >> n;

  vector<int> out(n);

  for (int i = 0; i < n; i++) {
    cin >> out[i];
  }

  sort(out.begin(), out.end());

  for (int num : out) {
    cout << num << ' ';
  }

  cout << '\n';

  return 0;
}
