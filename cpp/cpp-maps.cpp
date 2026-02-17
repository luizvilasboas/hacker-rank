#include <iostream>
#include <map>

using namespace std;

int main() {
  int q;

  cin >> q;

  map<string, int> m;

  for (int i = 0; i < q; i++) {
    int type, mark;

    string name;

    cin >> type;

    switch (type) {
    case 1:
      cin >> name >> mark;

      if (m.find(name) == m.end()) {
        m[name] = mark;
      } else {
        m[name] += mark;
      }

      break;
    case 2:
      cin >> name;

      m.erase(name);
      break;
    case 3:
      cin >> name;

      auto it = m.find(name);

      if (it != m.end()) {
        cout << it->second << '\n';
      } else {
        cout << '0' << '\n';
      }
    }
  }

  return 0;
}
