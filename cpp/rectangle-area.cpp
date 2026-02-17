#include <iostream>

using namespace std;

class Rectangle {
public:
  int width, height;

  void display(void) { cout << this->width << ' ' << this->height << '\n'; }
};

class RectangleArea : public Rectangle {
public:
  void read_input(void) { cin >> this->width >> this->height; }

  void display(void) { cout << this->width * this->height << '\n'; }
};

int main() {
  /*
   * Declare a RectangleArea object
   */
  RectangleArea r_area;

  /*
   * Read the width and height
   */
  r_area.read_input();

  /*
   * Print the width and height
   */
  r_area.Rectangle::display();

  /*
   * Print the area
   */
  r_area.display();

  return 0;
}
