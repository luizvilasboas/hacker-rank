#include <cstdio>

using namespace std;

/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
int max_of_four(int a, int b, int c, int d) {
  int numbers[4] = {a, b, c, d};
  int max_number = numbers[0];

  for (const auto &number : numbers) {
    if (number > max_number) {
      max_number = number;
    }
  }

  return max_number;
}

int main() {
  int a, b, c, d;
  scanf("%d %d %d %d", &a, &b, &c, &d);
  int ans = max_of_four(a, b, c, d);
  printf("%d", ans);

  return 0;
}
