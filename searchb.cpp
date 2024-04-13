#include <iostream>
#include <vector>

using namespace std;

int binarySearch(const vector<int>& array, int search) {
    int first = 0;
    int last = array.size() - 1;

    while (first <= last) {
        int middle = (first + last) / 2;
        if (array[middle] == search) {
            return middle + 1; 
        } else if (array[middle] < search) {
            first = middle + 1;
        } else {
            last = middle - 1;
        }
    }
    return -1;
}

int main() {
    int search;
    vector<int> array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    cout << "Enter the number to search?" << endl;
    cin >> search;

    int result = binarySearch(array, search);
    if (result == -1) {
        cout << search << " Not present in the array." << endl;
    } else {
        cout << search << " is present at location " << result << endl;
    }

    return 0;
}
