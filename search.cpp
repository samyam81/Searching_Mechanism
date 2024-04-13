#include <iostream>
#include <vector>

using namespace std;

int sequentialSearch(const vector<int>& array, int search) {
    for (int i = 0; i < array.size(); ++i) {
        if (array[i] == search) {
            return i + 1; // Adding 1 to convert to human-readable index
        }
    }
    return -1;
}

int main() {
    int search;
    vector<int> array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    cout << "Enter the number to search?" << endl;
    cin >> search;

    int result = sequentialSearch(array, search);
    if (result == -1) {
        cout << search << " Not present in the array." << endl;
    } else {
        cout << search << " is present at location " << result << endl;
    }

    return 0;
}
