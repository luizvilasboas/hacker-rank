#include <bits/stdc++.h>
#include <string>
#include <unordered_map>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

unordered_map<int, string> number_to_string = {
    {0, "zero"}, {1, "one"}, {2, "two"},   {3, "three"}, {4, "four"},
    {5, "five"}, {6, "six"}, {7, "seven"}, {8, "eight"}, {9, "nine"},
};

int main() {
  string n_temp;
  getline(cin, n_temp);

  int n = stoi(ltrim(rtrim(n_temp)));

  if (n > 9) {
    cout << "Greater than 9" << endl;
  } else {
    cout << number_to_string[n] << endl;
  }

  return 0;
}

string ltrim(const string &str) {
  string s(str);

  s.erase(s.begin(),
          find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace))));

  return s;
}

string rtrim(const string &str) {
  string s(str);

  s.erase(
      find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
      s.end());

  return s;
}
