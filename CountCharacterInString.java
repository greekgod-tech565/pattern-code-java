String str = "apple and avocado are amazing animals";
int count = 0;
for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'a') {
        count++;
    }
}
System.out.println(count);
