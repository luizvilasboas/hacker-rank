#include <iostream>
#include <set>

using namespace std;

int main() {
  int q;

  cin >> q;

  set<int> s;

  for (int i = 0; i < q; i++) {
    int y, x;

    cin >> y >> x;

    switch (y) {
    case 1:
      s.insert(x);
      break;
    case 2:
      s.erase(x);
      break;
    case 3:
      auto found = s.find(x);

      if (found == s.end()) {
        cout << "No";
      } else {
        cout << "Yes";
      }

      cout << '\n';
    }
  }

  return 0;
}
