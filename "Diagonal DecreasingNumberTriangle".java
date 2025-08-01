int rows = 6;
int start = 1;

for (int i = 1; i <= rows; i++) {
    int val = start;
    int temp = val;

    for (int j = 1; j <= i; j++) {
        System.out.print(val + " ");
        val -= (rows - i + j);
    }

    System.out.println();
    start = temp + rows - (i - 1);
}
