#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {
  int n;

  cin >> n;

  vector<int> val(n);

  for (int i = 0; i < n; i++) {
    cin >> val[i];
  }

  int q;

  cin >> q;

  for (int i = 0; i < q; i++) {
    int y;

    cin >> y;

    auto it = lower_bound(val.begin(), val.end(), y);

    if (it != val.end() && *it == y) {
      cout << "Yes " << distance(val.begin(), it) + 1;
    } else {
      cout << "No " << distance(val.begin(), it) + 1;
    }

    cout << '\n';
  }

  return 0;
}
