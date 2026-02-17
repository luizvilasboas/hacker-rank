#include <iostream>
#include <sstream>
#include <vector>

using namespace std;

vector<int> parseInts(string str) {
  stringstream ss(str);

  vector<int> ret;
  string token;

  while (getline(ss, token, ',')) {
    ret.push_back(stoi(token));
  }

  return ret;
}

int main() {
  string str;

  cin >> str;

  vector<int> integers = parseInts(str);

  for (int i = 0; i < integers.size(); i++) {
    cout << integers[i] << "\n";
  }

  return 0;
}
