#include <iostream>
#include <vector>

using namespace std;

int main() {
  int num_arrays, num_queries;
  cin >> num_arrays >> num_queries;

  vector<vector<int>> arr;

  for (int i = 0; i < num_arrays; i++) {
    int size;
    cin >> size;

    vector<int> mid_arr;

    for (int j = 0; j < size; j++) {
      int value;
      cin >> value;

      mid_arr.push_back(value);
    }

    arr.push_back(mid_arr);
  }

  for (int i = 0; i < num_queries; i++) {
    int index_arr, index_inside_arr;
    cin >> index_arr >> index_inside_arr;

    if (index_arr > num_arrays || index_arr < 0) {
      return 0;
    }

    if (index_inside_arr > arr[index_arr].size() - 1) {
      return 0;
    }

    cout << arr[index_arr][index_inside_arr] << endl;
  }

  return 0;
}
