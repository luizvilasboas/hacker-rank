#include <iostream>
#include <string>

class Student {

public:
  int age;
  int standard;
  std::string first_name;
  std::string last_name;

  void set_age(const int age) { this->age = age; }

  void set_standard(const int standard) { this->standard = standard; }

  void set_first_name(const std::string first_name) {
    this->first_name = first_name;
  }

  void set_last_name(const std::string last_name) {
    this->last_name = last_name;
  }

  int get_age(void) { return this->age; }

  int get_standard(void) { return this->standard; }

  std::string &get_first_name(void) { return this->first_name; }

  std::string &get_last_name(void) { return this->last_name; }

  std::string to_string(void) {
    return std::to_string(this->age) + "," + this->first_name + "," +
           this->last_name + "," + std::to_string(this->standard);
  }
};

int main() {
  int age, standard;
  std::string first_name, last_name;

  std::cin >> age >> first_name >> last_name >> standard;

  Student st;
  st.set_age(age);
  st.set_standard(standard);
  st.set_first_name(first_name);
  st.set_last_name(last_name);

  std::cout << st.get_age() << "\n";
  std::cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
  std::cout << st.get_standard() << "\n";
  std::cout << "\n";
  std::cout << st.to_string();

  return 0;
}
