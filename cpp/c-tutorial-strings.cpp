#include <iostream>
#include <string>

using namespace std;

int main() {
  string a, b;

  cin >> a >> b;

  cout << a.length() << ' ' << b.length() << '\n';
  cout << a + b << '\n';

  char let = a[0];

  a[0] = b[0];
  b[0] = let;

  cout << a << ' ' << b << '\n';

  return 0;
}
