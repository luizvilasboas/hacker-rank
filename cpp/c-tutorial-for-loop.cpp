#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

unordered_map<int, string> number_to_string = {
    {1, "one"}, {2, "two"},   {3, "three"}, {4, "four"}, {5, "five"},
    {6, "six"}, {7, "seven"}, {8, "eight"}, {9, "nine"},
};

int main() {
  int from, to;

  cin >> from >> to;

  for (int i = from; i <= to; i++) {
    if (i > 9) {
      cout << (i % 2 == 0 ? "even" : "odd") << "\n";
    } else {
      cout << number_to_string[i] << "\n";
    }
  }

  return 0;
}
