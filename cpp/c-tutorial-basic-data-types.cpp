#include <iomanip>
#include <iostream>

using namespace std;

int main() {
  int num;
  cin >> num;

  long long_num;
  cin >> long_num;

  char letter;
  cin >> letter;

  float real_number;
  cin >> real_number;

  double long_real_number;
  cin >> long_real_number;

  cout << num << "\n" << long_num << "\n" << letter << "\n";
  cout << fixed << setprecision(3) << real_number << "\n";
  cout << fixed << setprecision(9) << long_real_number << "\n";

  return 0;
}
