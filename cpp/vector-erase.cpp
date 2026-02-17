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

  int x;

  cin >> x;

  out.erase(out.begin() + x - 1);

  int a, b;

  cin >> a >> b;

  out.erase(out.begin() + a - 1, out.begin() + b - 1);

  cout << out.size() << '\n';

  for (int num : out) {
    cout << num << ' ';
  }

  cout << '\n';

  return 0;
}
