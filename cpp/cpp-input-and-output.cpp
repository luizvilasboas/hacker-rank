#include <iostream>

using namespace std;

int main() {
  int nums[3];

  for (int i = 0; i < 3; i++) {
    cin >> nums[i];
  }

  int sum = 0;
  for (int num : nums) {
    sum += num;
  }

  cout << sum << endl;
  return 0;
}
