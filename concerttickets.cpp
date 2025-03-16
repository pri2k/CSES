#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int price(vector<int>& tickets, int max) {
    int low = 0, high = tickets.size() - 1;
    int result = -1;

    while (low <= high) {
        int mid = (low + high) / 2;
        int num = tickets[mid];
        if (num <= max) {
            result = num;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    if (result != -1) {
        tickets.erase(remove(tickets.begin(), tickets.end(), result), tickets.end());
    }
    
    return result;
}

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    vector<int> tickets(n);
    vector<int> cust(m);
    
    for (int i = 0; i < n; i++) {
        scanf("%d", &tickets[i]);
    }

    int max = 0;
    for (int i = 0; i < m; i++) {
        scanf("%d", &cust[i]);
        max = std::max(max, cust[i]);
    }

    sort(tickets.begin(), tickets.end());

    for (int i = 0; i < m; i++) {
        cust[i] = price(tickets, cust[i]);
        printf("%d\n", cust[i]);
    }

    return 0;
}
